package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
 Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста.
  А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    private String NAME;
    private int AGE;
    private int Sage=3;
    private int WEIGHT;
    private int Sweight=4;
    private String COLOR;
    private String ADRESS;
    public Cat(String name){
        this.NAME=name;
    }//Просто именной кот
    public Cat(String name,int age,int weight) {
        this.NAME = name;
        this.WEIGHT = weight;
        this.AGE = age;
        if(age==0)
            age=Sage;
        if(weight==0)
            weight=Sweight;
    }// кот с тремя инициализаторами
    public Cat(String name,int age) {
        this.NAME = name;
        this.AGE = age;
    }// со стандартным весом
    public Cat(int weight,String color,String name,String adress,int age) {
        this.WEIGHT = weight;
        this.COLOR = color;
        name=null;
        adress=null;
        age=0;
        if(weight==0)
            weight=Sweight;
    }//бездомный кот
    public Cat(int weight,String color,String adress) {
        this.WEIGHT = weight;
        this.COLOR = color;
        this.ADRESS = adress;
        if(weight==0)
            weight=Sweight;
    }//чужой домашний кот







}