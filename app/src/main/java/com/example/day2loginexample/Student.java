package com.example.day2loginexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.day2loginexample.Modal.Student1;

public class Student extends AppCompatActivity {

    private EditText txtsid;
    private EditText txtsname;
    private RadioGroup txtgender;
    private EditText txtm1;
    private EditText txtm2;
    private EditText txtm3;
    private EditText txtm4;
    private EditText txtm5;
    private Button btncal;
    private String gen;
    private int[] marks=new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        btncal=findViewById(R.id.btncalculate);
        txtsid=findViewById(R.id.studid);
        txtsname=findViewById(R.id.studname);
        txtgender=findViewById(R.id.gender);
        txtm1=findViewById(R.id.marks1);
        txtm2=findViewById(R.id.marks2);
        txtm3=findViewById(R.id.marks3);
        txtm4=findViewById(R.id.marks4);
        txtm5=findViewById(R.id.marks5);


        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtgender.getCheckedRadioButtonId() == R.id.rmale)
                {
                    gen="Male";
                }
                else
                {
                    gen="Female";
                }
                marks[0]=Integer.parseInt( txtm1.getText().toString());
                marks[1]=Integer.parseInt(txtm2.getText().toString());
                marks[2]=Integer.parseInt(txtm3.getText().toString());
                marks[3]=Integer.parseInt(txtm4.getText().toString());
                marks[4]=Integer.parseInt(txtm5.getText().toString());
                String id=txtsid.getText().toString();
                String name=txtsname.getText().toString();

                Student1 s=new Student1(id,name,gen,marks);
                Intent mIntent=new Intent(Student.this,Result.class);
                mIntent.putExtra("stud",s);
                startActivity(mIntent);
            }
        });
    }
}
