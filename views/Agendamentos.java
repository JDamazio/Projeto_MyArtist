package views;

import controllers.AgendamentoController;
import models.Agendamento;

public class Agendamentos {

    public void renderizar(){
        AgendamentoController agendamentoController = new AgendamentoController();      
        System.out.println("\n -- Agendamentos -- \n");
        for (Agendamento agendamentoCadastrado : agendamentoController.listar()) {
            System.out.println(agendamentoCadastrado);
        }
    }
}
