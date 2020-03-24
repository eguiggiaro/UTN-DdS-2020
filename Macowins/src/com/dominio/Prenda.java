package com.dominio;

public class Prenda {
	TipoPrenda tipo;
	EstadoPrenda estado;
	double precioBase;

	double calcularPrecioVenta() {
		return estado.calcularPrecioVenta(this);
	}

	public Prenda(TipoPrenda tipo, EstadoPrenda estado, double precioBase) {
		this.tipo = tipo;
		this.estado = estado;
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Prenda [tipo=" + tipo + ", precioVenta=" + calcularPrecioVenta()+ ", precioBase=" + precioBase + ", Estado=" + estado  + "]";
	}
	
	
	
}
