package com.example.airbusflightapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class ListFlights extends AppCompatActivity {

    TextView textView;
    EditText text;
    DatePicker datePicker;
    int day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_flights);

        text = findViewById(R.id.From);
        textView = findViewById(R.id.From_list);
        textView.setText("Bangalore");

        text = findViewById(R.id.From);
        textView = findViewById(R.id.To_list);
        textView.setText("Pune");

        datePicker = (DatePicker) findViewById(R.id.departDate);
        day = datePicker.getDayOfMonth();
        month = datePicker.getMonth() + 1;
        year = datePicker.getYear();

        textView = findViewById(R.id.departDate_list);
//        textView.setText(day + "/" + month + "/" + year);

        datePicker = (DatePicker) findViewById(R.id.returnDate);
        day = datePicker.getDayOfMonth();
        month = datePicker.getMonth() + 1;
        year = datePicker.getYear();

        textView = findViewById(R.id.returnDate_list);
//        textView.setText(day + "/" + month + "/" + year);

    }
}
