package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setStudents(List students) {
        this.students = students;
    }

    public List getStudents() {
        return students;
    }


    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double grade) {
       for(int i = 0; i < students.size(); i++) {
           if(students.get(i).getAverageGrade() == grade)
               return students.get(i);
       }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        if(students.size()>0){
            Student stWithMaxAverageGrade = students.get(0);
            for(int i = 0; i < students.size(); i++) {
                if(students.get(i).getAverageGrade() > stWithMaxAverageGrade.getAverageGrade())
                    stWithMaxAverageGrade = students.get(i);
            }
            return stWithMaxAverageGrade;
        }
       return null;
    }

    public Student getStudentWithMinAverageGrade(){
        if(students.size()>0){
            Student stWithMinAverageGrade = students.get(0);
            for(int i = 0; i < students.size(); i++) {
                if(students.get(i).getAverageGrade() < stWithMinAverageGrade.getAverageGrade())
                    stWithMinAverageGrade = students.get(i);
            }
            return stWithMinAverageGrade;
        }
        return null;
    }

    public void expel(Student student){
        students.remove(student);
    }
}