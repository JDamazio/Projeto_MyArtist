package views;

import controllers.ProdutoController;
import models.Produto;
import utils.Console;

public class CadastrarProduto {
    
    public void renderizar() {
        Produto produto = new Produto();
        ProdutoController produtoController = new ProdutoController();

        System.out.println("\n -- CADASTRO DE PRODUTOS -- \n");
        produto.setProduto(Console.readString("Digite o serviço contratado: "));
        produto.setLocalizacao(Console.readString("Em qual parte do corpo: "));
        produtoController.cadastrar(produto);
        System.out.println("\n Produto cadastrado com SUCESSO !! \n");
    }
}
