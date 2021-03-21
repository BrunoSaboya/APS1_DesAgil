package br.edu.insper.desagil.entrega;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		this.descontos = new HashMap<>();	
	}
	public void Insere(Produto produto, int n) {
		if (n > 0 && n < 100) {
			this.descontos.put(produto.getCodigo(), n);
		}
	}
	public double totalCaixa(Carrinho carrinho) {
		double somaCarrinho = 0.0;
		for (Pedido pedido : carrinho.getPedido()) {
			if  (this.descontos.containsKey(pedido.getProduto().getCodigo())){
				double precoDesconto = this.descontos.get(pedido.getProduto().getCodigo());
				somaCarrinho += pedido.getProduto().getPreco() * (1-(precoDesconto/100)) * pedido.getQuantidade();
			}
			else {
				somaCarrinho += pedido.getProduto().getPreco() * pedido.getQuantidade();
			}
		}
		return somaCarrinho;
	}
}

