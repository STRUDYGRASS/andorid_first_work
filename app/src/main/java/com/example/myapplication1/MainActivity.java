package com.example.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity  {

    Button btn_uc1, btn_uc2, btn_uc3, btn_uc4, btn_uc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_uc1 = findViewById(R.id.btn_uc1);
        btn_uc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UC1.class);
                startActivity(intent);
            }
        });
        btn_uc2 = findViewById(R.id.btn_uc2);
        btn_uc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UC2.class);
                startActivity(intent);
            }
        });
        btn_uc3 = findViewById(R.id.btn_uc3);
        btn_uc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UC3.class);
                startActivity(intent);
            }
        });
        btn_uc4 = findViewById(R.id.btn_uc4);
        btn_uc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UC4.class);
                startActivity(intent);
            }
        });
        btn_uc5 = findViewById(R.id.btn_uc5);
        btn_uc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UC5.class);
                startActivity(intent);
            }
        });
    }
}
