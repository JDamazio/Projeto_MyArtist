package views;

import controllers.ArtistaController;
import models.Artista;
import utils.Console;

public class CadastrarArtista {
    
    public void renderizar() {
        Artista artista = new Artista();
        ArtistaController artistaController = new ArtistaController();

        System.out.println("\n -- CADASTRO DE ARTISTA -- \n");
        artista.setNome(Console.readString("Digite o nome do artista: "));

        artista.setSexo(Console.readString("Digite seu sexo: "));

        artista.setServico(Console.readString("Serviço a ser prestado: "));

        artista.setDataNasc(Console.readString("Digite sua data de nascimento: "));

        artista.SetCpf(Console.readString("Digite o CPF do artista: "));

        artistaController.cadastrar(artista);
        System.out.println("\n Artista cadastrado com SUCESSO !! \n");
    }
}
