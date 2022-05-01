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
}
