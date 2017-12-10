package com.example.user.nusantara;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by User on 06/12/2017.
 */

public class AdapterCraftsmen extends RecyclerView.Adapter<AdapterCraftsmen.ViewHolder> {

    private List<DataCraftsmen> list;
    public AdapterCraftsmen(List<DataCraftsmen> list){
        this.list = list;
    }

    public void replaceAll(List<DataCraftsmen> item){
        list = item;
        notifyDataSetChanged();
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.menu_list_craftsmen,parent,false
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

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_namacraftsmen,txt_namadaerah,txt_kerajinan,id_craftsmen;
        ImageView gbr_kerajinan;


        public ViewHolder(View itemView) {
            super(itemView);

            id_craftsmen = (TextView) itemView.findViewById(R.id.id_craftsmen);
            txt_namacraftsmen = (TextView) itemView.findViewById(R.id.txt_namacraftsmen);
            txt_namadaerah = (TextView) itemView.findViewById(R.id.txt_namadaerah);
            txt_kerajinan = (TextView) itemView.findViewById(R.id.txt_kerajinan);
            gbr_kerajinan = (ImageView) itemView.findViewById(R.id.gambar_kerajinan);
        }


        public void bind(final DataCraftsmen item) {
            id_craftsmen.setText(item.getId_craftsmen());
            txt_namacraftsmen.setText(item.getNama_craftsmen());
            txt_namadaerah.setText(item.getNamadaerah());
            txt_kerajinan.setText(item.getKerajinan());
            gbr_kerajinan.setImageResource(item.getGbr_kerajinan());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(itemView.getContext(), item.getNama_craftsmen(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);

                    intent.putExtra("id",item.getId_craftsmen());
                    intent.putExtra("title",item.getNama_craftsmen());
                    intent.putExtra("subtitle",item.getNamadaerah());
                    intent.putExtra("idgbr",item.getGbr_kerajinan());

                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
