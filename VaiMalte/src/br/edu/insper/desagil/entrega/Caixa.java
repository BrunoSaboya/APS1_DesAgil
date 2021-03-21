package br.edu.insper.desagil.entrega;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
private Map<Integer, Integer> descontos;
	
	public Caixa() {
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
				double precoDesconto = (pedido.getProduto().getPreco() * ((1 - (this.descontos.get(pedido.getProduto().getCodigo())/100)) * pedido.getQuantidade()));
				somaCarrinho += precoDesconto; 
			}
			else {
				somaCarrinho += pedido.getProduto().getPreco() * pedido.getQuantidade();
			}
		}
		return somaCarrinho;
	}
}

