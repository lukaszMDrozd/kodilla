package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {

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
    public void testGetPeopleQuantity(){

        //Given
        World world = new World();

        Continent africa = new Continent("Afryka");
        Continent europe = new Continent("Europa");
        Continent australia = new Continent("Australia");

        africa.addCountry(new Country(new BigDecimal("1"), "Libia"));
        africa.addCountry(new Country(new BigDecimal("2"), "Egipt"));
        africa.addCountry(new Country(new BigDecimal("3"), "RPA"));

        europe.addCountry(new Country(new BigDecimal("1"), "Niemcy"));
        europe.addCountry(new Country(new BigDecimal("2"), "Polska"));
        europe.addCountry(new Country(new BigDecimal("3"), "Dania"));

        australia.addCountry(new Country(new BigDecimal("1"), "Samoa"));
        australia.addCountry(new Country(new BigDecimal("2"), "Fidźi"));
        australia.addCountry(new Country(new BigDecimal("3"), "Tonga"));

        world.getTheListOfContinents().add(africa);
        world.getTheListOfContinents().add(europe);
        world.getTheListOfContinents().add(australia);

        //When
        BigDecimal numberOfPeople = world.getPeopleQuantity();
        System.out.println(world.toString());

        //Then
        BigDecimal expectedNumberOfPeople = new BigDecimal("18");
        Assert.assertEquals(expectedNumberOfPeople, numberOfPeople);
        Assert.assertEquals(world.toString(), "W moim zmyślonym świecie znajduje się 18 ludzi");
        Assert.assertEquals(3, world.getTheListOfContinents().size());
        Assert.assertEquals(3, australia.getTheListOfCountries().size());
    }
}
