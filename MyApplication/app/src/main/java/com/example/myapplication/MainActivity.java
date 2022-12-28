package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKayit();
            }
        });
        button1 = (Button) findViewById(R.id.bodyInfoButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGiris();
            }
        });
    }
    public void openKayit(){
        Intent intent = new Intent(this,Kayit.class);
        startActivity(intent);
    }
    public void openGiris(){
        Intent intent = new Intent(this,Giris.class);
        startActivity(intent);
    }


}
