package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String NAME;
    private int HEIGHT;
    private String COLOR;
    public Dog(String name){
        this.NAME=name;
    }
    public Dog(String name,int height) {
        this.NAME = name;
        this.HEIGHT = height;
    }
    public Dog(String name,int height,String color) {
        this.NAME = name;
        this.HEIGHT = height;
        this.COLOR=color;
    }


}
