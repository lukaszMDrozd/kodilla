package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void writtenToLogs() {
        Logger.getInstance().log("Mój log");
    }

    @Test
    public void testGetLogs() {
        //Given
        //When
        String logName = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("Mój log", logName);
    }
}
