package com.example.ankara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ankara_tava_ro extends AppCompatActivity {
    Button button_ro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankara_tava_ro);
        button_ro=findViewById(R.id.button_ro);
        sayfayadön_ro();
    }
    void sayfayadön_ro()
    {
        button_ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ankara_tava_ro.this,yoreselyemek_ro.class));
            }
        });
    }
}