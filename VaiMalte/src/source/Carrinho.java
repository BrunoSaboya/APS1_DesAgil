package source;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> listaPedidos;
	
	public Carrinho() {
		this.listaPedidos = new ArrayList<>();
	}
	public List<Pedido> getPedido(){
		return this.listaPedidos;
	}
	public void Verifica(Produto produto) {
		for (Pedido pedido : this.listaPedidos) {
			if (pedido.getProduto() == produto) {
				pedido.Encrementa();
			}
		}
		Pedido novoPedido = new Pedido(produto);
		this.listaPedidos.add(novoPedido);
	}
}
