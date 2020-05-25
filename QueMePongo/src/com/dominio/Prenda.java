package com.dominio;
import java.util.Objects;

import com.exception.SinColorSecundarioException;

public class Prenda {
	private Color colorPrincipal;
	private Color colorSecundario;
	private TipoPrenda tipoPrenda;
	private Material material;
	private Trama trama;
	
	public Prenda(TipoPrenda tipoPrenda, Material tela, Color colorPrimario, Trama trama) {
		this.tipoPrenda = tipoPrenda;
		this.material = tela;
		this.colorPrincipal = colorPrimario;
		this.trama = trama;
	}
	
	public void setColorSecundario(Color color) {
		this.colorSecundario = color;
	}
	
	public Categoria getCategoria()
	{
		return tipoPrenda.getCategoria();
	}
	
	public Material getTela()
	{
		return this.material;
	}
	
	public Color getColorPrimario()
	{
		return this.colorPrincipal;
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
	
	public Trama getTrama()
	{
		return this.trama;
	}
	
}
