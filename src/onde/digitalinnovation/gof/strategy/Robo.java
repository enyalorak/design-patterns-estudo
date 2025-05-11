package onde.digitalinnovation.gof.strategy;
/*
* exemplo do padrão de projeto Strategy. Esse padrão é
* usado quando eu quero mudar o comportamento de um objeto
* (neste caso, o robô) em tempo de execução, sem ter que alterar
* o código da classe principal.
Em vez de colocar vários ifs ou switchs dentro da classe Robo
*  eu deixo o comportamento separado em classes específicas
* (como ComportamentoAgressivo, ComportamentoDefensivo, etc.)
* Assim, posso trocar o comportamento com setComportamento() de forma bem flexível e limpa.
* */



public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
