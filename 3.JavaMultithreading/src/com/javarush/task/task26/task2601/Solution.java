package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static Integer[] sort(Integer[] array) {
//        Arrays.sort(array);
//        int median  = array[array.length/2];
//
//        //implement logic here
//        return array;
//    }
//}

// learn how to use comparable
class Dog implements Comparable<Dog> {
  private String name;
  private int height;

  public Dog(String name, int height) {
    this.name = name;
    this.height = height;
  }


  public int compareTo(Dog dog) {
    return this.height - dog.height;
  }

  public static void main(String[] args) {
    ArrayList<Dog> dogList = new ArrayList<>();
    for (int i = 10; i > 0; i--) {
      dogList.add(new Dog("Dog" + i, i * 2));
    }

//    System.out.println(dogList.get(0).compareTo(dogList.get(1)));
//    Collections.sort(dogList);
    dogList.forEach((dog) -> {
      System.out.println(dog.name + ", my height is: " + dog.height);
    });
  }

}