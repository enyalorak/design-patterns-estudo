package onde.digitalinnovation.gof.facade;

import onde.digitalinnovation.gof.subsistema2.cep.CEPApi;
import onde.digitalinnovation.gof.subsistema1.crm.CrmService;
/*

Facade - Simplifica o uso de várias classes por meio de uma interface unificada.
serve para simplificar o acesso a subsistemas complexos atraves de uma unica interface

- Facade chama os métodos do CEPApi e do CrmService.
- O usuário não precisa saber que existem dois subsistemas por trás (CEP e CRM).
- Padrões de Projeto usados:

Facade: para simplificar a interface.
Singleton: para garantir uma instância única da CEPApi.

*/
public class Facade {
    //
    public void migrarCliente(String nome, String cep){
        String cidade = CEPApi.getInstance().recuperarCidade(cep);
        String estado = CEPApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep,cidade, estado);

    }

}
