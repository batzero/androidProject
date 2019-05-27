package com.jiyoung.lookit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int clickCount =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toast.makeText(getApplication(),"시작",Toast.LENGTH_LONG).show();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clickCount = clickCount +1;
                Toast.makeText(getApplicationContext(),"clickCount:"+clickCount, Toast.LENGTH_SHORT).show();
            }

        });


    }
}
