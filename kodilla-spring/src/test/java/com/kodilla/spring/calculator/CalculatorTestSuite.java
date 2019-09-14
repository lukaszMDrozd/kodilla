package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2.0,3.0);
        double subResult = calculator.sub(4.0,3.0);
        double mulResult = calculator.mul(3.0,3.0);
        double divResult = calculator.div(9.0,3.0);

        //Then
        Assert.assertEquals(addResult, 5.0, 0.0f);
        Assert.assertEquals(subResult, 1.0,0.0f);
        Assert.assertEquals(mulResult, 9.0,0.0f);
        Assert.assertEquals(divResult, 3.0,0.0f);
    }
}
