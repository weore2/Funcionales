package com.funcionales;

@FunctionalInterface
public interface MyConsumer <K> { //Agregamos el tipo generico K para que pueda recibir cualquier tipo de dato
    void consumir(K s); //Método abstracto que recibe un objeto de tipo K y devuelve void
}
