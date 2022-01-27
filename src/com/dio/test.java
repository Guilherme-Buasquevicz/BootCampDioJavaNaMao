package com.dio;

import com.dio.Singleton.SingletonEager;
import com.dio.Singleton.SingletonLazy;
import com.dio.Singleton.SingletonLazyHolder;
import com.dio.Strategy.*;
import com.dio.facade.Facade;

public class test {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("-----");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("-----");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento ofensivo = new ComportamentoOfensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("-----");

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        System.out.println("-----");

        robo.setComportamento(ofensivo);
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "1221212");
    }
}
