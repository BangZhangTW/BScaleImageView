package com.RAI.BScaleImageView;

import android.app.Activity;
import android.os.Bundle;

import com.RAI.Class.BScaleImageView;
import com.RAI.Class.BitmapOptimize;

public class MainActivity extends Activity {
    BScaleImageView BSImg;
    BitmapOptimize BO = new BitmapOptimize(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BSImg = (BScaleImageView) findViewById(R.id.BSImg);
        BSImg.build_image(BO.getLocalBitmap(getApplicationContext(), R.drawable.guide_1));
    }
}
