package com.innocent.lab;

import static org.junit.Assert.*;

import org.junit.Test;

import jdk.jfr.Timestamp;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test 
    public void shouldReturnFour(){ // 2 + 2 should give 4.
        App nApp = new App();
        int four = nApp.addTwoNumbers(2,2);
        assertTrue(four == 4);
    }

    @Test
    public void shouldReturnFive() {
        App nApp = new App(); // Prepare/Setup -- create an instance of the component under test.
        int five = nApp.findGreatest(1, 2, 5);//  Act -- invoking the component under test.
        assertTrue(five == 5); // Assert/Test
    }

    @Test
    public void testCumSumShouldPass() {
        App nApp = new App();
        int six = nApp.cumSumEfficient(3);
        assertTrue(" cummulative sum from 0 to 2 should  be 3 ",six == 6);
    }

    @Test
    public void testAverage() {
        App nApp = new App();
        double average = nApp.getAverages(2, 2, 2);
        assertTrue("I was expecting 2", average == 5);
    }
}
