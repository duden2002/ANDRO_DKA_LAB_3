package com.example.andro_dka_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class second_activity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;
    private Spinner spinner;
    private EditText editText;
    private CheckBox checkBox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        radioGroup = findViewById(R.id.radioGroup);
        spinner = findViewById(R.id.spinner);
        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
    }

    public void onBack(View v) {
        // Создание второго окна
        Intent intent = new Intent(second_activity.this, MainActivity.class);
        startActivity(intent);
    }
    public void onNext(View v) {
        // Создание второго окна
        Intent intent = new Intent(second_activity.this, activity_result.class);

        selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        intent.putExtra("name", editText.getText().toString());
        intent.putExtra("type", checkBox.isChecked() ? getString(R.string.Стационарный) : getString(R.string.Мобильный));
        intent.putExtra("CPU", selectRadioButton.getText());
        intent.putExtra("motherboard", spinner.getSelectedItem().toString());


        startActivity(intent);
    }
}