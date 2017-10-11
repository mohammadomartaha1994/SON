package com.sequence.mohammad.sequenceofnumbers;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class sequence extends AppCompatActivity {

    private int PICK_IMAGE_REQUEST = 1;

    DBManager dbManager;
    InterstitialAd interAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sequence);

        Num_One fragment = new Num_One();
        getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

        final TextView num1 = (TextView)findViewById(R.id.number1);
        final TextView num2 = (TextView)findViewById(R.id.number2);
        final TextView num3 = (TextView)findViewById(R.id.number3);
//        num1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= 23) {
//                    num1.setBackground(getDrawable(R.drawable.shape_));
//                    num1.setTextColor(Color.parseColor("#01c1d4"));
//                    num2.setBackground(getDrawable(R.drawable.shape));
//                    num2.setTextColor(Color.parseColor("#F5F5F5"));
//                    num3.setBackground(getDrawable(R.drawable.shape));
//                    num3.setTextColor(Color.parseColor("#F5F5F5"));
//                }
//                else {
//                    num1.setBackground(getResources().getDrawable(R.drawable.shape_));
//                    num1.setTextColor(Color.parseColor("#01c1d4"));
//                    num2.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num2.setTextColor(Color.parseColor("#F5F5F5"));
//                    num3.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num3.setTextColor(Color.parseColor("#F5F5F5"));
//                }
//                Num_One fragment = new Num_One();
//                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
//
//            }
//        });
//
//        num2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= 23) {
//                    num2.setBackground(getDrawable(R.drawable.shape_));
//                    num2.setTextColor(Color.parseColor("#01c1d4"));
//                    num1.setBackground(getDrawable(R.drawable.shape));
//                    num1.setTextColor(Color.parseColor("#F5F5F5"));
//                    num3.setBackground(getDrawable(R.drawable.shape));
//                    num3.setTextColor(Color.parseColor("#F5F5F5"));
//
//                }
//                else {
//                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
//                    num2.setTextColor(Color.parseColor("#01c1d4"));
//                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num1.setTextColor(Color.parseColor("#F5F5F5"));
//                    num3.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num3.setTextColor(Color.parseColor("#F5F5F5"));
//
//                }
//                Num_Tow fragment = new Num_Tow();
//                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
//            }
//        });
//
//        num3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Build.VERSION.SDK_INT >= 23) {
//                    num3.setBackground(getDrawable(R.drawable.shape_));
//                    num3.setTextColor(Color.parseColor("#01c1d4"));
//                    num1.setBackground(getDrawable(R.drawable.shape));
//                    num1.setTextColor(Color.parseColor("#F5F5F5"));
//                    num2.setBackground(getDrawable(R.drawable.shape));
//                    num2.setTextColor(Color.parseColor("#F5F5F5"));
//                }
//                else {
//                    num3.setBackground(getResources().getDrawable(R.drawable.shape_));
//                    num3.setTextColor(Color.parseColor("#01c1d4"));
//                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num1.setTextColor(Color.parseColor("#F5F5F5"));
//                    num2.setBackground(getResources().getDrawable(R.drawable.shape));
//                    num2.setTextColor(Color.parseColor("#F5F5F5"));
//                }
//                Num_Three fragment = new Num_Three();
//                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
//            }
//        });




    }

}
