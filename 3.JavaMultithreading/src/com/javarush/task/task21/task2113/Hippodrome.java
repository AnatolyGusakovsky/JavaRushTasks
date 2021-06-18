package com.javarush.task.task21.task2113;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static List<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public Hippodrome(List<Horse> horseList) {
        horses = horseList;
    }

    public List getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(200);
            move();
            print();
        }

    }

    public void move() {
        for (Horse x : horses) {
            x.move();
        }
    }

    public void print() {
        for (Horse x : horses) {
            x.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double maXdistance = 0;
        Horse horseWinner = null;
        for (Horse x : horses) {
            if (x.getDistance() > maXdistance) {
                maXdistance = x.getDistance();
                horseWinner = x;
            }
        }
        return horseWinner;
    }

    public void printWinner() {
        // there continue
//        double maXdistance = 0;
//        String winnerName = "Undefined!";
//        for (Horse x : horses) {
//            if (x.getDistance() > maXdistance) {
//                maXdistance = x.getDistance();
//                winnerName = x.getName();
//            }
//        }
        System.out.println("Winner is " + getWinner().getName() + "!");

    }

    public static void main(String[] args) throws InterruptedException {
        horses.add(new Horse("Mayka", 3, 0));
        horses.add(new Horse("Belka", 3, 0));
        horses.add(new Horse("Baron", 3, 0));

        Hippodrome hippodrome = new Hippodrome(horses);
        game = hippodrome;

        game.run();
        game.printWinner();
    }
}
