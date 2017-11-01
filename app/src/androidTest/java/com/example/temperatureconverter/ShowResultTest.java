package com.example.temperatureconverter;

/**
 * Created by William on 10/31/2017.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.mock;

public class ShowResultTest {
    @Test
    public void shouldContainTheCorrectExtras()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.createQuery(context, 212, "c");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        Log.d("Debug", Float.toString(extras.getFloat("num")) + " " +  extras.getString("to_unit"));
        assertEquals("c", extras.getString("to_unit"));
        assertEquals(212, extras.getFloat("num"), 1);
    }
}
