package views;

import utils.Console;
import controllers.ClienteController;
import models.Cliente;

public class CadastrarClientes {

    public void renderizar() {
        Cliente cliente = new Cliente();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.SetCpf(Console.readString("Digite o CPF do cliente: "));
        cliente.SetCel(Console.readString("Digite o número do celular: "));
        clienteController.cadastrar(cliente);
        System.out.println("\n Cliente cadastrado com SUCESSO !! \n");
    }
}
