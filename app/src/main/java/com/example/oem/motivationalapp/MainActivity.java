package com.example.oem.motivationalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.oem.motivationalapp.data.QuoteData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QuoteData().getQuotes();
    }
}
