package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1=new Cat("name1",1,23,10);
        cat1.name="sad";
        cat1.age=12;
        cat1.strength=10;
        cat1.weight=50;

        Cat cat2=new Cat("name2",3,4,5);
        cat2.name="sadsd";
        cat2.age=11;
        cat2.strength=9;
        cat2.weight=51;

        Cat cat3=new Cat("name3",5,6,7);
        cat3.name="khgk";
        cat3.age=10;
        cat3.strength=15;
        cat3.weight=53;
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
