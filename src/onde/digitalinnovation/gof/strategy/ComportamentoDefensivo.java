package onde.digitalinnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{

        @Override
        public void mover() {
            System.out.println("O robô está movendo-se defensivamente...");
        }
    }


