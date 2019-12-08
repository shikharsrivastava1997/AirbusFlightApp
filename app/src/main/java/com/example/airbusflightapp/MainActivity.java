package com.example.airbusflightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button m_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_button = findViewById(R.id.search);
        m_button.setOnClickListener(this);

    }

    public void onClick(View view) {
        System.out.println("Button clicked");

        Intent flight_list = new Intent(getApplicationContext(), ListFlights.class);
        startActivity(flight_list);
    }

}
