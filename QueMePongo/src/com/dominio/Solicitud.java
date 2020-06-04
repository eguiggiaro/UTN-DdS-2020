package com.dominio;

public abstract class Solicitud {

	Guardarropa guardarropa;
	Prenda prenda;
	
	public abstract void aplicar();
	public abstract void deshacer();
}
