package com.mahendra.mykost;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MAHENDRA on 12/8/2017.
 */

public class KostAdapter extends RecyclerView.Adapter<KostAdapter.KostHolder> {

    // todo 4: context tidak digunakan dimanapun, sebaiknya variabel ini di non-aktifkan
    //Context context;

    List<Kost> item;

    public KostAdapter(List<Kost> item) {
        //this.context = context;
        this.item = item;
    }

    @Override
    public KostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        return new KostHolder(v);
    }

    @Override
    public void onBindViewHolder(KostHolder holder, final int position) {

        holder.imageItem.setImageResource(item.get(position).getImage());
        holder.txtname.setText(item.get(position).getName());
        holder.txtprice.setText(item.get(position).getPrice());
        holder.txtaddress.setText(item.get(position).getAddress());
        holder.txtdeskripsi.setText(item.get(position).getDeskripsi());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);

                i.putExtra("id_image", item.get(position).getImage());
                i.putExtra("id_name", item.get(position).getName());
                i.putExtra("id_prace", item.get(position).getPrice());
                i.putExtra("id_address", item.get(position).getAddress());
                i.putExtra("id_detailkost", item.get(position).getDeskripsi());

                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class KostHolder extends RecyclerView.ViewHolder {

        LinearLayout linearLayout;
        ImageView imageItem;
        TextView txtname, txtprice, txtaddress, txtdeskripsi;

        public KostHolder(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.ln_detaildeskripsi);
            imageItem = (ImageView) itemView.findViewById(R.id.item_image);
            txtname = (TextView) itemView.findViewById(R.id.tv_nm_name);
            txtprice = (TextView) itemView.findViewById(R.id.tv_nm_price);
            txtaddress = (TextView) itemView.findViewById(R.id.tv_nm_address);
            txtdeskripsi = (TextView) itemView.findViewById(R.id.tv_nm_deskripsi);
        }
    }
}
