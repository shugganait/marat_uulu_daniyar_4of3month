package com.kg.marat_uulu_daniyar_4of3month;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kg.marat_uulu_daniyar_4of3month.continent_country.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_fragment, new ContinentFragment()).commit();
    }
}