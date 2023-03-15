package com.selimcinar.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
       //Diğer aktiviteden gelen bilgileri al
        Intent intent = getIntent();
        String username = intent.getStringExtra("userInput");
        //Textview ekle
        textView.setText(username);
    }

    //Button tıklanma olayları
    public  void changeScreen(View view){
        //Aktiviteler arası geçiş kodu
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}