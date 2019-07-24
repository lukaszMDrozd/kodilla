package com.kodilla.stream.array;

import org.junit.*;

public class ArrayOperationsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testGetAverage(){

        //Given
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expectedAverage = 5.5;

        //When
        double average = ArrayOperations.getAverage(intArray);

        //Then
        Assert.assertEquals(expectedAverage, average, 0);

    }
}
