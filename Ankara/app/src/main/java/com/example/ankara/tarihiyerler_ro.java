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

public class tarihiyerler_ro extends AppCompatActivity {
    Intent sayfa_ro;
    Button geri_ro;
    String[] secenekler_ro={"Anıtkabir","Anadolu Medeniyet Müzesi","Kale Mahallesi"};
    ListView list_ro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihiyerler_ro);
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
                        durum_ro=anitkabir.class;
                        break;
                    case 1:
                        durum_ro=anadolu_medeniyet_muzesi_ro.class;
                        break;
                    case 2:
                        durum_ro=kale_ro.class;
                        break;

                    default:
                        durum_ro=tarihiyerler_ro.class;


                }
                sayfa_ro=new Intent(tarihiyerler_ro.this,durum_ro);
                startActivity(sayfa_ro);

            }
        });
    }
    void anasayfa_ro()
    {
        geri_ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tarihiyerler_ro.this,MainActivity.class));
            }
        });
    }
}