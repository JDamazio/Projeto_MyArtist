package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

public class DeletarCliente {

    private static Cliente cliente;
    ClienteController clienteController = new ClienteController();

    public void renderizar() {
		
        System.out.println("\n === DELETAR CLIENTE === \n");
		String cpfCliente = Console.readString("Digite o CPF do cliente: ");
        cliente = clienteController.buscarPorCpf(cpfCliente);
		
		
            if (cliente == null) {
				System.out.println("\n Cliente não encontrado! \n");
			} else {
				DeletarCliente.printCliente();
				System.out.println("\nDeseja deletar esse cliente?");
				System.out.println("\nATENÇÃO: Perca permanente! ");
			
				String opcao = Console.readString("[sim/nao]");
				if("sim".equals(opcao)) {
					ClienteController.excluirCliente(cliente);
					if(!ClienteController.exists(cliente)){
						System.out.println("\nCliente deletado com SUCESSO!!");
					}else{
						System.out.println("\nERRO ao deletar!!");
					}
				} 
			}
	}
    
    public static void printCliente() {
		System.out.println("\nNome: " + cliente.getNome());
	}
}
