package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        String toDoTask = "Wykonać projekt";
        String inProgressTask = " Projekt w trakcie wykonywania";
        String doneTask = "Wykonałem commit inicjujacy";

        //When
        context.getBean(Board.class).getToDoList().addTask(toDoTask);
        context.getBean(Board.class).getInProgressList().addTask(inProgressTask);
        context.getBean(Board.class).getDoneList().addTask(doneTask);

        //Then
        Assert.assertEquals(1, context.getBean(Board.class).getToDoList().getTasks().size());
        Assert.assertEquals(1, context.getBean(Board.class).getInProgressList().getTasks().size());
        Assert.assertEquals(1, context.getBean(Board.class).getDoneList().getTasks().size());

    }

    @Test
    public void testConditionInProgressTaskListExists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        boolean taskInProgressExists = context.containsBean("inProgressList");

        //Then
        System.out.println("Lista tasków inProgress istnieje w Tablicy: " + taskInProgressExists);
    }
}
