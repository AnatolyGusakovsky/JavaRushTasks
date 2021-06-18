package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int),
 вес (weight, int), сила (strength, int).
*/

public class Cat
{  public String name="Буся";
    public int age=5;

    Cat cat=new Cat();
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String setName(){
        return name;
    }
    int setAge(){
        return age;
    }
}
