package com.jiyoung.lookitpjt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    int clickCount1 =0;
    int clickCount2 =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(),"프로그래밍시작",Toast.LENGTH_LONG).show();

        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickCount1 = clickCount1 +1;

                if(clickCount1%2 ==0){
                    Toast.makeText(getApplicationContext(),"클릭횟수:"+clickCount1,Toast.LENGTH_SHORT).show();
                }else if(clickCount1%3 ==0){

                    Toast.makeText(getApplicationContext(),"클릭횟수"+clickCount1,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"hello" , Toast.LENGTH_SHORT).show();
                }
            }}


        );

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                clickCount2 = clickCount2+1;

                if(clickCount2%2 ==0){

                    Toast.makeText(getApplicationContext(),"클릭횟수:"+clickCount2,Toast.LENGTH_SHORT).show();
                }else if(clickCount2 %3 ==0){
                    Toast.makeText(getApplicationContext(),"hello,world!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
