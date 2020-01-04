package com.ismailnrtmm.myclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Button btnLihat = findViewById(R.id.lihatbtn);
        Button btnInput = findViewById(R.id.inputbtn);
        Button btnInfo = findViewById(R.id.infobtn);
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent lihatData = new Intent(MainActivity.this, DataMahasiswa.class);
                startActivity(lihatData);
                }
        });
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inputData = new Intent(MainActivity.this, InputData.class);
                startActivity(inputData);
                }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent info = new Intent(MainActivity.this, Informasi.class);
                startActivity(info);
            }
        });
    }
}