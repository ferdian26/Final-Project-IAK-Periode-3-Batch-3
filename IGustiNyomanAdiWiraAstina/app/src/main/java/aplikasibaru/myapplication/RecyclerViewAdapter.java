package aplikasibaru.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wahmang on 12/7/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Data> list = new ArrayList<>();

    public RecyclerViewAdapter(List<Data> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.itemview, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position), position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvkategori;
        ImageView ivlogo;

        public ViewHolder(View itemView) {
            super(itemView);
            tvkategori = itemView.findViewById(R.id.tvkategori);
            ivlogo = itemView.findViewById(R.id.ivlogo);
        }

        public void bind(final Data item, final int position) {
            tvkategori.setText(item.getTvkategori());
            ivlogo.setImageResource(item.getIvlogo());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), item.getTvkategori(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(itemView.getContext(), ActivityDetail.class);
                    intent.putExtra("position", position);

                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
