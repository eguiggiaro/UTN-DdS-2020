package com.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

	LocalDate fecha;
	List<ItemVenta> productos = new ArrayList<ItemVenta>();
	MedioPago medioPago;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public MedioPago getMedioPago() {
		return medioPago;
	}
	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public double calcularPrecioFinal()
	{
		
		return medioPago.calcularPrecioFinal();
	}
	public Venta(LocalDate fecha, List<ItemVenta> productos, MedioPago medioPago) {
		super();
		this.fecha = fecha;
		this.productos = productos;
		this.medioPago = medioPago;
		this.medioPago.setProductos(productos);
	}
	
	

}
	
