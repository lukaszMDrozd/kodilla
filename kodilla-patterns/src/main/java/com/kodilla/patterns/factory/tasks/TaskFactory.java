package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Jadę", "do domu", "autem");
            case PAINTINGTASK:
                return new PaintingTask("Maluję dom", "niebieski", "dom");
            case SHOPPINGTASK:
                return new ShoppingTask("Kupuję bułki", "bułki", 20);
            default:
                return null;
        }
    }
}
