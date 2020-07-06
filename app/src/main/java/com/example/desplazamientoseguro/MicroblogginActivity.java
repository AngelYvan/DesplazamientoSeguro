package com.example.desplazamientoseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MicroblogginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microbloggin);
    }

    public void irListaMicrobloggin(View view){
        Intent siguiente= new Intent(this, ListaActivity.class);
        startActivity(siguiente);
    }
    public void irAddMicrobloggin(View view){
        Intent siguiente= new Intent(this, AddMicroblogginActivity.class);
        startActivity(siguiente);
    }
}
