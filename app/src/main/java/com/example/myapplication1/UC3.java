package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class UC3 extends Activity {

    Button btn_handle,btn_back;
    Timer timer;
    TimerTask task;


    int [] ID_Group = {R.id.img_1,R.id.img_2,R.id.img_3,R.id.img_4,R.id.img_5};
    int count = 0;
    boolean Time_bool = false;

     Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            ImageView last_up_image = findViewById(ID_Group[count]);
            count = (count+1) % 5;
            ImageView up_image = findViewById(ID_Group[count]);
            last_up_image.setVisibility(View.INVISIBLE);
            up_image.setVisibility(View.VISIBLE);
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        Timer_Init();
        btn_handle = findViewById(R.id.btn_handle);
        btn_back = findViewById(R.id.btn_back);
        btn_handle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Time_bool)
                {
                    timer.cancel();
                    timer = null;
                    task.cancel();
                    task = null;
                    Time_bool = false;
                }
                else
                {
                    Timer_Init();
                    Time_bool = true;
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void Timer_Init()
    {
        if (timer == null && task == null) {
            long delay = 2000,intevalPeriod = 1000;
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    Message message = new Message();
                    message.what = 1;
                    handler.sendMessage(message);
                }
            };
            timer.schedule(task,delay,intevalPeriod);
        }
    }
}
