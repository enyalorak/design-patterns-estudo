package onde.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robô está movendo-se agressivamente...");
    }
}
