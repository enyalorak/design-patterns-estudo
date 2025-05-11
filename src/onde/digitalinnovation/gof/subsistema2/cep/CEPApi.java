package onde.digitalinnovation.gof.subsistema2.cep;
//simulacao de uma API que retorna informações com base no CEP
//implementada como Singleton (uma única instância)
public class CEPApi {
    //instancia unica - singleton
    private static CEPApi instancia = new CEPApi();

    // Construtor privado para não permitir criar objetos fora da classe
    private CEPApi(){
        super();
    }
    // metodo publico p retornar a unica instancia
    public static CEPApi getInstance(){

        return instancia;
    }
    // simula a busca da cidade e estado com base no CEP
    public String recuperarCidade(String cep){
        return "Colatina";
    }

    public String recuperarEstado(String estado){
        return "ES";
    }
}
