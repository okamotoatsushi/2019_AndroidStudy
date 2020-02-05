package com.sample.droider.legacyrecipeapp.util;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class DimensUtilTest {

    @Test
    public void dpToPx_ok() {
        int result = DimensUtil.dpToPx(8, InstrumentationRegistry.getInstrumentation().getContext());
        int expected = 28;

        assertEquals(expected, result);
    }

    @Test
    public void pxToDp_ok() {
        int result = DimensUtil.pxToDp(28, InstrumentationRegistry.getInstrumentation().getContext());
        int expected = 8;

        assertEquals(expected, result);
    }
}