package example.com.oticket;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by user on 12/3/2017.
 */

public class TicketAdapter extends RecyclerView.Adapter<TicketAdapter.ViewHolder> {

    private List<MovieData> list;

    public TicketAdapter(List<MovieData> list){
        this.list = list;
        notifyDataSetChanged();
    }

    public void replaceAll(List<MovieData> item){
        list = item;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
            LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_list, parent, false
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

        TextView tv_menu_name, genre, time, price;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_menu_name = (TextView) itemView.findViewById(R.id.tv_menu_name);
            genre = (TextView) itemView.findViewById(R.id.genre);
            time = (TextView) itemView.findViewById(R.id.time);
            price = (TextView) itemView.findViewById(R.id.tv_menu_price);
        }

        public void bind(final MovieData item){
            tv_menu_name.setText(item.getName());
            genre.setText(item.getGenre());
            time.setText(item.getTime());
            price.setText(item.getPrice());

            itemView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                Toast.makeText(itemView.getContext(), item.getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(itemView.getContext(), Transaction.class);
//                intent.putExtra("name", item.getName());
//                intent.putExtra("genre", item.getGenre());
//                intent.putExtra("time", item.getTime());
//                intent.putExtra("price", item.getPrice());
                    MainActivity.title = item.getName();
                    MainActivity.genre = item.getGenre();
                    MainActivity.time = item.getTime();
                    MainActivity.price = Integer.parseInt(item.getPrice());

                itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
