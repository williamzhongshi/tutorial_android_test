package com.example.temperatureconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();

        float input_num = extras.getFloat("num");
        String to_unit = extras.getString("to_unit");

        Log.d("Debug", input_num + " " + to_unit);

        text = (TextView) findViewById(R.id.result_text);

        if (to_unit.equals("c")) {
            Log.d("Debug", "Conver to Celsius");
            text.setText(String
                    .valueOf(ConverterUtil.convertFahrenheitToCelsius(input_num)));
        }
        else {
            Log.d("Debug", "Conver to Fahrenheit");
            text.setText(String
                    .valueOf(ConverterUtil.convertCelsiusToFahrenheit(input_num)));
        }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
