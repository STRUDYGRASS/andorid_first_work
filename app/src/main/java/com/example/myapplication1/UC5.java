package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UC5 extends Activity {

    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc5);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
