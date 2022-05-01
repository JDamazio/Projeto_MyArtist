package controllers;

import java.util.ArrayList;

import models.Produto;

public class ProdutoController {
    
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void cadastrar(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listar() {
        return produtos;
    }
    public Produto buscarPorProduto(String produto){
        for (Produto produtoCadastrado : produtos) {
            if(produtoCadastrado.getProduto().equals(produto)){
                return produtoCadastrado;
            }
        }
        return null;
    }

    public static void editar(Produto produto) {
		int index = produtos.indexOf(produto);
		if(index > 0) produtos.add(index, produto);
	}
}
