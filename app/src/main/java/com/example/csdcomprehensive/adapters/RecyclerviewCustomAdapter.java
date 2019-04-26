package com.example.csdcomprehensive.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.csdcomprehensive.R;
import com.example.csdcomprehensive.models.note;

import java.util.List;

public class RecyclerviewCustomAdapter extends RecyclerView.Adapter<RecyclerviewCustomAdapter.ViewHolder> {

    List<note> items;
    Activity context;

    public RecyclerviewCustomAdapter(Activity context, List<note> items){
        this.items = items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Inflate view and create ViewHolder
        LayoutInflater inflater = context.getLayoutInflater();
        View v=inflater.inflate(R.layout.note, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        Use holder to bind values
        note item = items.get(position);
        holder.text.setText(item.getText());
    }

    @Override
    public int getItemCount() {
//        Return size of list
        return items.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder{
        TextView text ;
        public ViewHolder(View v) {
            super(v);
            text = v.findViewById(R.id.text);
        }
    }
}

