package com.dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MedioPago {
	
	List<ItemVenta> productos;

	public double calcularPrecioFinal() {
		double precioFinal = 0;
		ItemVenta item;
		Iterator<ItemVenta> it = productos.iterator();
		while (it.hasNext()) {
			item = it.next();
			precioFinal += item.getCantidad() * item.getPrenda().calcularPrecioVenta() ;
		}
		return precioFinal;

	}

	public void setProductos(List<ItemVenta> productos) {
		this.productos = productos;
	}
	

	

}
