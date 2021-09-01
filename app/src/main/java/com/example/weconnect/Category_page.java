package com.example.weconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Category_page extends AppCompatActivity {
    Button btn1,btn2,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btn1 =findViewById(R.id.id_la);
        btn2 =findViewById(R.id.id_sa);
        btn4=findViewById(R.id.id_toys);
        btn5=findViewById(R.id.id_gadgets);
        btn6=findViewById(R.id.id_medicaldevices);
        btn7=findViewById(R.id.id_ld);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish();

                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);
                //finish();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=getIntent().getStringExtra("mobile");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);

            }
        });
    }
}