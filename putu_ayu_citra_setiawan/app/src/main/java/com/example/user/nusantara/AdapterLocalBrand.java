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
 * Created by User on 07/12/2017.
 */

public class AdapterLocalBrand extends RecyclerView.Adapter<AdapterLocalBrand.ViewHolder> {

    private List<DataLocalBrand> list;

    public AdapterLocalBrand(List<DataLocalBrand> list){
        this.list = list;
    }

    public void replaceAll(List<DataLocalBrand> item){
        list = item;
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.menu_list_localbrand,parent,false
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

        TextView txt_namalocalbrand, txt_idlocalbrand, txt_namadaerah;
        ImageView gbr_localbrand;

        public ViewHolder(View itemView) {
            super(itemView);

            txt_idlocalbrand = (TextView) itemView.findViewById(R.id.txt_idlocalbrand);
            txt_namalocalbrand = (TextView) itemView.findViewById(R.id.txt_namalocalbrand);
            txt_namadaerah = (TextView) itemView.findViewById(R.id.txt_namadaerah);
            gbr_localbrand = (ImageView) itemView.findViewById(R.id.gambar_localbrand);
        }

        public void bind(final DataLocalBrand item) {
            txt_idlocalbrand.setText(item.getIdlocalbrand());
            txt_namalocalbrand.setText(item.getNamalocalbrand());
            txt_namadaerah.setText(item.getNamadaerah());
            gbr_localbrand.setImageResource(item.getGbr_localbrand());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(itemView.getContext(), item.getNamalocalbrand(), Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);

                    intent.putExtra("id",item.getIdlocalbrand());
                    intent.putExtra("title",item.getNamalocalbrand());
                    intent.putExtra("subtitle",item.getNamadaerah());
                    intent.putExtra("idgbr",item.getGbr_localbrand());

                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
