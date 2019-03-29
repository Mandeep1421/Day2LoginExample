package com.example.day2loginexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {


    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private TextView txtno1;
    private TextView txtno2;
    private TextView msg;
    private Double no1;
    private Double no2;
    private Double ans;
private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle mbundle= getIntent().getExtras();
        if(mbundle!=null)
        {
            if(mbundle.containsKey("name"))
            {
                String name=mbundle.getString("name");
                Toast.makeText(this,name,Toast.LENGTH_LONG).show();
            }
        }

        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnminus);
        btnmul=findViewById(R.id.MUL);
        btndiv=findViewById(R.id.btndiv);
        txtno1=findViewById(R.id.no1);
        txtno2=findViewById(R.id.no2);
        msg=findViewById(R.id.lblresult);



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    no1 = Double.parseDouble ( txtno1.getText().toString());
                    no2 = Double.parseDouble(txtno2.getText().toString());
                msg.setTextColor(Color.RED);
                    ans=no1+no2;
                    msg.setText(ans.toString());

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble ( txtno1.getText().toString());
                no2 = Double.parseDouble(txtno2.getText().toString());
                msg.setTextColor(Color.RED);
                ans=no1-no2;
                msg.setText(ans.toString());

            }
        });

btnmul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        no1 = Double.parseDouble ( txtno1.getText().toString());
        no2 = Double.parseDouble(txtno2.getText().toString());

        ans=no1*no2;
        msg.setTextColor(Color.RED);
        msg.setText(ans.toString());

    }
});


btndiv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        no1 = Double.parseDouble ( txtno1.getText().toString());
        no2 = Double.parseDouble(txtno2.getText().toString());
        msg.setTextColor(Color.RED);
        ans=no1/no2;
        msg.setTextColor(Color.RED);
        msg.setText(ans.toString());

    }
});






    }
}
