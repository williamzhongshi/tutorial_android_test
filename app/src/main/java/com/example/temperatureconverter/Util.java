package com.example.temperatureconverter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by William on 10/31/2017.
 */

public class Util {
    public static Intent createQuery(Context context, float num, String to_unit) {
        // Reuse MainActivity for simplification
        //Log.d("Debug", num, to_unit);
        Log.d("Debug", Float.toString(num) + " " +  to_unit);
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("num", num);
        i.putExtra("to_unit", to_unit);
        return i;
    }
}

