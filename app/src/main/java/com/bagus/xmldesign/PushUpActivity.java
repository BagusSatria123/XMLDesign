package com.bagus.xmldesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PushUpActivity extends AppCompatActivity {


    private int mCounter = 0;
    Button clickMe;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_up);
        txv = findViewById(R.id.text_pushup_count);
        clickMe = findViewById(R.id.btn_num);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter ++;
                txv.setText(Integer.toString(mCounter));
            }
        });

    }
}