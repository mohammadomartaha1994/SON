package com.sequence.mohammad.sequenceofnumbers;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 5/3/2017.
 */

public class Num_One extends Fragment implements View.OnClickListener {

    Button first,second,third,fourth,fifth,sixth;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.num_one, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MobileAds.initialize(getActivity(), "ca-app-pub-1661339085652575/5529845664");
        AdView mAdView = (AdView)getActivity().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        final InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);


        first = (Button)getActivity().findViewById(R.id.second);
        second = (Button)getActivity().findViewById(R.id.first);
        third = (Button)getActivity().findViewById(R.id.fourth);
        fourth = (Button)getActivity().findViewById(R.id.third);
        fifth = (Button)getActivity().findViewById(R.id.sixth);
        sixth = (Button)getActivity().findViewById(R.id.fifth);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("key","first");

                Num_Tow fragment = new Num_Tow();
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                bundle.putString("key","second");
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                bundle.putString("key","third");
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                bundle.putString("key","fourth");
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                bundle.putString("key","fifth");
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                bundle.putString("key","sixth");
                fragment.setArguments(bundle);

                final TextView num1 = (TextView)getActivity().findViewById(R.id.number1);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number2);
                if (Build.VERSION.SDK_INT >= 23) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                else {
                    num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                    num2.setTextColor(Color.parseColor("#01c1d4"));
                    num1.setBackground(getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#F5F5F5"));
                }
                getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

            }
        });

    }
    @Override
    public void onClick(View v) {
    }

}
