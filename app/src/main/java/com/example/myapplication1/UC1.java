package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class UC1 extends Activity  {

    Button btn_1_1, btn_1_2, btn_1_3,btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*LinearLayout ll = new LinearLayout(this);
        Button btn_1_1 = new Button(this);
        btn_1_1.setText(R.string.btn_1_1.);
        btn_1_1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        ll.addView(btn_1_1);
        Button btn_1_2 = new Button(this);
        btn_1_1.setText(R.string.btn_1_2);
        btn_1_2 = findViewById(R.id.btn_1_2);
        btn_1_2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        ll.addView(btn_1_2);
        Button btn_1_3 = new Button(this);
        btn_1_3.setText(R.string.btn_1_3);
        btn_1_3 = findViewById(R.id.btn_1_3);
        btn_1_3.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        ll.addView(btn_1_3);
        setContentView(ll);*/
        setContentView(R.layout.activity_uc1);
        btn_1_1 = findViewById(R.id.btn_1_1);
        btn_1_2 = findViewById(R.id.btn_1_2);
        btn_1_3 = findViewById(R.id.btn_1_3);
        btn_back = findViewById(R.id.btn_back);
        btn_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout ll = findViewById(R.id.xml_1);
                ll.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        btn_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout ll = findViewById(R.id.xml_1);
                ll.setOrientation(LinearLayout.VERTICAL);
            }
        });
        btn_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout ll = findViewById(R.id.xml_1);
                ll.setGravity(Gravity.LEFT);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
