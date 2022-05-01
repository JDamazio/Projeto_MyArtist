package controllers;

import java.util.ArrayList;

import models.Artista;

public class ArtistaController {
    
    private static ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void cadastrar(Artista artista) {
        artistas.add(artista);
    }

    public ArrayList<Artista> listar() {
        return artistas;
    }

    public Artista buscarPorCpf(String cpf){
        for (Artista artistaCadastrado : artistas) {
            if(artistaCadastrado.getCpf().equals(cpf)){
                return artistaCadastrado;
            }
        }
        return null;
    }

    public static void editar(Artista artista) {
		int index = artistas.indexOf(artista);
		if(index > 0) artistas.add(index, artista);
	}

    public  static void excluirArtista(Artista a) {
		int index = artistas.indexOf(a);
		if(index > 0) artistas.remove(index);
	}

    public static boolean exists(Artista a){
		return artistas.contains(a);
	}
}
