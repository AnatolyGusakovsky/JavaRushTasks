package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("ded1",true, 55);
        Human ded2 = new Human("ded2", true, 66);
        Human baba1 = new Human("baba1", false, 77);
        Human baba2 = new Human("baba2", false, 88);

        Human papa = new Human("papa", true, 30, ded1, baba1);
        Human mama = new Human("mama", false, 30, ded2, baba2);

        Human son1 = new Human("son1", true, 10, papa, mama);
        Human son2 = new Human("son2", true, 10, papa, mama);
        Human son3 = new Human("son3", true, 10, papa, mama);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());

        System.out.println(papa.toString());
        System.out.println(mama.toString());

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, Boolean sex, int age)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human (String name, Boolean sex,int age,Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother=mother;
            this.father=father;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}