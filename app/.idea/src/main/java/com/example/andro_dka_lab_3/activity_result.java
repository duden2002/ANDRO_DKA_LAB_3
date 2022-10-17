package com.example.andro_dka_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

    // Переменная доступа к компоненту окна с инициализацией
    EditText editText = findViewById(R.id.editText);

    // Запрет на редактирование в компоненте "editText"
        editText.setKeyListener(null);

    // Очистка данных в компоненте "editText"
        editText.setText("");

    // Добавление данных в компонент "editText"
        editText.append(String.format("%s %s \n", getString(R.string.Имя_пользователя), getIntent().getStringExtra("name")));
        editText.append(String.format("%s %s \n", getString(R.string.Тип_комьютера), getIntent().getStringExtra("type")));
        editText.append(String.format("%s %s \n", getString(R.string.Производитель_CPU), getIntent().getStringExtra("CPU")));
        editText.append(String.format("%s %s \n", getString(R.string.Производитель_материнской_платы), getIntent().getStringExtra("motherboard")));
}

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void onExit(View v) {
        finishAffinity();
    }

}