package com.sequence.mohammad.sequenceofnumbers;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad on 5/3/2017.
 */


public class Num_Three extends Fragment implements View.OnClickListener {
    ImageView backButton;
    String key,number,solution;
    DBManager dbManager;
    Button next;
    TextView seq;
    String n,ColTF;
    int numberOfNextId;
    EditText theNumber;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.num_three, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MobileAds.initialize(getActivity(), "ca-app-pub-1661339085652575/5529845664");
        AdView mAdView = (AdView)getActivity().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        dbManager=new DBManager(getActivity());
        seq=(TextView)getActivity().findViewById(R.id.seq);
        theNumber = (EditText)getActivity().findViewById(R.id.theNumber);
        key="first";
        solution="null";
        number="n1";
        Bundle bundle = this.getArguments();
        if(bundle != null){
            key=bundle.getString("key");
            number=bundle.getString("number");
        }

        //if (key) theNumber seq
        if (key=="first"){
            theNumber.setTextColor(Color.parseColor("#ead268"));
            seq.setTextColor(Color.parseColor("#ead268"));
        }
        else if (key=="second"){
            theNumber.setTextColor(Color.parseColor("#f78f8f"));
            seq.setTextColor(Color.parseColor("#f78f8f"));
        }
        else if (key=="third"){
            theNumber.setTextColor(Color.parseColor("#7ebf59"));
            seq.setTextColor(Color.parseColor("#7ebf59"));
        }
        else if (key=="fourth"){
            theNumber.setTextColor(Color.parseColor("#25ade9"));
            seq.setTextColor(Color.parseColor("#25ade9"));
        }
        else if (key=="fifth"){
            theNumber.setTextColor(Color.parseColor("#D2691E"));
            seq.setTextColor(Color.parseColor("#D2691E"));
        }
        else if (key=="sixth"){
            theNumber.setTextColor(Color.parseColor("#7c7670"));
            seq.setTextColor(Color.parseColor("#7c7670"));
        }



        backButton = (ImageView) getActivity().findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num_Tow fragment = new Num_Tow();
                Bundle bundle = new Bundle();
                fragment.setArguments(bundle);
                bundle.putString("key",key);
                final TextView num1 = (TextView)getActivity().findViewById(R.id.number3);
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

        LoadExamElement();

        next = (Button)getActivity().findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TestLoadExamElement(number, key)) {


                    if (theNumber.getText().toString().equals(solution)) {


                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);


                        LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                        final View promptView = layoutInflater.inflate(R.layout.dialogdate, null);
                        final AlertDialog alertD = new AlertDialog.Builder(getActivity()).create();
                        Button Done = (Button) promptView.findViewById(R.id.button);
                        TextView text = (TextView) promptView.findViewById(R.id.text);
                        text.setText("The answer : " + solution);
                        Done.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                               if (number.equals("n9")){


                                   Num_One fragment = new Num_One();
                                   Bundle bundle = new Bundle();
                                   fragment.setArguments(bundle);
                                   bundle.putString("key", key);
                                   final TextView num1 = (TextView) getActivity().findViewById(R.id.number3);
                                   final TextView num2 = (TextView) getActivity().findViewById(R.id.number1);
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

                                   alertD.dismiss();



                               }
                                else{

                                   Num_Tow fragment = new Num_Tow();
                                   Bundle bundle = new Bundle();
                                   fragment.setArguments(bundle);
                                   bundle.putString("key", key);
                                   final TextView num1 = (TextView) getActivity().findViewById(R.id.number3);
                                   final TextView num2 = (TextView) getActivity().findViewById(R.id.number2);
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

                                   alertD.dismiss();
                               }


                            }
                        });
                        alertD.setView(promptView);
                        alertD.show();


                    } else
                        Toast.makeText(getActivity(), " Wrong answer ", Toast.LENGTH_SHORT).show();
                    theNumber.setText("");

                }

            else{

                if (theNumber.getText().toString().equals(solution)) {


                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);


                    LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                    final View promptView = layoutInflater.inflate(R.layout.dialogdate, null);
                    final AlertDialog alertD = new AlertDialog.Builder(getActivity()).create();
                    Button Done = (Button) promptView.findViewById(R.id.button);
                    TextView text = (TextView) promptView.findViewById(R.id.text);
                    text.setText("The answer : " + solution);
                    Done.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            numberOfNextId = Integer.valueOf(n);
                            ContentValues values = new ContentValues();
                            values.put(DBManager.ColTF, "true");
                            String[] SelectionArgs = {String.valueOf(numberOfNextId)};
                            dbManager.Update(values, "ID=?", SelectionArgs);

                            numberOfNextId = numberOfNextId + 1;

                            ContentValues values1 = new ContentValues();
                            values1.put(DBManager.ColTF, "next");
                            String[] SelectionArgs1 = {String.valueOf(numberOfNextId)};
                            dbManager.Update(values1, "ID=?", SelectionArgs1);


                            Num_Tow fragment = new Num_Tow();
                            Bundle bundle = new Bundle();
                            fragment.setArguments(bundle);
                            bundle.putString("key", key);
                            final TextView num1 = (TextView) getActivity().findViewById(R.id.number3);
                            final TextView num2 = (TextView) getActivity().findViewById(R.id.number2);
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

                            alertD.dismiss();
                        }
                    });
                    alertD.setView(promptView);
                    alertD.show();


                } else
                    Toast.makeText(getActivity(), " Wrong answer ", Toast.LENGTH_SHORT).show();
                theNumber.setText("");

            }


            }
        });
    }
    @Override
    public void onClick(View v) {

    }

    void LoadExamElement() {
        Cursor cursor = dbManager.query(null," TypeName='"+key+"' AND Type='"+number+"' ", null, DBManager.ColID);
        String x="x";
        if (cursor.moveToFirst()) {
            do {
                        n=cursor.getString(cursor.getColumnIndex(DBManager.ColID));
                        cursor.getString(cursor.getColumnIndex(DBManager.ColType));
                        x=cursor.getString(cursor.getColumnIndex(DBManager.ColSeq));
                        solution=cursor.getString(cursor.getColumnIndex(DBManager.ColSol));
                        cursor.getString(cursor.getColumnIndex(DBManager.ColTypeName));
                        ColTF=cursor.getString(cursor.getColumnIndex(DBManager.ColTF));

            } while (cursor.moveToNext());

            seq.setText(x);
        }
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
        if (x.equals("true"))
            return true;
        else
            return false;
    }
}