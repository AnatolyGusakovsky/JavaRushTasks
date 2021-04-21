package com.javarush.task.task25.task2508;

public interface CustomThreadManipulator extends Runnable {
    public void start(String threadName);

    public void stop();
}
