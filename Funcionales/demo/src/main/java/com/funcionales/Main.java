package com.funcionales;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        /*
         * MiPredicate<Integer> esPar = (n) -> { // Cumple si es Par
         * int resto = n % 2;
         * if (resto == 0) {
         * return true;
         * } else {
         * return false;
         * }
         * };
         * System.out.println("Es Par: " + esPar.evaluar(11));
         * System.out.println("Es Par: " + esPar.evaluar(12));
         * 
         * MiPredicate<int[]> mayorA10 = (n) -> {
         * int contador = 0;
         * for (int i = 0; i < n.length; i++) {
         * if (n[i] > 10) {
         * contador++;
         * }
         * }
         * if (contador == 0) {
         * return false;
         * } else {
         * return true;
         * }
         * };
         * System.out.println("Mayor a 10: " + mayorA10.evaluar(new int[] { 5, 15, 20
         * }));
         * 
         * MiPredicate<String> esVacia = (s) -> {
         * if (s.length() == 0) {
         * return true;
         * } else {
         * return false;
         * }
         * };
         * 
         * System.out.println("Es Vacia: " + esVacia.evaluar("a"));
         * 
         * Predicate<String> esVacia1 = (s) -> {
         * if (s.length() == 0) {
         * return true;
         * } else {
         * return false;
         * }
         * };
         * 
         * MyConsumer<Persona> imprimiEstadisticas = (p) -> {
         * System.out.println("Nombre: " + p.nombre());
         * System.out.println("Apellido: " + p.apellido());
         * System.out.println("Edad: " + p.edad());
         * };
         * 
         * System.out.println("Estadisticas de la persona: ");
         * // Persona persona = new Persona("Juan", "Perez", 30);
         * // imprimiEstadisticas.consumir(persona);
         * 
         * /*
         */
        /*
         * MyConsumer<Persona> consumer = (persona) -> {
         * System.out.println("Nombre: " + persona.nombre);
         * System.out.println("Apellido: " + persona.apellido);
         * System.out.println("Edad: " + persona.edad);
         * };
         * 
         * consumer.consumir(new Jefe("Juan", "Perez", 45));
         * consumer.consumir(new Empleado("Maria", "Gomez", 30));
         * 
         * Consumer<Persona> consumer2 = (persona) -> {
         * System.out.println("Nombre: " + persona.nombre);
         * System.out.println("Apellido: " + persona.apellido);
         * System.out.println("Edad: " + persona.edad);
         * };
         */

        Supplier<Persona> persona = () -> {
            int edad = (int) (Math.random() * 100);
            if (edad < 50) {
                Persona p = new Empleado("Maria", "Gomez", edad);
                return p;
            } else {
                Persona p = new Jefe("Kelly", "Yar", edad);
                return p;
            }

        };
        persona.get().apellido = "Gomez";

        MySupplier<Persona[][]> mapa = () -> {
            int min = 5;
            int max = 10;

            int filas = (int) (Math.random()*(max - min + 1))+ min;
            int columnas = (int)(Math.random()*(max - min + 1))+ min;

            Persona[][] matriz = new Persona[filas][columnas];
            return matriz;
        };
        
        String a = null;
        int b = a.length();

        Function<Integer , Persona> f = (Integer i) -> {
            if(i == 50){
                return new Empleado("Maria", "Gomez", 30);
            }else{
                return new Jefe("Kelly", "Yar", 19);
            }
        };
    }
}
