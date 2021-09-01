package com.example.weconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class sellNowPage extends AppCompatActivity {

    TextView call_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sell_now_page);

        call_profile = findViewById(R.id.signUpButton);
        call_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( sellNowPage.this, profileCreate.class);
                String phonenumber=getIntent().getStringExtra("mobile");
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);
            }
        });
    }
}