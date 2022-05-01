package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

public class EditarCliente {
    
    private static Cliente cliente;
    ClienteController clienteController = new ClienteController();

    public void renderizar() {
		
		System.out.println("\n === EDIÇÃO DE CLIENTE === \n");
		String cpfCliente = Console.readString("Digite o CPF do cliente: ");
		cliente =  clienteController.buscarPorCpf(cpfCliente);

		if (cliente == null) {
			System.out.println("\n Cliente não encontrado! \n");
		} else {
			EditarCliente.printClient();
			cliente.setNome(
				Console.readString(
					String.format("Nome: [%s]", cliente.getNome())
				)
			);
            cliente.SetCpf(
				Console.readString(
					String.format("CPF: [%s]", cliente.getCpf())
				)
			);
            cliente.SetDataNasc(
				Console.readString(
					String.format("Nascimento: [%s]", cliente.getDataNasc())
				)
			);
            cliente.SetCel(
				Console.readString(
					String.format("CEL: [%s]", cliente.getCel())
				)
			);
			ClienteController.editar(cliente);
			System.out.println("\nEditado com SUCESSSO!!");
		}
	}

	public static void printClient() {

        System.out.println("\n--Editar cliente--");
		System.out.println("Nome: " + cliente.getNome());
        System.out.println("------------------");
        System.out.println("\n==Editar==");
	}
}
