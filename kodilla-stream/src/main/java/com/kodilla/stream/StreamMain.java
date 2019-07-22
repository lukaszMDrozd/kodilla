package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
        public static void main(String[] args) {
            System.out.println("Welcome to module 7 - Stream");
/*
            SaySomething saySomething = new SaySomething();
            saySomething.say();

            Processor processor = new Processor();
            ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
            processor.execute(executeSaySomething);

            Executor codeToExecute = () -> System.out.println("This is an example text.");
            processor.execute(codeToExecute);

            ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            System.out.println("Calculating expressions with lambdas");
            expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
            expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

            System.out.println("Calculating expressions with method references");
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
            expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

            PoemBeautifier poemBeautifier = new PoemBeautifier();

            String result = poemBeautifier.beautify("AAA", textToDecorate -> "ABC" + textToDecorate + "ABC");
            System.out.println(result);

            result = poemBeautifier.beautify("aaa", textToDecorate -> textToDecorate.toUpperCase());
            System.out.println(result);

            result = poemBeautifier.beautify("abc", textToDecorate -> textToDecorate + "CCC" + textToDecorate);
            System.out.println(result);

            result = poemBeautifier.beautify("ABCDEF", textToDecorate ->  textToDecorate.charAt(0) + textToDecorate + textToDecorate.charAt(textToDecorate.length()-1));
            System.out.println(result);
        }
}
