package com.company;

public class Main {

    public static void main(String[] args) {
       createObject("Mers").Print();
       createObject("Tayota").Print();
        createObject("Bmw" ).Print();

    }

    public static Car createObject(String className) {
        if (className.equals(Mers.class.getSimpleName()))
        return new Mers(2005, "amg ", 2.3, " Black");
         else if  (className.equals(Tayota.class.getSimpleName()))
        return new Tayota(" artur", " camry", 2.1, " White");
        else if (className.equals(Bmw.class.getSimpleName()))
        return new Bmw(2008,3.2,"ai8"," pink");
        else return null;
    }

}
