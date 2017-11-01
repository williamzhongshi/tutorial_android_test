package com.example.temperatureconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity  implements View.OnClickListener{
    private EditText text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
//        findViewById(R.id.radio0).setOnClickListener(this);
//        findViewById(R.id.radio1).setOnClickListener(this);


    }

    // this method is called at button click because we assigned the name to the
    // "OnClick" property of the button
    public void onClick(View view) {
        RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
        RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
        switch (view.getId()) {
            case R.id.button1:

                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (celsiusButton.isChecked()) {
                    Intent to_result = new Intent(this, ShowResult.class);
                    to_result.putExtra("num", inputValue);
                    to_result.putExtra("to_unit", "c");
//                    text.setText(String
//                            .valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                    startActivity(to_result);
                } else {
                    Intent to_result = new Intent(this, ShowResult.class);
                    to_result.putExtra("num", inputValue);
                    to_result.putExtra("to_unit", "f");
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                    startActivity(to_result);
                }
                break;
        }
    }
}