package com.company;

public class Tayota extends Car {
    private String voditel;

    public Tayota ( String voditel ,String mark, double volume , String color){
        super ( mark,volume, color);
        this.voditel = voditel;
    }

    public String getVoditel() {
        return voditel;
    }

    public void Print() {
        System.out.println("Color"+super.getColor()+"Mark"+super.getMark()+"Volume"+super.getVolume()+"Voditel"+ getVoditel());
    }

}

