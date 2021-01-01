package com.javarush.test.level05.lesson12.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/
public class Solution {
    public static void main(String[] args) {
        // Создай по два объекта каждого класса тут
        Man q = new Man("Dima", 12, "rublevka 1");
        Man qq = new Man("Andrey", 23, "rublevka 2");
        Woman w = new Woman("Jena", 17, "rublevka 3");
        Woman ww = new Woman("Mary", 19, "rublevka 4");
        // Выведи их на экран тут
        System.out.println(q.name + " " + q.age + " " + q.address);
        System.out.println(qq.name + " " + qq.age + " " + qq.address);
        System.out.println(w.name + " " + w.age + " " + w.address);
        System.out.println(ww.name + " " + ww.age + " " + ww.address);
    }
    public static class Man {

        String name;
        int age;
        String address;
        public Man(String name,int age,String adress){
            this.name=name;
            this.age=age;
            this.address=adress;

        }
    }
    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name,int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

        // Напиши тут свои классы
    }

}