package org.example;

public class Main {
    public static void main(String[] args) {

        Persona personaA = new Persona("Alison");
        System.out.print(personaA.name);
        System.out.print(personaA.numPersonas);
        Persona personaB = new Persona("Sebastian");
        System.out.print(personaB.name);

        System.out.println(personaB.numPersonas);
        System.out.print(personaA.numPersonas);
        System.out.println(Persona.numPersonas);

        Map prueba = new Map();
        Map segundaPrueba = new Map(3);
        prueba.testNoStatic();
        segundaPrueba.test();

        Map.mapexample();

    }
}