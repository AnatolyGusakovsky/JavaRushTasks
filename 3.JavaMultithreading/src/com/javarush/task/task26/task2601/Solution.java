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

// Implementation of usage Comparable interface
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


// Implementation of usage Java Comparator Interface
// todo: finish with theory and implement below
class Cat {
  private String name;
  private int height;

  public Cat(String name, int height) {
    this.name = name;
    this.height = height;
  }

  public static void main(String[] args) {
    ArrayList<Cat> catList = new ArrayList<>();
    for (int i = 10; i > 0; i--) {
      catList.add(new Cat("Cat" + i, i * 2));
    }

//    System.out.println(catList.get(0).compareTo(catList.get(1)));
    Collections.sort(catList);

    catList.forEach((cat) -> {
      System.out.println(cat.name + ", my height is: " + cat.height);
    });
  }

  class CatComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
      return o1.height - o2.height;
    }
  }
}

// todo: check that catsort works properly
// todo: add both of above examples to my new project-library and knowledgebase doc