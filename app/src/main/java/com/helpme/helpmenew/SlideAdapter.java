package com.helpme.helpmenew;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SlideAdapter extends PagerAdapter{

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter (Context context) {

        this.context = context;
    }

    //Arrays
    public int[] slide_images = {

            R.drawable.mech,
            R.drawable.repairing,
            R.drawable.carrescueservice,
            R.drawable.taxio
    };

    public String[] slide_headings = {

            "MECHANIC",
            "VEHICLE REPAIRING CENTRE",
            "RESCUE VEHICLE",
            "TAXI"
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);


        container.addView(view);

        return view;

    }


    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {

        container.removeView((RelativeLayout)object);
    }
}






