package onde.digitalinnovation.gof.subsistema1.crm;

/**
 * Esta classe simula um sistema de CRM (Customer Relationship Management).
 * o metodo `gravarCliente` imprime os dados recebidos no console.
 */

public class CrmService {
    // construtor privado impede instanciar objetos dessa classe
    private CrmService(){
        super();
    }
    // metodo estático para "gravar" (simular) um cliente
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
