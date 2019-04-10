package com.example.shuvo.tourtravel;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class viewPagerAdapterLibaration extends PagerAdapter {
    private Context context;
    private Integer [] images = {R.drawable.police,R.drawable.police_gate1,R.drawable.police_fate,R.drawable.police3,R.drawable.police4,R.drawable.police6,R.drawable.police_1,R.drawable.piloce5};

    viewPagerAdapterLibaration(Context context){
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
        View view = layoutInflater.inflate(R.layout.air_force_custom_layout,null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView3);
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
