package com.example.shuvo.tourtravel;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class viewPagerAdapterAFM extends PagerAdapter {
    private Context context;
    private Integer [] images = {R.drawable.baf03,R.drawable.baf,R.drawable.baf02,R.drawable.baf_gate,R.drawable.baf04,R.drawable.baf05,R.drawable.airforce_3,R.drawable.airforce_1,R.drawable.airforce_4,R.drawable.airforce_5};

    viewPagerAdapterAFM(Context context){
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
