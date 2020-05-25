package com.dominio;

import java.util.Objects;

public class BorradorPrenda {
	private Color colorPrincipal;
	private TipoPrenda tipoPrenda;
	private Material material;
	private Trama trama = Trama.LISA;
	
	
	public BorradorPrenda(TipoPrenda tipoPrenda)
	{
		this.tipoPrenda = Objects.requireNonNull(tipoPrenda,"Tipo de prenda es obligatorio");
	}
	
	public void especificarColorPrincipal(Color color)
	{
		this.colorPrincipal = Objects.requireNonNull(color,"Color principal es obligatorio");
	}
	
	public void especificarMaterial(Material material)
	{
		this.material = Objects.requireNonNull(material,"Material es obligatorio");
	}
	
	public void especificarTrama(Trama trama)
	{
		if (trama == null) {
			this.trama = Trama.LISA;
		}
		else
		{
			this.trama = trama;
		}
	}
	
	public Prenda crearPrenda()
	{
		return new Prenda(this.tipoPrenda,this.material, this.colorPrincipal, this.trama);
	}
	

}