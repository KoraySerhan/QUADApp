package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class body extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private EditText Adı, Boyu, Yaşı, Cinsiyeti;
    private Button Kayıtbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        Adı = findViewById(R.id.İsim);
        Boyu = findViewById(R.id.Boy);
        Yaşı = findViewById(R.id.Yaş);
        Cinsiyeti = findViewById(R.id.Cinsiyet);
        Kayıtbutton = findViewById(R.id.btnKayıt);

        Kayıtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String AD = Adı.getText().toString();
                String Boy = Boyu.getText().toString();
                String Yaş = Yaşı.getText().toString();
                String Cinsiyet = Cinsiyeti.getText().toString();
                String total = AD + "," + Boy + "," +  Yaş + "," + Cinsiyet;

                databaseReference.setValue(total);

            }
        });

    }
}