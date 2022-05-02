package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorCpf(String cpf){
        for (Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

    public static void editar(Cliente cliente) {
		int index = clientes.indexOf(cliente);
		if(index > 0) clientes.add(index, cliente);
	}

    public  static void excluirCliente(Cliente c) {
		int index = clientes.indexOf(c);
		if(index < 0 || index >= size()) clientes.remove(index);
	}
    private static int size() {
        return 0;
    }

    public static Boolean exists(Cliente c){
		return clientes.contains(c);
	}
}
