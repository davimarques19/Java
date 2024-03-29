package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {

	private Date momento;
	private PedidoStatus status;

	private Cliente cliente;
	private List<PedidoItem> itens = new ArrayList<>();
	
	public Pedido(Date momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente Cliente) {
		this.cliente = cliente;
	}
	
	public List<PedidoItem> getItens() {
		return itens;
	}

	public void addPedido(PedidoItem pedido) {
		itens.add(pedido);
	}
	
	public void removePedido(PedidoItem pedido) {
		itens.remove(pedido);
	}
	
	public Double total() {
		double sum = 0.0;
		for (PedidoItem item : itens) {
			sum += item.subTotal();
		}
		return sum;
	}
}
