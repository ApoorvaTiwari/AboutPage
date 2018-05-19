package com.example.apoorva.aboutpage;

import android.icu.util.RangeValueIterator;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Element adsElement = new Element();
        //adsElement.setTitle("Know about us here");

        setContentView(R.layout.about_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("About");

        AppBarLayout appBarLayout;


        appBarLayout = findViewById(R.id.appBarAnim);


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.bugy)
                .setDescription("Hi! We are a dedicated team of 8 people, with a passion for development — development makes us happy. " +
                        "We truly believe in the transformative power of coding and programming and its ability to simplify communications, elevate experiences, " +
                        "engage and inspire people everywhere. " +
                        "Good apps come from collaboration. Nirbheek - is a collaborative project made by us in our Udacity Android Basics Course," +
                        " aimed at providing safety controls in the hands of user himself. Motivation makes us happy. Rate us 5 stars to keep motivating us. Be safe, be Nirbheek !!")
                .addItem(new Element().setTitle("Version 1.0.8"))
                //.addItem(adsElement)
                .addGroup("Support Development")
                .addEmail("pepperfriday1010@gmail.com")
                .addGitHub("https://github.com/UdacityAndroidBasicsScholarship/wmn-safety")
                .create();


        appBarLayout.addView(aboutPage,-1);


    }


}
