package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button =(Button) findViewById(R.id.bodyInfoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openbody();
            }
        });
        button2 = (Button) findViewById(R.id.tipsButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentips();
            }
        });

    }
    public void counterScreen(View view){
        Intent intent = new Intent(this, Counter.class);
        startActivity(intent);
    }
    public void openbody(){
        Intent intent = new Intent(this,body.class);
        startActivity(intent);
    }
    public void opentips(){
        Intent intent = new Intent(this, tips.class);
        startActivity(intent);
    }
}