package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;
import static java.lang.Integer.parseInt;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class SurahDisplay extends AppCompatActivity {
    ListView listView=null;
    Ayat ayat=null;
    Names name=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_display);
        String s;
        s=getIntent().getStringExtra("surahNumber");
         s=getIntent().getStringExtra("surahNumberButton");
         System.out.println(s);
         int i=Integer.parseInt(s);
        listView=findViewById(R.id.ayatList);
        name=new Names();
        ayat=new Ayat();
        int start= name.SSP[i];
        int end=name.SSP[i]-1;
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, Arrays.copyOfRange(ayat.QuranArabicText,start,end));
        listView.setAdapter(arrayAdapter);

    }
}