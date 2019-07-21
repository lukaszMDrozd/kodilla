package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationOfAdvStatisticsTestSuite {
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

    @Test(expected = ArithmeticException.class)
    public void testNumberOfPostsEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 0;
        List<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("John");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int postCountRetrieved = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assert.assertEquals(0, postCountRetrieved);
    }

    @Test
    public void testNumberOfPostsEqualOneThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postsCount = 1000;
        List<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("John");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int postCountRetrieved = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assert.assertEquals(1000, postCountRetrieved);
    }

    @Test
    public void testNumberOfCommentsEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 0;
        int postsCount = 1000;
        List<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("John");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountRetrieved = calculationOfAdvStatistics.getNumberOfComments();

        //Then
        Assert.assertEquals(0, commentsCountRetrieved);
    }

    @Test
    public void testNumberOfCommentsIsGraterNumberOfPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 100;
        int postsCount = 50;
        List<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("John");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountRetrieved = calculationOfAdvStatistics.getNumberOfComments();
        int postCountRetrieved = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assert.assertTrue(commentsCountRetrieved > postCountRetrieved);
    }

    @Test
    public void testNumberOfPostsIsGraterNumberOfComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postsCount = 100;
        List<String> userNames = new ArrayList<>();
        userNames.add("Tom");
        userNames.add("John");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountRetrieved = calculationOfAdvStatistics.getNumberOfComments();
        int postCountRetrieved = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assert.assertTrue(commentsCountRetrieved < postCountRetrieved);
    }

    @Test(expected = ArithmeticException.class)
    public void testNumberOfUsersEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postsCount = 100;
        List<String> userNames = new ArrayList<>();

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsersRetrieved = calculationOfAdvStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, numberOfUsersRetrieved);
    }

    @Test
    public void testNumberOfUsersEqualOneHundred(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postsCount = 100;
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userNames.add(Integer.toString(i));
        }

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsersRetrieved = calculationOfAdvStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(100, numberOfUsersRetrieved);
    }
}
