package com.example.ankara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class yoreselyemek_ro extends AppCompatActivity {

    Intent sayfa_ro;
    Button geri_ro;
    String[] secenekler_ro={"Ankara Tava","İnceğiz Çorbası","Beypazarı Güveci"};
    ListView list_ro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoreselyemek_ro);
        list_ro=findViewById(R.id.list_ro);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1,secenekler_ro);
        list_ro.setAdapter(adapter);
        geri_ro=findViewById(R.id.button_ro);
        tiklama_ro();
        anasayfa_ro();
    }
    void tiklama_ro()
    {
        list_ro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String secim=list_ro.getItemAtPosition(i).toString();
                Class<? extends Activity>durum_ro;
                switch(i){
                    case 0:
                        durum_ro=ankara_tava_ro.class;
                        break;
                    case 1:
                        durum_ro=incegiz_corbasi_ro.class;
                        break;
                    case 2:
                        durum_ro=beypazari_guveci_ro.class;
                        break;

                    default:
                        durum_ro=yoreselyemek_ro.class;


                }
                sayfa_ro=new Intent(yoreselyemek_ro.this,durum_ro);
                startActivity(sayfa_ro);

            }
        });
    }
    void anasayfa_ro()
    {
        geri_ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(yoreselyemek_ro.this,MainActivity.class));
            }
        });
    }
}