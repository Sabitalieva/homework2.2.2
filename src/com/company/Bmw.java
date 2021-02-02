package com.company;

public class Bmw  extends Car {
    private int age;

    public Bmw (int age,double volume, String mark,String color){
        super(mark, volume, color);
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge (){
        return age;
    }

    public void Print() {
        System.out.println("Mark"+super.getMark()+"Volume"+super.getVolume()+"Color"+super.getColor()+"Age"+getAge());
    }



}
