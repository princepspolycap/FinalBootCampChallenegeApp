package com.example.polycap.finalbootcampchallenegeapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.polycap.finalbootcampchallenegeapp.Details.DetailsActivity;

import java.util.ArrayList;

/**
 * Created by Polycap on 7/20/2015.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{
    private final Context context;
    private final ArrayList<list>lists;

    public MainAdapter(Activity context, ArrayList<list>lists) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.title.setText(lists.get(position).getTitle());
        holder.desc.setText(lists.get(position).getDesc());
        holder.row.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        TextView title;
        View row;
        TextView desc;

        public ViewHolder(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            desc = (TextView) v.findViewById(R.id.desc);
            row = v.findViewById(R.id.row_layout);
        }


        @Override
        public void onClick(View view) {
view.getContext().startActivity(new Intent(view.getContext(), DetailsActivity.class));

        }
    }
}
