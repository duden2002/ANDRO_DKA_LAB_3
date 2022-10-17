package com.example.andro_dka_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onNext(View v) {
        // Создание второго окна
        Intent intent = new Intent(MainActivity.this, second_activity.class);
        startActivity(intent);
    }
    public void onExit(View v) {
        finishAffinity();
    }
}

