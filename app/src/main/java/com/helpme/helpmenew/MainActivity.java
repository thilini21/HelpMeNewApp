package com.helpme.helpmenew;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private Button mBsckBtn;

    private TextView[] mDots;

    private SlideAdapter sliderAdapter;


    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        mBsckBtn = (Button) findViewById(R.id.BckBtn);


        mBsckBtn.setOnClickListener(this);

        sliderAdapter = new SlideAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);

    }

    public void addDotsIndicator(int position){

        mDots = new TextView[5];
        mDotLayout.removeAllViews();

        for (int i=0; i < mDots.length; i++)
        {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayout.addView(mDots[i]);
        }

        if (mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));

        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);

            mCurrentPage=i;


        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }


    };

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.BckBtn:
                loadHome();
                break;
        }
    }

    private void loadHome()
    {
        startActivity(new Intent(this, ServiceProvActivity.class));
        finish();
    }
}
