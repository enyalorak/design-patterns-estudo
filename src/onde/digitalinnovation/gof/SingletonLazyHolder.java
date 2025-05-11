package onde.digitalinnovation.gof;
/* Singleton LazyHolder
SingletonLazyHolder é uma implementação do padrão
Singleton usando classe interna estática.
A grande sacada dessa abordagem é que o Java só
carrega a classe interna quando ela for usada pela primeira vez

A classe SingletonLazyHolder é carregada na memória, mas sem criar nenhuma instância ainda.
quando você chama SingletonLazyHolder.getInstancia(),
o Java carrega a classe interna Holder pela primeira vez.

Nesse momento, a INSTANCIA é criada exatamente uma vez, de forma segura e sem concorrência


* */
public class SingletonLazyHolder {

    private SingletonLazyHolder() {
        super();
    }

    // Classe estática interna que só será carregada quando chamar getInstance
    private static class Holder {
        private static final SingletonLazyHolder INSTANCIA = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.INSTANCIA;
    }
}


