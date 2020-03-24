package com.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Venta {

	Date fecha;
	ArrayList<ItemVenta> productos = new ArrayList<ItemVenta>();
	MedioPago medioPago;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
	public Venta(Date fecha, ArrayList<ItemVenta> productos, MedioPago medioPago) {
		super();
		this.fecha = fecha;
		this.productos = productos;
		this.medioPago = medioPago;
		this.medioPago.setProductos(productos);
	}
	
	

}
	
