package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    EditText Name1;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnGirişYap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name1 = findViewById(R.id.girişKullanıcıAdı);
                String my_name =  Name1.getText().toString();
                Password = findViewById(R.id.girişParola);
                String password =  Password.getText().toString();

                SharedPreferences result = getSharedPreferences("MyPreferences",MODE_PRIVATE);
                String value = result.getString("Saved_Name","");
                String value1 = result.getString("Saved_password","");
                if(Objects.equals(value, my_name) && Objects.equals(value1,password)){
                    openMenu();
                }
                else{
                    Toast.makeText(getApplicationContext(), "User Not Found",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        button1 = (Button) findViewById(R.id.btnKayıtOl);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKayıtOl();
            }
        });

    }

    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void openKayıtOl(){
        Intent intent = new Intent(this, KayitOlmaSayfasi.class);
        startActivity(intent);
    }


}

