package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure(){
        //Given
        Shape shape = new Square("Kwadrat", 2);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(shape);

        //Then
        Assert.assertEquals(shape, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape shape = new Triangle("Trójkąt", 2,3);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape shape = new Circle("Okrąg", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);

        //When
        Shape retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape, retrievedShape);
    }

    @Test
    public void testShowFigure(){
        //Given
        Shape shape1 = new Square("Kwadrat", 2);
        Shape shape2 = new Triangle("Trójkąt", 2,3);
        Shape shape3 = new Circle("Okrąg", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);

        //When
        shapeCollector.showFigures();
        String shapeCollectorNames = "Kwadrat + Trójkąt + Okrąg";

        //Then
        Assert.assertEquals(shapeCollectorNames, shapeCollector.showFigures());
    }
}
