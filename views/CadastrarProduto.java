package views;

import controllers.ProdutoController;
import models.Produto;
import utils.Console;

public class CadastrarProduto {
    
    public void renderizar() {
        Produto produto = new Produto();
        ProdutoController produtoController = new ProdutoController();

        System.out.println("\n -- CADASTRO DE PRODUTOS -- \n");
        produto.setNome(Console.readString("Digite o nome do produto: "));
        produto.setTipo(Console.readString("Digite o tipo do traços: "));
        produto.setTamanho(Console.readInt("Digite o tamanho(cm): "));
        produto.setPreco(Console.readDouble("Digite o preço do produto: R$"));
        produtoController.cadastrar(produto);
        System.out.println("\n Produto cadastrado com SUCESSO !! \n");
    }
}
