package com.example.weconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class profileCreate extends AppCompatActivity {

    TextInputLayout regUsername, regUpi, regAddress, regCity, regState, regPincode;
    Button regSave;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile_create);

        regUsername = findViewById(R.id.username_);
        regUpi = findViewById(R.id.upi_);
        regAddress = findViewById(R.id.address_);
        regCity = findViewById(R.id.city_);
        regState = findViewById(R.id.state_);
        regPincode = findViewById(R.id.pinCode_);
        regSave = findViewById(R.id.save_button);



        regSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Sellers");

                String username = "UserName: "+regUsername.getEditText().getText().toString();
                String upi = "UPI ID: "+regUpi.getEditText().getText().toString();
                String address = "Address: "+regAddress.getEditText().getText().toString();
                String city = "City: "+regCity.getEditText().getText().toString();
                String state = "State: "+regState.getEditText().getText().toString();
                String pincode = "PinCode: "+regPincode.getEditText().getText().toString();

                profileCreationHelperClass helperclass = new profileCreationHelperClass(username,upi,address,city,state,pincode);

                String phonenumber=getIntent().getStringExtra("mobile");
                reference.child(phonenumber).setValue(helperclass);
                Intent intent = new Intent(getApplicationContext(), Category_page.class);
                intent.putExtra("mobile", phonenumber.toString());
                startActivity(intent);

            }
        });
    }
}