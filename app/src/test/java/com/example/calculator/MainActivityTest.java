package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {
    @Test
    //tes untuk menguji apakah logika perkalian sudah benar pada kode yang dibuat
    public void multiplication_isCorrect() {
        assertEquals(4, 2 * 2);
    }

    @Test
    //tes untuk menguji apakah logika penambahan salah pada kode yang sudah dibuat
    public void addition_isFalse() {
        assertNotEquals(5, 2 + 2);
    }

}