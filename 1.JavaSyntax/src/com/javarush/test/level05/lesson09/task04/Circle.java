package com.javarush.test.level05.lesson09.task04;
/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/
public class Circle{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;
    public Circle(int x,int y,int radiuus){
        this.centerX=x;
        this.centerY=y;
        this.radius=radiuus;
    }
    public Circle(int x,int y,int radiuus,int widthh){
        this.centerX=x;
        this.centerY=y;
        this.radius=radiuus;
        this.width=widthh;
    }
    public Circle(int x,int y,int radiuus,int widthh,String colorr) {
        this.centerX = x;
        this.centerY = y;
        this.radius = radiuus;
        this.width = widthh;
        this.color = colorr;
    }
}
