package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isTaskDone = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
