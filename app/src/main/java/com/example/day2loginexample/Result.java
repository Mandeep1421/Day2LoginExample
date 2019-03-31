package com.example.day2loginexample;
import java.io.Serializable;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day2loginexample.Modal.Student1;

public class Result extends AppCompatActivity {


    private TextView studentid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

     //   Intent i = getIntent();
        studentid=findViewById(R.id.rid);


      //
        Intent i=getIntent();
       Student1 studobj = (Student1) i.getExtras().getSerializable("stud");



studentid.setText(studobj.getSid());

        }
    }

