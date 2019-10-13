package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isTaskDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
