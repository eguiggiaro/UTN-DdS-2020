package com.test;

import org.junit.Before;
import org.junit.Test;

import com.dominio.*;
import com.exception.SinColorSecundarioException;

public class PrendaTest {
	Prenda prenda;
	
	@Before
	public void init() {
		prenda = new Prenda(TipoPrenda.PANTALON, Material.JEAN, new Color("FF","FF","FF"), Trama.LISA);
	}
	
	@Test
	public void NuevaPrendaCategoriaCorrecta() {
		assert(prenda.getCategoria() == Categoria.INFERIOR);
	}
	
	@Test(expected = SinColorSecundarioException.class)
	public void NuevaPrendaSinColorSecundario() {
		prenda.getColorSecundario();
	}
	
	
	@Test
	public void NuevaPrendaConColorSecundario() {
		prenda.setColorSecundario(new Color("00","00","00"));
		assert(prenda.getColorSecundario().equals(new Color("00","00","00")));
	}
	
}
