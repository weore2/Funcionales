package com.funcionales;

@FunctionalInterface
public interface MiPredicate<T> { //Agregamos el tipo generico T para que pueda recibir cualquier tipo de dato
    boolean evaluar(T objeto); //
}