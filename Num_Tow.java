package com.sequence.mohammad.sequenceofnumbers;

import android.app.Fragment;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by mohammad on 5/3/2017.
 */

public class Num_Tow extends Fragment implements View.OnClickListener {
    String key ;
    ImageView backButton;
    DBManager dbManager;
    String numberToTest;
    TextView num1,num2,num3,num4,num5,num6,num7,num8,num9;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.num_tow, container, false);
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
        dbManager=new DBManager(getActivity());

        num1=(TextView)getActivity().findViewById(R.id.first2);
        num2=(TextView)getActivity().findViewById(R.id.second2);
        num3=(TextView)getActivity().findViewById(R.id.third2);
        num4=(TextView)getActivity().findViewById(R.id.fourth2);
        num5=(TextView)getActivity().findViewById(R.id.fifth2);
        num6=(TextView)getActivity().findViewById(R.id.sixth2);
        num7=(TextView)getActivity().findViewById(R.id.seventh2);
        num8=(TextView)getActivity().findViewById(R.id.eighth2);
        num9=(TextView)getActivity().findViewById(R.id.ninth2);

        key="first";
        Bundle bundle = this.getArguments();
        if(bundle != null){
            key=bundle.getString("key");
        }


        if (key=="first"){

            if (Build.VERSION.SDK_INT >= 23) {


                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    num1.setBackground(getActivity().getDrawable(R.drawable.one));
                    num1.setTextColor(Color.parseColor("#ead268"));

                }
                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.one));
                    num2.setTextColor(Color.parseColor("#ead268"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getDrawable(R.drawable.one));
                    num3.setTextColor(Color.parseColor("#ead268"));
                }


                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.one));
                    num4.setTextColor(Color.parseColor("#ead268"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.one));
                    num5.setTextColor(Color.parseColor("#ead268"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.one));
                    num6.setTextColor(Color.parseColor("#ead268"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.one));
                    num7.setTextColor(Color.parseColor("#ead268"));
                }




                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.one));
                    num8.setTextColor(Color.parseColor("#ead268"));
                }




                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.oneone));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.one));
                    num9.setTextColor(Color.parseColor("#ead268"));
                }
            }
            else {

                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")){
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num1.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")){
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num2.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")){
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num3.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")){
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num4.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")){
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num5.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")){
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num6.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")){
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num7.setTextColor(Color.parseColor("#ead268"));
                }



                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")){
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num8.setTextColor(Color.parseColor("#ead268"));
                }




                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.oneone));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")){
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.one));
                    num9.setTextColor(Color.parseColor("#ead268"));
                }




            }

        }
        else if (key=="second"){

            if (Build.VERSION.SDK_INT >= 23) {

                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num1.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num2.setTextColor(Color.parseColor("#f78f8f"));
                }


                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num3.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num4.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num5.setTextColor(Color.parseColor("#f78f8f"));
                }


                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num6.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num7.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num8.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.towtwo));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.tow));
                    num9.setTextColor(Color.parseColor("#f78f8f"));
                }

            }
            else {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num1.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num2.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num3.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num4.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num5.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num6.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num7.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num8.setTextColor(Color.parseColor("#f78f8f"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.towtwo));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.tow));
                    num9.setTextColor(Color.parseColor("#f78f8f"));
                }
            }

        }
        else if (key=="third"){

            if (Build.VERSION.SDK_INT >= 23) {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getDrawable(R.drawable.there));
                    num1.setTextColor(Color.parseColor("#7ebf59"));
                }


                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.there));
                    num2.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getDrawable(R.drawable.there));
                    num3.setTextColor(Color.parseColor("#7ebf59"));
                }


                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.there));
                    num4.setTextColor(Color.parseColor("#7ebf59"));
                }


                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.there));
                    num5.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.there));
                    num6.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.there));
                    num7.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.there));
                    num8.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.therethere));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.there));
                    num9.setTextColor(Color.parseColor("#7ebf59"));
                }
            }
            else {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num1.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num2.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num3.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num4.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num5.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num6.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num7.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num8.setTextColor(Color.parseColor("#7ebf59"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.therethere));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.there));
                    num9.setTextColor(Color.parseColor("#7ebf59"));
                }
            }

        }
        else if (key=="fourth"){

            if (Build.VERSION.SDK_INT >= 23) {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getDrawable(R.drawable.four));
                    num1.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.four));
                    num2.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getDrawable(R.drawable.four));
                    num3.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.four));
                    num4.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.four));
                    num5.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.four));
                    num6.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.four));
                    num7.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.four));
                    num8.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.fourfour));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.four));
                    num9.setTextColor(Color.parseColor("#25ade9"));
                }
            }
            else {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num1.setTextColor(Color.parseColor("#25ade9"));
                }


                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num2.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num3.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num4.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num5.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num6.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num7.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num8.setTextColor(Color.parseColor("#25ade9"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.fourfour));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.four));
                    num9.setTextColor(Color.parseColor("#25ade9"));
                }
            }

        }
        else if (key=="fifth"){

            if (Build.VERSION.SDK_INT >= 23) {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num1.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num2.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num3.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num4.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num5.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num6.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num7.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num8.setTextColor(Color.parseColor("#D2691E"));
                }

                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.fiffif));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.fif));
                    num9.setTextColor(Color.parseColor("#D2691E"));
                }

            }
            else {
                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num1.setTextColor(Color.parseColor("#D2691E"));
                }



                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num2.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num3.setTextColor(Color.parseColor("#D2691E"));
                }



                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num4.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num5.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num6.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num7.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num8.setTextColor(Color.parseColor("#D2691E"));
                }


                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.fiffif));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.fif));
                    num9.setTextColor(Color.parseColor("#D2691E"));
                }
            }

        }
        else if (key=="sixth"){

            if (Build.VERSION.SDK_INT >= 23) {

                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getDrawable(R.drawable.six));
                    num1.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getDrawable(R.drawable.six));
                    num2.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                num3.setBackground(getActivity().getDrawable(R.drawable.six));
                num3.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getDrawable(R.drawable.six));
                    num4.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getDrawable(R.drawable.six));
                    num5.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getDrawable(R.drawable.six));
                    num6.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getDrawable(R.drawable.six));
                    num7.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getDrawable(R.drawable.six));
                    num8.setTextColor(Color.parseColor("#7c7670"));
                }


                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.sixsix));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getDrawable(R.drawable.six));
                    num9.setTextColor(Color.parseColor("#7c7670"));
                }



            }
            else {

                if (LoadExamElement("n1",key).equals("true")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n1",key).equals("next")) {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num1.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num1.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num1.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n2",key).equals("true")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n2",key).equals("next")) {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num2.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num2.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num2.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n3",key).equals("true")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n3",key).equals("next")) {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num3.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num3.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num3.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n4",key).equals("true")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n4",key).equals("next")) {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num4.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num4.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num4.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n5",key).equals("true")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n5",key).equals("next")) {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num5.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num5.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num5.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n6",key).equals("true")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n6",key).equals("next")) {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num6.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num6.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num6.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n7",key).equals("true")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n7",key).equals("next")) {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num7.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num7.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num7.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n8",key).equals("true")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n8",key).equals("next")) {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num8.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num8.setBackground(getActivity().getResources().getDrawable(R.drawable.six));
                    num8.setTextColor(Color.parseColor("#7c7670"));
                }



                if (LoadExamElement("n9",key).equals("true")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else if (LoadExamElement("n9",key).equals("next")) {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.shape));
                    num9.setTextColor(Color.parseColor("#ffffff"));
                }
                else {
                    num9.setBackground(getActivity().getResources().getDrawable(R.drawable.sixsix));
                    num9.setTextColor(Color.parseColor("#7c7670"));
                }
            }

        }

        backButton = (ImageView) getActivity().findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num_One fragment = new Num_One();
                Bundle bundle = new Bundle();
                fragment.setArguments(bundle);
                bundle.putString("key","sixth");
                final TextView num1 = (TextView)getActivity().findViewById(R.id.number2);
                final TextView num2 = (TextView)getActivity().findViewById(R.id.number1);
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

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n1",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n1");

                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
                }
                else

                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();


            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n2",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n2");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

                }else
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();


            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n3",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n3");

                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

                }else
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();


            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n4",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n4");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

                }
                else
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();

            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TestLoadExamElement("n5",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n5");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
                }
                else
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();

            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n6",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n6");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
                }
                else

                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();

            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n7",key)) {

                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n7");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);
                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }
                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();

                }
                else
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();

            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n8",key)) {
                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key", key);
                    bundle.putString("number", "n8");


                    final TextView num1 = (TextView) getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView) getActivity().findViewById(R.id.number3);


                    if (Build.VERSION.SDK_INT >= 23) {
                        num2.setBackground(getActivity().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getActivity().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    } else {
                        num2.setBackground(getResources().getDrawable(R.drawable.shape_));
                        num2.setTextColor(Color.parseColor("#01c1d4"));
                        num1.setBackground(getResources().getDrawable(R.drawable.shape));
                        num1.setTextColor(Color.parseColor("#F5F5F5"));
                    }


                    getFragmentManager().beginTransaction().replace(R.id.content_sequence, fragment).commit();
                }
                else
                    Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();


            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement("n9",key)){
                    Num_Three fragment = new Num_Three();
                    Bundle bundle = new Bundle();
                    fragment.setArguments(bundle);
                    bundle.putString("key",key);
                    bundle.putString("number","n9");


                    final TextView num1 = (TextView)getActivity().findViewById(R.id.number2);
                    final TextView num2 = (TextView)getActivity().findViewById(R.id.number3);
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
                else
                    Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();

            }
        });
    }
    @Override
    public void onClick(View v) {

    }

    String LoadExamElement(String number,String key) {
        Cursor cursor = dbManager.query(null," TypeName='"+key+"' AND Type='"+number+"' ", null, DBManager.ColID);
        String x="x";
        if (cursor.moveToFirst()) {
            do {
                //cursor.getString(cursor.getColumnIndex(DBManager.ColID));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColType));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColSeq));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColSol));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColTypeName));
                x=cursor.getString(cursor.getColumnIndex(DBManager.ColTF));

            } while (cursor.moveToNext());

        }
        return x;
    }


    boolean TestLoadExamElement(String number,String key) {
        Cursor cursor = dbManager.query(null," TypeName='"+key+"' AND Type='"+number+"' ", null, DBManager.ColID);
        String x="x";
        if (cursor.moveToFirst()) {
            do {
                //cursor.getString(cursor.getColumnIndex(DBManager.ColID));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColType));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColSeq));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColSol));
                //cursor.getString(cursor.getColumnIndex(DBManager.ColTypeName));
                x=cursor.getString(cursor.getColumnIndex(DBManager.ColTF));

            } while (cursor.moveToNext());

        }
        if (x.equals("false"))
        return false;
        else
            return true;
    }

}