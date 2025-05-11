package onde.digitalinnovation.gof;
/*Esse é o Singleton "apressado" (Eager),
porque ele já cria a instância no momento em
que a classe é carregada, mesmo que a gente não vá usar.*/


public class SingletonEager {
    //no momento que a variavel static é definida
    //ele já tribui a instancia
    //não precisa fazer a verificação igual o lazy
    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){

        return instancia;
    }
}
