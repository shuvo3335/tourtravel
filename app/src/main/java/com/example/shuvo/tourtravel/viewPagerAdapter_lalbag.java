package com.example.shuvo.tourtravel;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class viewPagerAdapter_lalbag extends PagerAdapter {
    private Context context;
    private Integer [] images = {R.drawable.lalbag3,R.drawable.lalbag1,R.drawable.lalbag2
            ,R.drawable.lalbag3};

    viewPagerAdapter_lalbag(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.cox_custom_layout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView3);
        //Glide.with(context).load("https://bangladesh-traveling.000webhostapp.com/uploads/7b9558871545ae34c45e1df79f64a7f9.jpg").into(imageView);
        imageView.setImageResource(images[position]);
        ViewPager vp= (ViewPager) container;
        vp.addView(view,0);
        return  view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp =(ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
