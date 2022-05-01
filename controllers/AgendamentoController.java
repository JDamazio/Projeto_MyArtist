package controllers;

import java.util.ArrayList;

import models.Agendamento;

public class AgendamentoController {

    private static ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public void cadastrar(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }
    public ArrayList<Agendamento> listar() {
        return agendamentos;
    }
}
