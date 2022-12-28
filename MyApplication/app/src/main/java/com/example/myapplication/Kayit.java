package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kayit extends AppCompatActivity {
    private TextView textview;
    private TextView textview1;
    private EditText edittext;
    private EditText edittext1;
    private Button apply_button;

    public static final String SHARED_PREFS = "sheredPrefs";
    public static final String TEXT = "text";

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit);

        textview = (TextView) findViewById(R.id.yourNameText);
        textview1 = (TextView) findViewById(R.id.yourAgeText);
        edittext = (EditText) findViewById(R.id.nameInputText);
        edittext1 = (EditText) findViewById(R.id.ageInputText);

        apply_button = (Button) findViewById(R.id.apply_button);

        apply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText(edittext.getText().toString());
                textview1.setText(edittext1.getText().toString());
                saveData();
            }
        });
        loadData();
        updateViews();
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, textview.getText().toString());

        editor.apply();
        Toast.makeText(this, "DATA SAVED", Toast.LENGTH_SHORT).show();
    }
    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }
    public void updateViews(){
        textview.setText(text);
    }
}