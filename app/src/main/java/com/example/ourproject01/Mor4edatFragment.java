package com.example.ourproject01;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Mor4edatFragment extends Fragment {
    int i=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mor4edat, container, false);
        EditText edittext = view.findViewById(R.id.scoutnum);
        Button applybtn =view.findViewById(R.id.buttonapply);
        Button resultbutton= view.findViewById(R.id.resultbtn);
        Button restbtn=view.findViewById(R.id.buttonrest);
        TextView fetartextview= view.findViewById(R.id.resultfetar);
        TextView lunuchtextview= view.findViewById(R.id.resultlunch);
        TextView dinnertextview= view.findViewById(R.id.resultdinner);
        RadioButton radiobtw1 = view.findViewById(R.id.radionormal);
        RadioButton radiobtw2 = view.findViewById(R.id.radioactive);
        RadioButton radiobtw3 = view.findViewById(R.id.radiovactive);
        RadioButton radiobtnb1 = view.findViewById(R.id.radioButton1fetar);
        RadioButton radiobtnb2 = view.findViewById(R.id.radioButton2fetar);
        RadioButton radiobtnb3 = view.findViewById(R.id.radioButton3fetar);
        RadioButton radiobtnb4 = view.findViewById(R.id.radioButton4fetar);
        RadioButton radiobtnb5 = view.findViewById(R.id.radioButton5fetar);
        RadioButton radiobtnb6 = view.findViewById(R.id.radioButton1lunch);
        RadioButton radiobtnb7 = view.findViewById(R.id.radioButton2lunch);
        RadioButton radiobtnb8 = view.findViewById(R.id.radioButton3lunch);
        RadioButton radiobtnb9 = view.findViewById(R.id.radioButton4lunch);
        RadioButton radiobtnb10 = view.findViewById(R.id.radioButton5lunch);
        RadioButton radiobtnb11 = view.findViewById(R.id.radioButton1dinner);
        RadioButton radiobtnb12 = view.findViewById(R.id.radioButton2dinner);
        RadioButton radiobtnb13 = view.findViewById(R.id.radioButton3dinner);
        RadioButton radiobtnb14 = view.findViewById(R.id.radioButton4dinner);
        RadioButton radiobtnb15 = view.findViewById(R.id.radioButton5dinner);
        TextView watertextview= view.findViewById(R.id.resultwater);

//apply button
        applybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (!radiobtnb1.isChecked() && !radiobtnb2.isChecked() &&!radiobtnb3.isChecked() &&!radiobtnb4.isChecked() &&!radiobtnb5.isChecked() &&
                        !radiobtnb6.isChecked() &&!radiobtnb7.isChecked() &&!radiobtnb8.isChecked() &&!radiobtnb9.isChecked() &&!radiobtnb10.isChecked() &&
                        !radiobtnb11.isChecked() &&!radiobtnb12.isChecked() &&!radiobtnb13.isChecked() &&!radiobtnb14.isChecked() &&!radiobtnb15.isChecked()){
                    i=0;
                }
                if (!radiobtw1.isChecked() && !radiobtw2.isChecked() && !radiobtw3.isChecked()){
                    i=0;
                    Toast.makeText(getContext(), "اختار حالة الجو", Toast.LENGTH_SHORT).show();

                }else{
                try {
                    double x = Double.parseDouble(edittext.getText().toString());
                    Log.d("+++++++", String.valueOf(x));
                    if (radiobtw1.isChecked()) {
                        watertextview.append("\n اليوم "+i+"\n"+Math.ceil(x*1.6)+" لتر مياه \n");

                        if (radiobtnb1.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n علبة فول " + Math.ceil(0.5 * x) + "\n رغيف عيش " + Math.ceil(x * 1) + "\nعلبة مربى صغيرة " + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb2.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n فطير " + Math.ceil(x * 1.25) + "\n معلقة عسل" + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb3.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n  كيلو جبنة بيضاء " + Math.ceil(0.08 * x) + "\n  بيضة" + Math.ceil(x * 1) + "\n رغيف عيش " + Math.ceil(x * 1.25) + "\n");
                        }
                        if (radiobtnb4.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n علبة فول " + Math.ceil(0.3 * x) + "\n بيضة" + Math.ceil(x * 1) + "\n رغيف عيش" + Math.ceil(x * 1.25) + "\n");
                        }
                        if (radiobtnb5.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n كيلو شعرية "+Math.ceil(0.065*x)+"\n كوب لبن"+Math.ceil(1*x)+"\n رغيف عيش"+Math.ceil(x*0.5)+"\n بيضة"+Math.ceil(x*2)+ "\n");
                        }



                        if (radiobtnb6.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة " + Math.ceil(x * 0.140) + "\nعلبة تونة صغيرة " + Math.ceil(x * 0.5) + "\n");
                        }
                        if (radiobtnb7.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة" + Math.ceil(x * 0.170) + "\n كيلو لحمة مفرومة" + Math.ceil(x * 0.070) + "\n");
                        }
                        if (radiobtnb8.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز" + Math.ceil(x * 0.160) + "\n كيلو بطاطس" + Math.ceil(x * 0.075) + "\n");
                        }
                        if (radiobtnb9.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو بسلة" + Math.ceil(x * 0.110) + "\n كيلو رز" + Math.ceil(x * 0.155) +"\n");
                        }
                        if (radiobtnb10.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز " + Math.ceil(x * 0.090) + "\n فرخة مشوية" + Math.ceil(x * 0.25) + "\n");
                        }



                        if (radiobtnb11.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(x * 0.66) + "\nعلبة تونة صغيرة " + Math.ceil(x * 1) + "\n");
                        }
                        if (radiobtnb12.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(0.5*x) + "\n كيلو بطاطس مهروسة" + Math.ceil(x * 0.200) + "\n بار حلاوة" + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb13.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+ "\n كيلو بليلة" + Math.ceil(x * 0.100) + "\n");
                        }
                        if (radiobtnb14.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n فطيرة" + Math.ceil(x * 0.5) + "\n كيلو جبنة بيضاء " + Math.ceil(x * 0.050) + "\n");
                        }
                        if (radiobtnb15.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n كيلو بطاطا" + Math.ceil(x * 0.280) + "\n ذرة" + Math.ceil(x * 1) + "\n");
                        }
                    }
                    if (radiobtw2.isChecked()) {
                        watertextview.append("\n اليوم "+i+"\n"+Math.ceil(x*2.0)+" لتر مياه \n");

                        if (radiobtnb1.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n علبة فول " + Math.ceil(0.5 * x) + "\n رغيف عيش " + Math.ceil(x * 1.5) + "\nعلبة مربى صغيرة " + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb2.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n فطير " + Math.ceil(x * 1.0) + "\n معلقة عسل" + Math.ceil(x * 3) + "\n");
                        }
                        if (radiobtnb3.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n  كيلو جبنة بيضاء " + Math.ceil(0.100 * x) + "\n  بيضة" + Math.ceil(x * 2) + "\n رغيف عيش " + Math.ceil(x * 1.25) + "\n");
                        }
                        if (radiobtnb4.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n علبة فول " + Math.ceil(0.5 * x) + "\n بيضة" + Math.ceil(x * 1) + "\n رغيف عيش" + Math.ceil(x * 1.5) + "\n");
                        }
                        if (radiobtnb5.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n كيلو شعرية "+Math.ceil(0.065*x)+"\n كوب لبن"+Math.ceil(1.5*x)+"\n رغيف عيش"+Math.ceil(x*0.75)+"\n بيضة"+Math.ceil(x*2)+ "\n");
                        }



                        if (radiobtnb6.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة " + Math.ceil(x * 0.140) + "\nعلبة تونة صغيرة " + Math.ceil(x * 1.5) + "\n");
                        }
                        if (radiobtnb7.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة" + Math.ceil(x * 0.180) + "\n كيلو لحمة مفرومة" + Math.ceil(x * 0.100) + "\n");
                        }
                        if (radiobtnb8.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز" + Math.ceil(x * 0.180) + "\n كيلو بطاطس" + Math.ceil(x * 0.100) + "\n");
                        }
                        if (radiobtnb9.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو بسلة" + Math.ceil(x * 0.75) + "\n كيلو رز" + Math.ceil(x * 0.2000) +"\n");
                        }
                        if (radiobtnb10.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز " + Math.ceil(x * 0.055) + "\n فرخة مشوية" + Math.ceil(x * 0.5) + "\n");
                        }



                        if (radiobtnb11.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(x * 0.75) + "\nعلبة تونة صغيرة " + Math.ceil(x * 1) + "\n");
                        }
                        if (radiobtnb12.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(1*x) + "\n كيلو بطاطس مهروسة" + Math.ceil(x * 0.180) + "\n بار حلاوة" + Math.ceil(x * 1) + "\n");
                        }
                        if (radiobtnb13.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+ "\n كيلو بليلة" + Math.ceil(x * 0.120) + "\n");
                        }
                        if (radiobtnb14.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n فطيرة" + Math.ceil(x * 0.5) + "\n كيلو جبنة بيضاء " + Math.ceil(x * 0.075) + "\n");
                        }
                        if (radiobtnb15.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n كيلو بطاطا" + Math.ceil(x * 0.370) + "\n ذرة" + Math.ceil(x * 1) + "\n");
                        }
                    }
                    if (radiobtw3.isChecked()) {
                        watertextview.append("\n اليوم "+i+"\n"+Math.ceil(x*2.4)+" لتر مياه \n");

                        if (radiobtnb1.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n علبة فول " + Math.ceil(0.66 * x) + "\n رغيف عيش " + Math.ceil(x * 1.5) + "\nعلبة مربى صغيرة " + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb2.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+ "\n فطير " + Math.ceil(x * 1.5) + "\n معلقة عسل" + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb3.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n  كيلو جبنة بيضاء " + Math.ceil(0.120 * x) + "\n  بيضة" + Math.ceil(x * 2) + "\n رغيف عيش " + Math.ceil(x * 1.5) + "\n");
                        }
                        if (radiobtnb4.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n علبة فول " + Math.ceil(0.6 * x) + "\n بيضة" + Math.ceil(x * 2) + "\n رغيف عيش" + Math.ceil(x * 1.5) + "\n");
                        }
                        if (radiobtnb5.isChecked()) {
                            fetartextview.append("\nفطار اليوم  " +i+"\n"+"\n كيلو شعرية "+Math.ceil(0.070*x)+"\n كوب لبن"+Math.ceil(1.5*x)+"\n رغيف عيش"+Math.ceil(x*1)+"\n بيضة"+Math.ceil(x*2)+ "\n");
                        }



                        if (radiobtnb6.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة " + Math.ceil(x * 0.190) + "\nعلبة تونة صغيرة " + Math.ceil(x * 1.5) + "\n");
                        }
                        if (radiobtnb7.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو مكرونة" + Math.ceil(x * 0.240) + "\n كيلو لحمة مفرومة" + Math.ceil(x * 0.090) + "\n");
                        }
                        if (radiobtnb8.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز" + Math.ceil(x * 0.200) + "\n كيلو بطاطس" + Math.ceil(x * 0.145) + "\n");
                        }
                        if (radiobtnb9.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو بسلة" + Math.ceil(x * 0.90) + "\n كيلو رز" + Math.ceil(x * 0.230) +"\n");
                        }
                        if (radiobtnb10.isChecked()) {
                            lunuchtextview.append("\nغذاء اليوم  " +i+"\n"+"\n كيلو رز " + Math.ceil(x * 0.085) + "\n فرخة مشوية" + Math.ceil(x * 0.25) + "\n");
                        }



                        if (radiobtnb11.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(x * 1) + "\nعلبة تونة صغيرة " + Math.ceil(x * 1) + "\n");
                        }
                        if (radiobtnb12.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\nرغيف عيش  " + Math.ceil(1.25*x) + "\n كيلو بطاطس مهروسة" + Math.ceil(x * 0.200) + "\n بار حلاوة" + Math.ceil(x * 2) + "\n");
                        }
                        if (radiobtnb13.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+ "\n كيلو بليلة" + Math.ceil(x * 0.140) + "\n");
                        }
                        if (radiobtnb14.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n فطيرة" + Math.ceil(x * 0.75) + "\n كيلو جبنة بيضاء " + Math.ceil(x * 0.060) + "\n");
                        }
                        if (radiobtnb15.isChecked()) {
                            dinnertextview.append("\nعشاء اليوم  " +i+"\n"+"\n كيلو بطاطا" + Math.ceil(x * 0.370) + "\n ذرة" + Math.ceil(x * 1.5) + "\n");
                        }
                    }
                    Toast.makeText(getContext(), "تم إضافة يوم لصفحة ال Result", Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    i=0;
                    Toast.makeText(getContext(), "اكتب عدد الأفراد", Toast.LENGTH_SHORT).show();                }
            }}
        });

//rest button
        restbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetartextview.setText("");
                lunuchtextview.setText("");
                dinnertextview.setText("");
                watertextview.setText("");
                Toast.makeText(getContext(), "تم محو صفحة ال Result", Toast.LENGTH_SHORT).show();

                i=0;
            }
        });
//result button
        resultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenttoresult;
                String fetarresult=fetartextview.getText().toString();
                String lunchresult=lunuchtextview.getText().toString();
                String dinnerresult=dinnertextview.getText().toString();
                String waterresult=watertextview.getText().toString();
                intenttoresult = new Intent(getActivity(),ResultActivity.class);
                intenttoresult.putExtra("fetarresult", fetarresult);
                intenttoresult.putExtra("lunchresult", lunchresult);
                intenttoresult.putExtra("dinnerresult", dinnerresult);
                intenttoresult.putExtra("waterresult", waterresult);
                startActivity(intenttoresult);
            }
        });
        return view;
    }
}