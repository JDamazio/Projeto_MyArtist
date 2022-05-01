package views;

import controllers.ArtistaController;
import models.Artista;

public class ListarArtista {
    
    public void renderizar(){
        ArtistaController artistaController = new ArtistaController();

        System.out.println("\n -- LISTAGEM DE ARTISTAS -- \n");

        for (Artista artistaCadastrado : artistaController.listar() ) {
            System.out.println(artistaCadastrado);
        }
    }
}
