package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    // test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
    // Test --> Referenztyp (reference type)
    // Object <--> Instanz

    Test test  = new Test();  // aus der Klassse ein neues Objekt erzeugen!
    System.out.println("Referenzvariable: " + test); // => test = Referenzvariable
    test.showAddress();  // => test = Referenztyp

    }

}
