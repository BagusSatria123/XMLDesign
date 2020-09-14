package com.bagus.xmldesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bagus.xmldesign.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    TextView pushUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushUpBtn = findViewById(R.id.textView6);

        pushUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(),PushUpActivity.class));
            }
        });
    }
}