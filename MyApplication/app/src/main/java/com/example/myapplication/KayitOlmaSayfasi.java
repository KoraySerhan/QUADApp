package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KayitOlmaSayfasi extends AppCompatActivity {
    private Button button;
    private Button button1;
    EditText Name,  Psd;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_olma_sayfasi);

        button1 = (Button) findViewById(R.id.btnGirişeDön);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGiris();
            }
        });

        preferences = getSharedPreferences("MyPreferences",MODE_PRIVATE);
        editor = preferences.edit();

        if(preferences.contains("Saved_Name")){
            Intent intent = new Intent(KayitOlmaSayfasi.this, GirisSayfasi.class);
            startActivity(intent);
        }

        Name = findViewById(R.id.kayıtKullanıcıAdı);
        Psd = findViewById(R.id.kayıtParola);
        button = (Button) findViewById(R.id.btnKaydet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String my_name =  Name.getText().toString();
                String my_password = Psd.getText().toString();
                editor.putString("Saved_Name", my_name);
                editor.putString("Saved_password",my_password);
                editor.commit();
                openGiris();
            }
        });
    }
    public void openGiris(){
        Intent intent = new Intent(this, Giris.class);
        startActivity(intent);
    }
}