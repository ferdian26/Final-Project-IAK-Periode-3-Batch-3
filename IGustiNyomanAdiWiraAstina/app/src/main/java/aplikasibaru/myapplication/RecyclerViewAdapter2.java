package aplikasibaru.myapplication;

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
 * Created by wahmang on 12/9/2017.
 */

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder> {

    private List<DataBarang> list = new ArrayList<>();

    public RecyclerViewAdapter2(List<DataBarang> list) {
        this.list = list;
    }

    @Override
    public RecyclerViewAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewAdapter2.ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.listdata, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter2.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvnama;
        ImageView ivdatabarang;
        TextView tvkode;
        TextView tvtanggal;
        TextView tvjumlah;

        public ViewHolder(View itemView) {
            super(itemView);
            tvnama = itemView.findViewById(R.id.tvnama);
            ivdatabarang = itemView.findViewById(R.id.ivdatabarang);
            tvkode = itemView.findViewById(R.id.tvkode);
            tvtanggal = itemView.findViewById(R.id.tvtanggal);
            tvjumlah = itemView.findViewById(R.id.tvjumlah);
        }

        public void bind(final DataBarang item) {
            tvnama.setText("Nama Barang : " + item.getTvnama());
            ivdatabarang.setImageResource(item.getIvdatabarang());
            tvkode.setText("Kode barang : " + item.getTvkode());
            tvjumlah.setText("Jumlah Barang : " + item.getTvjumlah());
            tvtanggal.setText("Tgl Kadaluarsa : " + item.getTvtanggal());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), item.getTvnama(), Toast.LENGTH_SHORT).show();

                    // todo 10: tidak perlu intent lagi ke activity detail, karna akan looping terus
                    //Intent intent = new Intent(itemView.getContext(), ActivityDetail.class);
                    //itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}

