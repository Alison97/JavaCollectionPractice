package org.example;

public class Persona {
    public String name;
    public static int numPersonas=0;

    public Persona(String name){
        this.numPersonas = numPersonas + 1;
        this.name = name;
    }
}
