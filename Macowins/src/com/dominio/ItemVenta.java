package com.dominio;

public class ItemVenta {

	Prenda prenda;
	int cantidad;
	
	public Prenda getPrenda() {
		return prenda;
	}
	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public ItemVenta(Prenda prenda, int cantidad) {
		super();
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	
}
