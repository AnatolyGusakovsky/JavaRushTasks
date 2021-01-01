package com.javarush.test.level05.lesson09.task05;
/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/
public class Rectangle{
    private int LEFT;
    private int TOP;
    private int WIDTH;
    private int HEIGHT;
    private int cLEFT;
    private int cTOP;
    private int cWIDTH;
    private int cHEIGHT;
    public Rectangle(int left,int top,int width,int height){
        this.LEFT=left;
        this.TOP=top;
        this.WIDTH=width;
        this.HEIGHT=height;
    }//1.заданы все четыре параметра
    public Rectangle(int left,int top) {
        this.LEFT = left;
        this.TOP = top;
        int width = 0;
        int height = 0;
    }//2.ширина,высота=0
    public Rectangle(int left,int top,int width){
        this.LEFT=left;
        this.TOP=top;
        this.WIDTH=width;
        int height=width;
    }//высота = ширина => квадрат
    public Rectangle(Rectangle a){
        this.cLEFT=LEFT;
        this.cHEIGHT=HEIGHT;
        this.cTOP=TOP;
        this.cWIDTH=WIDTH;
    }//копия другого прямоугольника(он передается в параметрах)
}
