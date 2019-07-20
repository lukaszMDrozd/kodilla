package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestName;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Rule
    public TestName name = new TestName();
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void before() {
        System.out.println("Test Case: " + name.getMethodName() + " begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: " + name.getMethodName() + " end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        boolean thrown = false;

        try {
            oddNumbersExterminator.exterminate(testList);
        } catch(Exception e) {
            exception.expectMessage("Given List is empty");
            thrown = true;
        }

        Assert.assertTrue(thrown);
    }

    @Test
    public void testOddNUmbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        testList.add(2);
        testList.add(3);
        testList.add(0);
        testList.add(111);
        resultList.add(2);
        resultList.add(0);

        //Then
        Assert.assertEquals(resultList, oddNumbersExterminator.exterminate(testList));
    }
}
