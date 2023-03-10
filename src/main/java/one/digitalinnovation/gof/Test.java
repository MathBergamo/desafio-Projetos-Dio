package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.*;
import one.digitalinnovation.gof.facade.Facade;

public class Test {
    public static void main(String[] args) {
        //Testes das instancias dos singletons
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstancia();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);

        System.out.println();
        System.out.println();
        //Testes de Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);

        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);

        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();

        facade.migrarCliente("Venilton","1234567");

    }
}
