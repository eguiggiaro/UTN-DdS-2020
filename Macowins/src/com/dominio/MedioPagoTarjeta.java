package com.dominio;

import java.util.ArrayList;
import java.util.Iterator;

public class MedioPagoTarjeta extends MedioPago {

	private double coeficienteFijo;
	private double cuotas;
	
	public double calcularPrecioFinal()
	{
		
		return super.calcularPrecioFinal() + calcularRecargo();
	}

	public MedioPagoTarjeta(double coeficienteFijo, double cuotas) {
		super();
		this.coeficienteFijo = coeficienteFijo;
		this.cuotas = cuotas;
	}
	
	public double calcularRecargo() {
		return (cuotas * coeficienteFijo) + calcularRecargoPrendas();
	}
	
	public double calcularRecargoPrendas() {
		double recargoPrendas =  0;
		ItemVenta item;
		Iterator<ItemVenta> it = super.productos.iterator();
		while (it.hasNext()) {
			item = it.next(); 
			recargoPrendas += item.cantidad * item.getPrenda().calcularPrecioVenta() * 0.01;
		}
		return recargoPrendas;
	}
	
}
