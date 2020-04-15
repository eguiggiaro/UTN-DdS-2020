package com.dominio;

import com.exception.SinColorSecundarioException;

public class Prenda {
	private TipoPrenda tipoPrenda;
	private Tela tela;
	private Color colorPrimario;
	private Color colorSecundario;
	
	public Prenda(TipoPrenda tipoPrenda, Tela tela, Color colorPrimario) {
		this.tipoPrenda = tipoPrenda;
		this.tela = tela;
		this.colorPrimario = colorPrimario;
	}
	
	public Prenda(TipoPrenda tipoPrenda, Tela tela, Color colorPrimario, Color colorSecundario) {
		this.tipoPrenda = tipoPrenda;
		this.tela = tela;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
	}
	
	public Categoria getCategoria()
	{
		return tipoPrenda.getCategoria();
	}
	
	public Tela getTela()
	{
		return this.tela;
	}
	
	public Color getColorPrimario()
	{
		return this.colorPrimario;
	}
	
	public Color getColorSecundario() throws SinColorSecundarioException
	{
		if (this.colorSecundario == null)
		{
			throw new SinColorSecundarioException("No existe color secundario para la prenda");
		} else
		{
		return this.colorSecundario;
	
		}
	}
	
}
