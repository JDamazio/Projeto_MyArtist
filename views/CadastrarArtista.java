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
        artista.SetCpf(Console.readString("Digite o CPF do artista: "));
        artistaController.cadastrar(artista);
        System.out.println("\n Artista cadastrado com SUCESSO !! \n");
    }
}
