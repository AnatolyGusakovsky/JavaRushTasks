package com.javarush.test.level05.lesson09.task01;
/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/
public class Friend{
    private String name;//общ.имя
    private int age;//общ.возраст
    private String pol;//общ.пол
    public Friend(String name){
        this.name=name;
    }//Имя
    public Friend(String name,int age){
        this.name=name;
        this.age=age;
    }//Имя,возраст
    public Friend(String name,int age,String pol){
        this.name=name;
        this.age=age;
        this.pol=pol;
    }
}