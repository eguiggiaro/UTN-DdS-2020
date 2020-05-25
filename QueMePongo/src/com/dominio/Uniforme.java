package com.dominio;

public class Uniforme {
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
		
	public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
		this.prendaSuperior = prendaSuperior;
		this.prendaInferior = prendaInferior;
		this.calzado = calzado;
	}

	public static Uniforme fabricar(Sastre sastre)
	{
		return new Uniforme(
				sastre.fabricarParteSuperior(),
				sastre.fabricarParteInferior(),
				sastre.fabricarcalzado());
	}
	
	public Prenda getPrendaSuperior()
	{
		return this.prendaSuperior;
	}

	
	public Prenda getPrendaInferior()
	{
		return this.prendaInferior;
	}

	
	public Prenda getCalzado()
	{
		return this.calzado;
	}

	
}
