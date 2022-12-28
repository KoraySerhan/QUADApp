package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Giris extends AppCompatActivity {

    TextView textView;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        textView = (TextView) findViewById(R.id.appNameText);
        inputText = (EditText) findViewById(R.id.loginInputText);
    }

    public void updateText(View view){

        textView.setText("Hi " + inputText.getText());

        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}