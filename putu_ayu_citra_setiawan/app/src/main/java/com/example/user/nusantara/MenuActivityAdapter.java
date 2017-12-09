package com.example.user.nusantara;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by User on 05/12/2017.
 */

public class MenuActivityAdapter extends RecyclerView.Adapter<MenuActivityAdapter.ViewHolder> {

    private List<DataEvent> list;
    public MenuActivityAdapter(List<DataEvent> list){
        this.list = list;
    }


    public void replaceAll(List<DataEvent> item){
        list = item;
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.menu_list_event,parent,false
                )
        );
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id_culture,txt_namaevent,txt_namadaerah;
        ImageView gbr_event;

        public ViewHolder(View itemView) {
            super(itemView);

            id_culture = (TextView) itemView.findViewById(R.id.id_culture);
            txt_namaevent = (TextView) itemView.findViewById(R.id.txt_namaevent);
            txt_namadaerah = (TextView) itemView.findViewById(R.id.txt_namadaerah);
            gbr_event = (ImageView) itemView.findViewById(R.id.gambar_event);
        }


        public void bind(final DataEvent item){
            id_culture.setText(item.getId_culture());
            txt_namaevent.setText(item.getNamaevent());
            txt_namadaerah.setText(item.getNamadaerah());
            gbr_event.setImageResource(item.getGbr_event());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(itemView.getContext(), item.getNamaevent(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);

                    intent.putExtra("id",item.getId_culture());
                    intent.putExtra("title",item.getNamaevent());
                    intent.putExtra("subtitle",item.getNamadaerah());
                    intent.putExtra("idgbr",item.getGbr_event());

                    itemView.getContext().startActivity(intent);
                }
            });
        }


    }



}
