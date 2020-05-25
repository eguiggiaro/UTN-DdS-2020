package com.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.API.AccuWeatherServicio;
import com.API.MockWeatherServicio;
import com.API.ServicioClima;
import com.dominio.Atuendo;
import com.dominio.BorradorPrenda;
import com.dominio.Categoria;
import com.dominio.Color;
import com.dominio.GeneradorAtuendos;
import com.dominio.Material;
import com.dominio.Prenda;
import com.dominio.TipoPrenda;
import com.dominio.Trama;
import com.exception.SinColorSecundarioException;
import com.exception.SinPrendasParaTemperaturaException;

public class SugerenciaTest {

	List<Prenda> listadoPrendas = new ArrayList<Prenda>();
	
	@Before
	public void init() {
		
		BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.CAMISA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ACETATO);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		borrador = new BorradorPrenda(TipoPrenda.CAMISA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ALGODON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		borrador = new BorradorPrenda(TipoPrenda.ZAPATILLA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ALGODON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());
		
		borrador = new BorradorPrenda(TipoPrenda.CAMISA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.CUERO);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.SHORT);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.NYLON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.ZAPATO);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.CUERO);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.CAMISA_MANGAS_CORTAS);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ALGODON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.CORBATA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.NYLON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.GORRA_DEPORTIVA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ALGODON);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.CHOMBA);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.PIQUE);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.SOMBRERO);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.ACETATO);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.SOMBRERO);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.LANA);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());

		
		borrador = new BorradorPrenda(TipoPrenda.COLLAR);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.PLATA);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());
		
		borrador = new BorradorPrenda(TipoPrenda.PANTALON);
		borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
		borrador.especificarMaterial(Material.JEAN);
		borrador.especificarTrama(Trama.LISA);
		listadoPrendas.add(borrador.crearPrenda());
		
	}
	
	@Test(expected = SinPrendasParaTemperaturaException.class)
	public void NoExistenPrendasParaLaTemperatura() {
		ServicioClima servicio = new MockWeatherServicio(50);
		GeneradorAtuendos generador = new GeneradorAtuendos(servicio,listadoPrendas);
		Atuendo atuendo = generador.devolverAtuendoSugerido();
		System.out.println(atuendo.toString());
	}

	
	@Test
	public void PrendaCorrecta() {
		ServicioClima servicio = new MockWeatherServicio(20);
		GeneradorAtuendos generador = new GeneradorAtuendos(servicio,listadoPrendas);
		Atuendo atuendo = generador.devolverAtuendoSugerido();
		System.out.println(atuendo.toString());
	}


}
