package com.javarush.test.level08.lesson11.home06;

import java.util.ArrayList;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> child=new ArrayList<Human>();
        Human child1=new Human("child1",true,20,child);
        child.add(child1);
        Human child2=new Human("child2",true,20,child);
        child.add(child2);
        Human child3=new Human("child3",true,20,child);
        child.add(child3);
        ArrayList<Human> parents=new ArrayList<Human>();
        Human father=new Human("father",true,35,parents);
        Human mother=new Human("mother",false,35,parents);
        ArrayList<Human> gparents=new ArrayList<Human>();
        Human gfather1=new Human("gfather1",true,65,gparents);
        Human gfather2=new Human("gfather2",true,64,gparents);
        Human gmother1=new Human("gmother1",false,60,gparents);
        Human gmother2=new Human("gmother2",false,61,gparents);
        System.out.println(gfather1);
        System.out.println(gfather2);
        System.out.println(gmother1);
        System.out.println(gmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<Human>();
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
