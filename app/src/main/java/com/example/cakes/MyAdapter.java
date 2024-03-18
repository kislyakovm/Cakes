package com.example.cakes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cakes.model.Cake;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    private List<Cake> cakesList;

    public MyAdapter(Context context, List<Cake> cakesList) {
        this.context = context;
        this.cakesList = cakesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cakeItems = LayoutInflater.from(context)
                .inflate(R.layout.item_layout, parent, false);
        return new MyAdapter.MyViewHolder(cakeItems);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int imageId = context.getResources().getIdentifier(cakesList.get(position).getImageView(), "drawable", context.getPackageName());
        holder.imageView.setImageResource(imageId);
        holder.textView.setText(String.valueOf(cakesList.get(position).getAverageRating()));
    }

    @Override
    public int getItemCount() {
        return cakesList.size();
    }

    public static final class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cakeImageView);
            textView = itemView.findViewById(R.id.averageRatingText);
        }
    }

}
