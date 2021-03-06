package com.example.superluckylotus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * @version: 2.0
 * @author: 宋佳容
 * @className: NewFansActivity
 * @packageName:com.example.superluckylotus
 * @description: 提到了我界面
 * @data: 2020.07.14 16:40
 **/

public class AtMeActivity extends AppCompatActivity {

    private Button back_Btn;
    private Button at_video_btn1;
    private Button at_video_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at_me);
        back_Btn=(Button)findViewById(R.id.at_back);
        at_video_btn1=(Button)findViewById(R.id.atVedio1_btn);
        at_video_btn2=(Button)findViewById(R.id.atVedio2_btn);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        back_Btn.setOnClickListener(onClick);
        at_video_btn1.setOnClickListener(onClick);
        at_video_btn2.setOnClickListener(onClick);
    }

    class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.at_back:
                    finish();
                    break;
                case R.id.atVedio1_btn:
                case R.id.atVedio2_btn:
                    intent = new Intent(AtMeActivity.this,SingleVideoActivity.class);
                    startActivity(intent);
                    break;
            }

        }
    }
}