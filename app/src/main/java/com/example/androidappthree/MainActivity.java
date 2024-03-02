package com.example.androidappthree;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView ivPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPreview = (ImageView) findViewById(R.id.ivPreview);
        }
    @SuppressLint("NonConstantResourceId")
    public void changeImage(View v) {
        switch (v.getId()) {
            case R.id.iv_elsa:
                ivPreview.setBackgroundResource(R.drawable.lollipop);
                break;
            case R.id.iv_anna:
                ivPreview.setBackgroundResource(R.drawable.marshmallow);
                break;
            case R.id.iv_olaf:
                ivPreview.setBackgroundResource(R.drawable.nougat);
                break;
        }
    }

}
