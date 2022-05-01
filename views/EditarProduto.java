package views;

import controllers.ProdutoController;
import models.Produto;
import utils.Console;

public class EditarProduto {
    
    private static Produto produtoP;
    ProdutoController produtoController = new ProdutoController();

    public void renderizar() {
		
		System.out.println("\n === EDIÇÃO DE PRODUTO === \n");
		String produto = Console.readString("Digite o produto: ");
		produtoP =  produtoController.buscarPorProduto(produto);

		if (produtoP == null) {
			System.out.println("\n Cliente não encontrado! \n");
		} else {
			EditarProduto.printProduto();
			produtoP.setProduto(
				Console.readString(
					String.format("Produto/Serviço: [%s]", produtoP.getProduto())
				)
			);
            produtoP.setLocalizacao(
				Console.readString(
					String.format("Parte do corpo: [%s]", produtoP.getLocalizacao())
				)
			);
			ProdutoController.editar(produtoP);
			System.out.println("\nEditado com SUCESSSO!!");
		}
	}

    public static void printProduto() {

        System.out.println("\n--Editar produto--");
		System.out.println("Nome: " + produtoP.getProduto());
        System.out.println("------------------");
        System.out.println("\n==Editar==");
	}
}
