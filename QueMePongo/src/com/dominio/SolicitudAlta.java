package com.dominio;

public class SolicitudAlta extends Solicitud {

	public void aplicar()
	{
		super.guardarropa.agregarPrenda(super.prenda);
	}
	
	public void deshacer()
	{
		super.guardarropa.eliminarPrenda(super.prenda);
	}
	

}
