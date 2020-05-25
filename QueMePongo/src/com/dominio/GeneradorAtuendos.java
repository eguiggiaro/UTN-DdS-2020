package com.dominio;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.API.ServicioClima;
import com.exception.SinPrendasParaTemperaturaException;

public class GeneradorAtuendos {
	int temperatura;
	List<Prenda> listadoPrendas;
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
	Prenda accesorio;
	
	public GeneradorAtuendos(ServicioClima servicio, List<Prenda> listado)
	{
		this.temperatura = servicio.getTemperatura();
		this.listadoPrendas = Objects.requireNonNull(listado,"Debe indicar un listado de prendas válido");
	}

	public Atuendo devolverAtuendoSugerido()
	{
		this.prendaSuperior = seleccionarPrendaRandom(Categoria.SUPERIOR);
		this.prendaInferior = seleccionarPrendaRandom(Categoria.INFERIOR);
		this.calzado = seleccionarPrendaRandom(Categoria.CALZADO);
		this.accesorio = seleccionarPrendaRandom(Categoria.ACCESORIO);
		return new Atuendo(this.prendaSuperior, this.prendaInferior, this.calzado, this.accesorio);
	}
	
	private Prenda seleccionarPrendaRandom(Categoria categoria)
	{
		List<Prenda> listadoFiltrado = this.listadoPrendas.stream()
				.filter(p -> 
					p.getCategoria() == categoria && 
					p.getMaterial().getTemperaturaMaxima()>= this.temperatura)
				.collect(Collectors.toList());
		if (listadoFiltrado.isEmpty())
		{
			throw new SinPrendasParaTemperaturaException("No existen prendas para la categoria y temperatura obtenida");
		}
		Collections.shuffle(listadoFiltrado);
		return listadoFiltrado.get(0);
	}
		
}
