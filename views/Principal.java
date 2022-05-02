package views;

import utils.Console;

public class Principal {
    public static void main (String[] args) {

        int opcao = 0, opcaoEditar;
        do{
            System.out.println("\n\n\n\t  ====  My artist  ==== \n");

            System.out.println("\t| 0 - Sair\t\t|");
            System.out.println("\t|=======================|");
            System.out.println("\t| 1 - Cadastrar Cliente\t|");
            System.out.println("\t| 2 - Listar Clientes\t|");
            System.out.println("\t| 3 - Cadastrar Artista\t|");
            System.out.println("\t| 4 - Listar Artistas\t|");
            System.out.println("\t| 5 - Cadastrar Produto\t|");
            System.out.println("\t| 6 - Listar Produtos\t|");
            System.out.println("\t| 7 - Agendar\t\t|");
            System.out.println("\t| 8 - Agendamentos\t|");
            System.out.println("\t|=======================|");
            System.out.println("\t| 9 - Editar\t\t|\n");
            
            opcao = Console.readInt("\t Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarClientes cadastrarClientes = new CadastrarClientes();
                    cadastrarClientes.renderizar();
                    break;
                case 2:
                    ListarClientes listarClientes = new ListarClientes();
                    listarClientes.renderizar();
                    break;
                case 3:
                    CadastrarArtista cadastrarArtista = new CadastrarArtista();
                    cadastrarArtista.renderizar();
                    break;
                case 4:
                    ListarArtista  listarArtista = new ListarArtista();
                    listarArtista.renderizar();
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.renderizar();
                    break;
                case 6:
                    ListarProduto listarProduto = new ListarProduto();
                    listarProduto.renderizar();
                    break;
                case 7:
                    Agendar agendar = new Agendar();
                    agendar.renderizar();
                    break;
                case 8:
                    Agendamentos agendamentos = new Agendamentos();
                    agendamentos.renderizar();
                    break;
                case 9:
                    System.out.println("\n\t   ==== EDITANDO ==== \n");
                    System.out.println("\t| 1 - Editar Artista\t|");
                    System.out.println("\t| 2 - Editar Cliente\t|");
                    System.out.println("\t| 3 - Editar Produto\t|");
                    System.out.println("\t|=======================|");
                    System.out.println("\t| 4 - Deletar Artista\t|");
                    System.out.println("\t| 5 - Deletar Cliente\t|\n");


                    opcaoEditar = Console.readInt("\t Digite uma opção: ");

                    switch (opcaoEditar) {
                        case 1:
                            EditarArtista editarArtista = new EditarArtista();
                            editarArtista.renderizar();
                            break;
                        case 2:
                            EditarCliente editarCliente = new EditarCliente();
                            editarCliente.renderizar();
                            break;
                        case 3:
                            EditarProduto editarProduto = new EditarProduto();
                            editarProduto.renderizar();
                            break;
                        case 4:
                            DeletarArtista deletarArtista = new DeletarArtista();
                            deletarArtista.renderizar();
                            break;
                        case 5:
                            DeletarCliente deletarCliente = new DeletarCliente();
                            deletarCliente.renderizar();
                            break;
                        default:
                            System.out.println("\n --OPÇÃO INVÁLIDA (d)-- \n");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                    default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
                }

        } while (opcao !=0);
    }
}