package com.dominio;

public class EstadoPrendaPromocion extends EstadoPrenda {

	
	
	public EstadoPrendaPromocion(double valorRestado) {
		super();
		super.setValorRestado(valorRestado);
		// TODO Auto-generated constructor stub
	}

	double calcularPrecioVenta(Prenda prenda) {
		return prenda.precioBase - super.getValorRestado();
	}
	
	@Override
	public String toString() {
		return "Promocion";
	}
}
