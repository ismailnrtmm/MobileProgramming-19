package com.ismailnrtmm.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btndonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Mari Berdonasi!");

            btndonasi = findViewById(R.id.btn_donasi);
            btndonasi.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_donasi:
                Intent donasiR80 = new Intent(this, DonationActivity.class);
                startActivity(donasiR80);
                break;
        }
    }
}
