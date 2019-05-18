package com.example.areacalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button persegi;
    private Button persegipanjang;
    private Button lingkaran;
    private Button trapesium;
    private Button segitiga;
    private Button layanglayang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = (Button) findViewById(R.id.persegi);
        persegipanjang = (Button) findViewById(R.id.persegipanjang);
        lingkaran = (Button) findViewById(R.id.lingkaran);
        trapesium = (Button) findViewById(R.id.trapesium);
        segitiga = (Button) findViewById(R.id.segitiga);
        layanglayang =(Button) findViewById(R.id.layanglayang);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungpersegi();
            }
        });

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungpersegipanjang();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluaslingkaran();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluastrapesium();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluassegitiga();
            }
        });

        layanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungluaslayanglayang();
            }
        });



    }
    public void hitungpersegi(){
        Intent intent = new Intent(this, persegi.class);
        startActivity(intent);
    }
    public void hitungpersegipanjang(){
        Intent intent = new Intent(this, persegipanjang.class);
        startActivity(intent);
    }

    public void hitungluaslingkaran(){
        Intent intent = new Intent(this, lingkaran.class);
        startActivity(intent);
    }

    public void hitungluastrapesium(){
        Intent intent = new Intent(this, trapesium.class);
        startActivity(intent);
    }

    public void hitungluassegitiga(){
        Intent intent = new Intent(this, segitiga.class);
        startActivity(intent);
    }

    public void hitungluaslayanglayang(){
        Intent intent = new Intent(this, layanglayang.class);
        startActivity(intent);
    }

}




