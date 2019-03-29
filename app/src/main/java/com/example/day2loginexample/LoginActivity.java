package com.example.day2loginexample;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText eduid;
    private  EditText epass;
    private Button btnlogin;

    private TextView txtmsg;
    private Button btncancel;
    String email;
    String pass;
    String lblerror;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eduid=findViewById(R.id.txtlogin);
        epass=findViewById(R.id.txtpass);
        btnlogin=findViewById(R.id.btnlogin);
        txtmsg=findViewById(R.id.errormsg);
        btncancel=findViewById(R.id.btncancel);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=eduid.getText().toString();
                pass=epass.getText().toString();

                if(email.equals("samir") && pass.equals("123") )
                {
                     lblerror="Login sucess";
                     //navigate with intenet
                    Intent mIntent=new Intent(LoginActivity.this,Home.class);
                    mIntent.putExtra("name","samir");
                    startActivity(mIntent);
                }
                else
                {
                    lblerror="Login failed..try again";

                }
                txtmsg.setText(lblerror.toString());
            }
        });


        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eduid.getText().clear();
                epass.getText().clear();

            }
        });


    }


}
