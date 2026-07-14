package com.funcionales;

@FunctionalInterface
public interface MyFuction<K, V> {
    V generar(K s);
}
