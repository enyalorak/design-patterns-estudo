package onde.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("O robô está movendo-se normalmente...");
    }
}
