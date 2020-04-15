package com.test;

import org.junit.jupiter.api.Test;

import com.dominio.Categoria;
import com.dominio.Color;
import com.dominio.Prenda;
import com.dominio.Tela;
import com.dominio.TipoPrenda;
import com.exception.SinColorSecundarioException;

class PrendaTest {

	@Test
	void NuevaPrendaCategoriaCorrecta() {
		Prenda prenda = new Prenda(TipoPrenda.PANTALON, Tela.JEAN, Color.AZUL);
		assert(prenda.getCategoria() == Categoria.INFERIOR);
	}
	
	@Test
	void NuevaPrendaSinColorSecundario() {
		
		Prenda prenda = new Prenda(TipoPrenda.PANTALON, Tela.JEAN, Color.AZUL);
		try
		{
			prenda.getColorSecundario();
		}
		catch (SinColorSecundarioException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	
	@Test
	void NuevaPrendaConColorSecundario() {
		Prenda prenda = new Prenda(TipoPrenda.PULLOVER, Tela.LANA, Color.VIOLETA, Color.AMARILLO);
		try
		{
			assert(prenda.getColorSecundario() == Color.AMARILLO);
		}
		catch (SinColorSecundarioException ex)
		{
			System.out.println(ex.getMessage());
		}
	}	

}
