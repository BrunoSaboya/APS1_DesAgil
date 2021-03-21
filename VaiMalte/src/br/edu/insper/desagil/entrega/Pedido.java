package br.edu.insper.desagil.entrega;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
		}
	public Produto getProduto() {
		return this.produto;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void Incrementa() {
		this.quantidade += 1;
	}
	public double total() {
		return this.quantidade * this.produto.getPreco();
	}
}
