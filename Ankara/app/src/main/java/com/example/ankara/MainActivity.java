package com.example.ankara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Intent sayfa_ro;
    String[] secenekler_ro={"Ankara Tarihçesi","Ankara Tarihi Yerler","Ankara Yöresel Yemekler","Ankara Yöresel Tatlıları"};
    ListView list_ro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_ro=findViewById(R.id.list_ro);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1,secenekler_ro);
        list_ro.setAdapter(adapter);
        tiklama_ro();

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
                        durum_ro=tarihce_ro.class;
                        break;
                    case 1:
                        durum_ro=tarihiyerler_ro.class;
                        break;
                    case 2:
                        durum_ro=yoreselyemek_ro.class;
                        break;
                    case 3:
                        durum_ro=yoreseltatli_ro.class;
                        break;

                    default:
                        durum_ro=MainActivity.class;


                }
                sayfa_ro=new Intent(MainActivity.this,durum_ro);
                startActivity(sayfa_ro);

            }
        });
    }
}