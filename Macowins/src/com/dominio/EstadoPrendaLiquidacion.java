package com.dominio;

public class EstadoPrendaLiquidacion extends EstadoPrenda {

	public EstadoPrendaLiquidacion() {
		super();
		super.setPorcentajeLiquidacion(50);
	}

	double calcularPrecioVenta(Prenda prenda) {
		return prenda.precioBase * (super.getPorcentajeLiquidacion() / 100.0);
	}

	@Override
	public String toString() {
		return "Liquidacion";
	}
	
	
}
