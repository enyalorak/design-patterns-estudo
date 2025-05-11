package onde.digitalinnovation.gof;

import onde.digitalinnovation.gof.facade.Facade;
import onde.digitalinnovation.gof.strategy.*;

public class Teste {
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //strategy
        //Permite escolher o algoritmo a ser executado em tempo de execução.


        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        //padrão Strategy permite trocar o algoritmo ou comportamento em tempo de execução
        robo.setComportamento(normal); //podemos mudar o comportamento a qualquer hora
        robo.mover();
         Facade facede = new Facade();
         facede.migrarCliente("Karol", "69001111");
    }

}
