package com.company;

public class Mers extends Car  {
    private double diometr;

    public Mers (int age, String mark, double volume , String color){
       super( mark,volume, color);
    }

    public void setDiometr(double diometr) {
        this.diometr = diometr;
    }
    public double getDiometr(){
        return diometr;
    }


    public void Print() {
        System.out.println("Mark :"+super.getMark()+" Volume "+super.getVolume()+" Color "+super.getColor()+" diometr "+getDiometr());
    }

}
