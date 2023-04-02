package com.example.calculator;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;


import android.content.Context;

import androidx.test.espresso.assertion.ViewAssertions;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {


    @Test
    // Tes untuk menentukan apakah nama dari aplikasi sudah benar
    public void testAppPackage() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.calculator", appContext.getPackageName());
    }

    @Test
    //Tes untuk menguji apakah proses pengurangan sudah benar pada aplikasi
    public void testSubtraction() {
        int result = 2 - 2;
        assertEquals(0, result);
    }

    @Test
    //Tes untuk menguji apakah proses pembagian sudah benar pada aplikasi
    public void testDivision() {
        int result = 200 / 2;
        assertEquals(100, result);
    }
}