package onde.digitalinnovation.gof;

/*
Singleton preguiçoso
Permitir a criação de uma única instância de uma classe
 e fornecer um modo para recuperá-la.

 só cria a instância quando chamamos o metodo pela primeira vez
 Isso economiza recursos se a instância não for usada
* */

public class SingletonLazy {
    // A instância só será criada quando for solicitada

    private static SingletonLazy instancia;

    public SingletonLazy(){

    }

    public static SingletonLazy getInstance(){
        if(instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
