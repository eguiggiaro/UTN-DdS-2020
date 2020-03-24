package com.dominio;

public class EstadoPrenda {

	private double valorRestado = 0;
	private int porcentajeLiquidacion = 0;
	
	double calcularPrecioVenta(Prenda prenda) {
		return prenda.precioBase;
	}

	public double getValorRestado() {
		return valorRestado;
	}

	public void setValorRestado(double valorRestado) {
		this.valorRestado = valorRestado;
	}

	public int getPorcentajeLiquidacion() {
		return porcentajeLiquidacion;
	}

	public void setPorcentajeLiquidacion(int porcentajeLiquidacion) {
		this.porcentajeLiquidacion = porcentajeLiquidacion;
	}
	
	
	
}
