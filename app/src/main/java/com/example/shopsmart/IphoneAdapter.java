package com.example.shopsmart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class IphoneAdapter extends PagerAdapter {

    int [] images;
    LayoutInflater layoutInflater;
    Context context;

    public IphoneAdapter(int [] images, Context context){
        this.images = images;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View myImageLayout = layoutInflater.inflate(R.layout.iphone_image, container, false);
        ImageView imageView = myImageLayout.findViewById(R.id.imageView62);
        imageView.setImageDrawable(context.getDrawable(images[position]));
        container.addView(myImageLayout);
        return myImageLayout;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
