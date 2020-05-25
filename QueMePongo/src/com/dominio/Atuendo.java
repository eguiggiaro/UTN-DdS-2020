package com.dominio;

public class Atuendo {
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
	Prenda accesorio;
	
	public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio)
	{
		this.prendaSuperior = prendaSuperior;
		this.prendaInferior = prendaInferior;
		this.calzado = calzado;
		this.accesorio = accesorio;
	}

	@Override
	public String toString() {
		return ""
		+ prendaSuperior.getTipoPrenda() + " " + prendaSuperior.getCategoria() +  " " + prendaSuperior.getMaterial().getTemperaturaMaxima() + " " 
		+ prendaInferior.getTipoPrenda() + " " + prendaInferior.getCategoria() +  " " + prendaInferior.getMaterial().getTemperaturaMaxima() + " "
		+ calzado.getTipoPrenda() + " " + calzado.getCategoria() +  " " + calzado.getMaterial().getTemperaturaMaxima() + " "
		+ accesorio.getTipoPrenda() + " " + accesorio.getCategoria() +  " " + accesorio.getMaterial().getTemperaturaMaxima();

	}
	

}
