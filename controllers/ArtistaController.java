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

    public static void excluirArista(Artista a) {
		int index = artistas.indexOf(a);
		if(index < 0 || index >= size()) artistas.remove(index);
	}
    
    private static int size() {
        return 0;
    }

    public static Boolean exists(Artista a){
		return artistas.contains(a);
	}

    // public Artista buscarPorNome(String nome){
    //     for (Artista artistaCadastrado : artistas) {
    //         if(artistaCadastrado.getNome().equals(nome)){
    //             return artistaCadastrado;
    //         }
    //     }
    //     return null;
    // }
}
