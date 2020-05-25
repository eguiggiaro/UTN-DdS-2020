package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.dominio.BorradorPrenda;
import com.dominio.Categoria;
import com.dominio.Color;
import com.dominio.Material;
import com.dominio.Prenda;
import com.dominio.TipoPrenda;
import com.dominio.Trama;

public class BorradorPrendaTest {

	BorradorPrenda borrador;
	
	@Before
	public void init() {
		borrador = new BorradorPrenda(TipoPrenda.PANTALON);
	}
	
	@Test
	public void PrendaCorrecta() {
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ACETATO);
		borrador.especificarTrama(Trama.LISA);
		Prenda prenda = borrador.crearPrenda();
		assertTrue(prenda.getCategoria() == Categoria.INFERIOR);
	}
	
	@Test
	public void PrendaSinTrama() {
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ACETATO);
		borrador.especificarTrama(null);
		Prenda prenda = borrador.crearPrenda();		
		assertTrue(prenda.getTrama() == Trama.LISA);
	}
	
	
	@Test(expected = NullPointerException.class)
	public void PrendaSinMaterial() {
		borrador.especificarMaterial(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void PrendaSinColorSecundario() {
		borrador.especificarColorPrincipal(null);
	}
	
}
