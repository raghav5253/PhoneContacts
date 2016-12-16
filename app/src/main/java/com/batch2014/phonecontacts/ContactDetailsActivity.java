package com.batch2014.phonecontacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetailsActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvPhone;
    TextView tvEmail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        Intent intent = getIntent();


        SelectUser data = (SelectUser) intent.getSerializableExtra("data");

//        imageView = (ImageView)findViewById(R.id.person_img);
//
//        imageView.setImageBitmap(data.getThumb());

        tvName = (TextView) findViewById(R.id.name_val);
        tvName.setText(data.getName().toString());

        tvPhone = (TextView) findViewById(R.id.mobile_phone_val);
        tvPhone.setText(data.getPhone().toString());

//        tvEmail = (TextView) findViewById(R.id.work_email_val);
//        tvEmail.setText(data.getEmail().toString());

    }
}
