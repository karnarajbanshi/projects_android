package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nav_btn;
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        nav_btn = findViewById(R.id.btn_switch);
          // replace with lambda as:
          // nav_btn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, BMICalculatorActivity.class)));
          //
        nav_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BMICalculatorActivity.class));
            }
        });
    }
}
