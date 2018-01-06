package com.example.android.clickcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Lucas Campos
 */
public class ClickCounterTest {

    private ClickCounter clickCounter = new ClickCounter();

    @Test
    public void shouldIncrementCounter() {
        assertEquals(0, clickCounter.getCount());

        clickCounter.increment();

        assertEquals(1, clickCounter.getCount());
    }
}