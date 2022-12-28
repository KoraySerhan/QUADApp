package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {

    //EditText counterInput = (EditText) findViewById(R.id.counterInput);
    //int finalValue=Integer.parseInt(counterInput.getText().toString());

    TextView txt_sayimi_goster;
    Button btn_sayimi_baslat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        txt_sayimi_goster = findViewById(R.id.txt_sayimi_goster);
        btn_sayimi_baslat = findViewById(R.id.btn_sayimi_baslat);

        btn_sayimi_baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_sayimi_baslat.setEnabled(false);

                new CountDownTimer(800000,1000) {

                    @Override
                    public void onTick(long l) {
                        txt_sayimi_goster.setText(""+l/1000);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(Counter.this, "Sayım Bitti!", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });
    }
}