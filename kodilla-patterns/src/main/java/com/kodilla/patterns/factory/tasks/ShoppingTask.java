package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isTaskDone = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        System.out.println("Task: " + getTaskName() + " is in progress");
        setTaskDone(true);
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isTaskDone();
    }

    public void setTaskDone(boolean taskDone) {
        isTaskDone = taskDone;
    }

    public boolean isTaskDone() {
        return isTaskDone;
    }
}
