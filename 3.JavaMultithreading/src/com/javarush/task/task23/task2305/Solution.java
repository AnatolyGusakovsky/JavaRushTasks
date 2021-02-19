package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution solution1 = new Solution();
InnerClass innerClass11 = solution1.new InnerClass();
        solution1.innerClasses = new InnerClass[] {innerClass11};

        Solution solution2 = new Solution();
        solution2.innerClasses = new InnerClass[] {solution2.new InnerClass()};

Solution [] arr = new Solution[] {solution1, solution2};
     return arr;
    }

    public static void main(String[] args) {

    }
}
