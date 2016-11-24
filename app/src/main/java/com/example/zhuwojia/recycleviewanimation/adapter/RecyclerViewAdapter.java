package com.example.zhuwojia.recycleviewanimation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zhuwojia.recycleviewanimation.R;
import com.example.zhuwojia.recycleviewanimation.bean.Pictures;

import java.util.List;

/**
 * Created by zhuwojia on 2016/11/24.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Pictures.DataBean> list;
    private LayoutInflater inflater;
    private Animation animation;

    public RecyclerViewAdapter(Context context, List<Pictures.DataBean> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
        animation = AnimationUtils.loadAnimation(context, R.anim.anim_entry);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_recycler, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageView.startAnimation(animation);
        holder.textView.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getPic_url()).placeholder(R.mipmap.error).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
