package br.edu.insper.desagil.entrega;


public class Testador {
	public boolean testeA() {
		Carrinho carrinhoA = new Carrinho();
		
		Caixa caixaA = new Caixa();
		if (caixaA.totalCaixa(carrinhoA) == 0) {
			return true;
		}
		return false;
	}

	public boolean testeB() {
		Carrinho carrinhoB = new Carrinho();
		
		Produto produtoB = new Produto(12, "corona", 25.00);
		carrinhoB.Verifica(produtoB);
		
		Caixa caixaB = new Caixa();
		if (caixaB.totalCaixa(carrinhoB) == 25.00) {
			return true;
		}
		return false;
	}

	public boolean testeC() {
		Carrinho carrinhoC = new Carrinho();
		
		Produto produtoC = new Produto(11, "leuven", 20.00);
		carrinhoC.Verifica(produtoC);
		
		Caixa caixaC = new Caixa();
		caixaC.Insere(produtoC, 15);
		
		if (caixaC.totalCaixa(carrinhoC) == 17.00) {
			return true;
		}
		return false;
	}

	public boolean testeD() {
		Carrinho carrinhoD = new Carrinho();
		
		Produto produtoD = new Produto(9, "damabeer", 20.00);
		Produto produtoD2 = new Produto(13, "hiniken", 9.00);
		Produto produtoD3 = new Produto(14, "shope", 12.00);
		
		carrinhoD.Verifica(produtoD);
		carrinhoD.Verifica(produtoD2);
		carrinhoD.Verifica(produtoD3);
		
		
		Caixa caixaD = new Caixa();
		caixaD.Insere(produtoD, 10);
		
		if (caixaD.totalCaixa(carrinhoD) == 39.00) {
			return true;
		}
		return false;
	}

	public boolean testeE() {
		Carrinho carrinhoE = new Carrinho();
		
		Produto produtoE = new Produto(123, "artico", 5.00);
		Produto produtoE2 = new Produto(321, "brama", 4.00);
		Produto produtoE3 = new Produto(25, "ceveja", 10.00);
		
		carrinhoE.Verifica(produtoE);
		carrinhoE.Verifica(produtoE2);
		carrinhoE.Verifica(produtoE3);
		
		
		Caixa caixaD = new Caixa();
		caixaD.Insere(produtoE2, 20);
		caixaD.Insere(produtoE3, 10);
		
		if (caixaD.totalCaixa(carrinhoE) == 17.20) {
			return true;
		}
	    return false;
	}

}