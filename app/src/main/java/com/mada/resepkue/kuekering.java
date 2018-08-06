package com.mada.resepkue;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class  kuekering extends AppCompatActivity {


    ViewPager viewPager;
    viewpageradapter adapter;

    int [] gambar = {
            R.drawable.kastangel,R.drawable.telurgabuskeju,R.drawable.putrisalju,R.drawable.nastar,
            R.drawable.sempritsusu,R.drawable.cookies,R.drawable.lidahkucing,R.drawable.watermeloncookies,
            R.drawable.cookiesbatu,R.drawable.sagukejucookies
    };


    String[] judul = {
        "Kue Kastangel Ala Keto","Kue Telur Gabus Keju","Kue Putri Salju","Kue Nastar","Kue Semprit Susu","Choco Cookies",
            "Kue Lidah Kucing", "Watermelon Cookies","Cookies Batu Bata","Kue Sagu Keju"
    };

    String [] keterangan = {
            String.valueOf(R.string.kue_kering_kastangel_ala_keto), String.valueOf(R.string.kue_kering_telur_gabus_keju),
            String.valueOf(R.string.kue_kering_putri_salju), String.valueOf(R.string.kue_kering_nastar),
            String.valueOf(R.string.kue_kering_semprit_susu), String.valueOf(R.string.kue_kering_choco_cookies),
            String.valueOf(R.string.kue_kering_lidah_kucing), String.valueOf(R.string.kue_kering_watermelon_cookies),
            String.valueOf(R.string.kue_kering_cookies_batu_bata), String.valueOf(R.string.kue_kering_sagu_keju)

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuekering);

        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new viewpageradapter(getApplication(),gambar,judul,keterangan);
        viewPager.setAdapter(adapter);
    }
}
