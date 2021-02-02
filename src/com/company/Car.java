package com.company;


public  class Car implements Printable {
    private double volume;
    private String mark;
    private String color;

    public Car(String mark, double volume, String color) {
        this.mark = mark;
        this.volume = volume;
        this.color = color;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Print() {
        System.out.println("Mark "+getMark()+"Volume "+getVolume()+"Color "+getColor());
    }
}

