package com.niec.innoviz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.niec.innoviz.Frags.DataProvider;

import java.util.ArrayList;



/**
 * Created by PROPHET on 07-03-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

public Context context;
    public RecyclerAdapter(ArrayList<DataProvider> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context=context;
    }

    private ArrayList<DataProvider> arrayList = new ArrayList<DataProvider>();

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /********************Change this if not working************************/
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card_view, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        final DataProvider dataProvider = arrayList.get(position);
        holder.imageView.setImageResource(dataProvider.getImg_res());








        final int a=dataProvider.getImg_res();
                ImageView i;
        holder.e_name.setText(dataProvider.getE_name());
        holder.e_desc.setText(dataProvider.getE_desc());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView e_name, e_desc;
        public View v;

        public RecyclerViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.imageViewCard);
            e_desc = (TextView) view.findViewById(R.id.textViewDesc);
            e_name = (TextView) view.findViewById(R.id.textViewName);


    }

}}
