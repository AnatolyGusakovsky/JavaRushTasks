package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/
public class Circle
{
    private int circlecenterX;
    private int circlecenterY;
    private int circleradius;
    public void initialize(int centerX,int centerY,int radius){
        this.circlecenterX=centerX;
        this.circlecenterY=centerY;
        this.circleradius=radius;
    }
    private int circlecenterX1;
    private int circlecenterY1;
    private int circleradius1;
    private int circlewidth1;
    public void initialize(int centerX,int centerY,int radius,int width){
        this.circlecenterX1=centerX;
        this.circlecenterY1=centerY;
        this.circleradius1=radius;
        this.circlewidth1=width;
    }
    private int circlecenterX2;
    private int circlecenterY2;
    private int circleradius2;
    private int circlewidth2;
    private String circlecolor2;
    public void initialize(int centerX,int centerY,int radius,int width,String color){
        this.circlecenterX2=centerX;
        this.circlecenterY2=centerY;
        this.circleradius2=radius;
        this.circlewidth2=width;
        this.circlecolor2=color;}
}
