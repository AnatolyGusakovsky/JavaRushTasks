package com.javarush.task.task29.task2909.human;

public class Worker extends Human {
    private double salary;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    private String company;

    public Worker(String name, int age) {
        super(name, age);
    }

    public void live() {
        this.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}