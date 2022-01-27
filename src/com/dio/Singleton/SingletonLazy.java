package com.dio.Singleton;

/**
 * Singleton "Preguiçoso".
 *
 * @author Guilherme-Buasquevicz
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
