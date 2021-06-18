package com.javarush.test.level05.lesson07.task02;
/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/
public class Cat {
    private String catname;
    public void initialize(String name) {
        this.catname = name;
    }
    private String catname1;
    private int catage1;
    private int cateage1Sredn;
    private int catweight1Sredn;
    private int catweight1;
    public void initialize(String name, int age,int weight,int ageSredn,int weightSredn) {
        this.catname1 = name;
        this.catage1 = age;
        this.catweight1 = weight;
        if (age == 0)
            age = ageSredn;
        if (weight==0)
            weight=weightSredn;

    }
    private String catname2;
    private int catage2;
    private int catage2Sredn;
    public void initialize(String name,int age,int ageSredn) {
        this.catname2 = name;
        this.catage2 = age;
        if(age==0)
            age=ageSredn;
    }
    private String catcolor3;
    private String catcolor3Sredn;
    private int catweight3;
    private int catweight3Sredn;
    public void initialize(String color,String colorSredn,int weight,int weightSredn){
        this.catcolor3=color;
        this.catweight3=weight;
        if(color==null)
            color=colorSredn;
        if(weight==0)
            weight=weightSredn;
    }
    private String catcolor4;
    private String catcolor4Sredn;
    private String catadress4;
    private int catweight4;
    private int catweight4Sredn;
    public void initialize(String color,String adress,String colorSredn,int weightSredn,int weight){
        this.catcolor4= color;
        this.catadress4=adress;
        this.catweight4=weight;
        if(color==null)
            color=colorSredn;
        if(weight==0)
            weight=weightSredn;
    }
}
