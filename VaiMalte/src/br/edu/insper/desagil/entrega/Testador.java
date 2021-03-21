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
		
		Produto produtoB = new Produto(12, "corona", 500);
		carrinhoB.Verifica(produtoB);
		
		Caixa caixaB = new Caixa();
		if (caixaB.totalCaixa(carrinhoB) == 500) {
			return true;
		}
		return false;
	}

	public boolean testeC() {
		Carrinho carrinhoC = new Carrinho();
		
		Produto produtoC = new Produto(11, "leuven", 500.00);
		carrinhoC.Verifica(produtoC);
		
		Caixa caixaC = new Caixa();
		caixaC.Insere(produtoC, 10);
		if (caixaC.totalCaixa(carrinhoC) == 450.00) {
			return true;
		}
		return false;
	}

	public boolean testeD() {
		Carrinho carrinhoD = new Carrinho();
		
		Produto produtoD = new Produto(9, "dama", 500);
		Produto produtoD2 = new Produto(13, "hiniken", 500);
		carrinhoD.Verifica(produtoD);
		carrinhoD.Verifica(produtoD2);
		
		Pedido pedidoD = new Pedido(produtoD2);
		pedidoD.Incrementa();
		
		Caixa caixaD = new Caixa();
		caixaD.Insere(produtoD, 10);
		if (caixaD.totalCaixa(carrinhoD) == 1450) {
			return true;
		}
		return false;
	}

	public boolean testeE() {
		Carrinho carrinhoE = new Carrinho();
		
		Produto produtoE = new Produto(123, "antartica", 500);
		Produto produtoE2 = new Produto(321, "brahma", 500);
		carrinhoE.Verifica(produtoE);
		carrinhoE.Verifica(produtoE2);
		
		Pedido pedidoE = new Pedido(produtoE);
		pedidoE.Incrementa();
		
		Caixa caixaD = new Caixa();
		caixaD.Insere(produtoE, 30);
		if (caixaD.totalCaixa(carrinhoE) == 1200) {
			return true;
		}
	    return false;
	}

}