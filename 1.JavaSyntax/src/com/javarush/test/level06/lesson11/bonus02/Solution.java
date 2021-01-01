package com.javarush.test.level06.lesson11.bonus02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Cat name is дедушка Вася, no mother, no father
        Cat name is бабушка Мурка, no mother, no father
        Cat name is папа Котофей, no mother, father is дедушка Вася
        Cat name is мама Василиса, mother is бабушка Мурка, no father
        Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFa = reader.readLine();
        String grMa = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat grandFather = new Cat(grFa);
        Cat grandMother = new Cat(grMa);
        Cat father = new Cat(fatherName, grandFather, null);
        Cat mother = new Cat(motherName, null, grandMother);
        Cat son = new Cat(sonName, father, mother);
        Cat daughter = new Cat(daughterName, father, mother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.print(daughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            return "Cat name is " + name +
                    ((parentMother != null) ? ", mother is " + parentMother.name : ", no mother") +
                    ((parentFather != null) ? ", father is " + parentFather.name : ", no father");
        }
    }
}