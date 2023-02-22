package com.example.comicsproject.kkline.model.banner;

import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.comicsproject.kkline.bean.home.Banner_list;

import java.util.List;

public class BannerAdapter extends com.youth.banner.adapter.BannerAdapter<Banner_list, BannerAdapter.BannerViewHolder> {

    public BannerAdapter(List<Banner_list> datas) {
        super(datas);
    }

    @Override
    public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(parent.getContext());
        //注意，必须设置为match_parent，这个是viewpager2强制要求的
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return new BannerViewHolder(imageView);
    }

    @Override
    public void onBindView(BannerViewHolder holder, Banner_list data, int position, int size) {
        Glide.with(holder.itemView)
                .load(data.getImage())
                .transform(new BannerTransformation())
                .into(holder.imageView);
    }

    class BannerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public BannerViewHolder(@NonNull ImageView itemView) {
            super(itemView);
            this.imageView = itemView;
        }
    }
}
