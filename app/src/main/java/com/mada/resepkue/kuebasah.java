package com.mada.resepkue;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class kuebasah extends AppCompatActivity {

    ViewPager viewPager;
    viewpageradapter adapter;

    int [] gambar = {
            R.drawable.wingkobabatsusu,R.drawable.kuelumpurkentangkeju,R.drawable.pukis,R.drawable.bakpiateflon,
            R.drawable.photo,R.drawable.klepon,R.drawable.ondeonde,R.drawable.putuayu,R.drawable.lepetjagung,R.drawable.apem

    };

    String [] judul = {
       "Wingko Babat Kelapa Susu","Kue Lumpur Kentang Keju","Kue Pukis","Kue Bakpia Teflon","Kue Talam Ubi","Kue Klepon",
            "Kue Onde-Onde Ketawa","Kue Putu Ayu","Kue Lepet Jagung","Kue Apem Kukus"
    };

    String [] keterangan = {
            String.valueOf(R.string.Kue_basah_Wingko_babat_kelapa_susu), String.valueOf(R.string.Kue_basah_kue_lumpur_kentang_keju),
            String.valueOf(R.string.kue_basah__kue_pukis), String.valueOf(R.string.kue_basah_bakpia_teflon), String.valueOf(R.string.kue_basah_talam_ubi),
            String.valueOf(R.string.kue_basah_kue_klepon), String.valueOf(R.string.kue_basah_onde_onde_ketawa), String.valueOf(R.string.kue_basah_putu_ayu),
            String.valueOf(R.string.kue_basah_lepet_jagung), String.valueOf(R.string.kue_basah_apem_kukus)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuebasah);

        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);

    }
}
