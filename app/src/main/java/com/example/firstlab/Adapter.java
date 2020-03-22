package com.example.firstlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstlab.R;

public class Adapter extends  RecyclerView.Adapter<Adapter.NumberViewHolder> {

    LayoutInflater inflater;

    public class NumberViewHolder extends RecyclerView.ViewHolder{

        final TextView text;
        final TextView number;
        final ImageView imageView;
        final LinearLayout layoutInside;
        final LinearLayout layoutOutside;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.tv_number_item);
            number = itemView.findViewById(R.id.number);
            imageView = itemView.findViewById(R.id.image);
            layoutInside = itemView.findViewById(R.id.layoutInside);
            layoutOutside = itemView.findViewById(R.id.layoutOutside);
        }
    }

    //конструктор
    public Adapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.layout, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.NumberViewHolder holder, int position) {
        holder.text.setText(IntoWord.retranslate(position + 1));
        holder.number.setText(Integer.toString(position + 1));
        if ((position + 1) % 2 == 0)
            holder.layoutOutside.setBackgroundColor(0xCCCCCCCC);
        else
            holder.layoutOutside.setBackgroundColor(0xFFFFFFFF);

    }

    @Override
    public int getItemCount() {
        return 1000000;
    }




}
