package com.dominio;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

	List<Prenda> lista = new ArrayList<Prenda>();
	List<Solicitud> solicitudes = new ArrayList<Solicitud>();

	public void agregarPrenda(Prenda prenda)
	{
		this.lista.add(prenda);
	}
	
	public void eliminarPrenda(Prenda prenda)
	{
		this.lista.remove(this.lista.indexOf(prenda));
	}
	
}
