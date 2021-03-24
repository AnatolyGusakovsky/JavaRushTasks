package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {

    private Thread t;

    public LoggingStateThread(Thread t) {
        this.t = t;

    }

    @Override
    public void run() {
//        setDaemon(true);
      Thread.State currState = t.getState();
        System.out.println(currState);
        while(true) {
            Thread.State currState2 = t.getState();
            if(currState != currState2) {
                System.out.println(currState2);
                currState = currState2;
            }
            if (currState2 == State.TERMINATED)
                return;

        }
    }


}
