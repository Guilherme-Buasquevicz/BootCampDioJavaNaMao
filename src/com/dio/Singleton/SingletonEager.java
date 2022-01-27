package com.dio.Singleton;

/**
 * Singleton "Apressado".
 *
 * @author Guilherme-Buasquevicz
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
