package com.example.day2loginexample;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.day2loginexample.Modal.Student1;

public class Result extends AppCompatActivity {


    private TextView studentid;
    private TextView studentname;
    private TextView gender;
    private TextView m1;
    private TextView m2;
    private TextView m3;
    private TextView m4;
    private TextView m5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

     //   Intent i = getIntent();
        studentid=findViewById(R.id.rid);
        studentname=findViewById(R.id.rname);
        gender=findViewById(R.id.rgender);
        m1=findViewById(R.id.smarks1);
        m2=findViewById(R.id.smarks2);
        m3=findViewById(R.id.smarks3);
        m4=findViewById(R.id.smarks4);
        m5=findViewById(R.id.smarks5);



      //
        Intent i=getIntent();
       Student1 studobj = (Student1) i.getExtras().getSerializable("stud");



studentid.setText("Student ID:"+studobj.getSid());
studentname.setText("Student Name:"+studobj.getSname());
gender.setText("Gender:"+studobj.getGender());
m1.setText("Marks1::"+studobj.getMarks()[0]);
        m2.setText("Marks2::"+studobj.getMarks()[1]);
        m3.setText("Marks3::"+studobj.getMarks()[2]);
        m4.setText("Marks4::"+studobj.getMarks()[3]);
        m5.setText("Marks5::"+studobj.getMarks()[4]);
        }
    }

