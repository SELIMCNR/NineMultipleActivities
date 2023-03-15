package com.selimcinar.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   //Global kapsamlar
    String userName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //İd bağlantıları tamamlandı
        editText = findViewById(R.id.editText);

        userName="";
    }
    //Button tıklanma olayları
    public  void changeActivity(View view){
       //Dışardan girilen değeri al
        userName= editText.getText().toString();

        //Aktiviteler arası geçiş kodu
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        //Dışardan girilen değeri al ve diğer aktiviteye yolla
        intent.putExtra("userInput",userName);

        startActivity(intent);


    }

}