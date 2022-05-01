package views;

import controllers.AgendamentoController;
import controllers.ArtistaController;
import controllers.ClienteController;
import controllers.ProdutoController;
import models.Agendamento;
import models.Artista;
import models.Cliente;
import utils.Console;
import models.Produto;

public class Agendar { //Relacionar
    
    public void renderizar() {
        Agendamento agendamento = new Agendamento();
        ArtistaController artistaController = new ArtistaController();
        AgendamentoController agendamentoController = new AgendamentoController();
        ClienteController clienteController = new ClienteController();
        ProdutoController produtoController = new ProdutoController();

        System.out.println("\n\t -- AGENDAR -- \t\n");

        //INFO do cliente
        String cpfCliente = Console.readString("Digite o CPF do cliente: ");
        Cliente cliente = clienteController.buscarPorCpf(cpfCliente);
        if (cliente != null) {
            agendamento.setCliente(cliente);

            //INFO do artista
            String cpfArtista = Console.readString("Digite o CPF do funcionário: ");
            Artista artista = artistaController.buscarPorCpf(cpfArtista);
            if (artista != null) {
                agendamento.setArtista(artista);
                
                //INFO do produto
                String nomeProduto = Console.readString("Digite o nome do produto: ");
                Produto produto = produtoController.buscarPorNome(nomeProduto);
                if (produto != null) {
                    agendamento.setProduto(produto);
                    agendamentoController.cadastrar(agendamento);
                    System.out.println("Agendamento realizado com sucesso!");
                }else{
                    System.out.println("Produto não encontrado!");
                }
            }else{
                System.out.println("Artista não encontrado!");
            }
        }else{
            System.out.println("Cliente não encontrado!");
        }
    }
}
