package com.dominio;

public class SolicitudBaja extends Solicitud{

	public void aplicar()
	{
		super.guardarropa.eliminarPrenda(super.prenda);
	}
	
	public void deshacer()
	{
		super.guardarropa.agregarPrenda(super.prenda);
	}
	
}
