package com.API;

import java.util.HashMap;
import java.util.List;

public class AccuWeatherServicio implements ServicioClima{

	int probabilidadPrecipitaciones;
	int temperatura;
	
	
	public AccuWeatherServicio(){
		List<HashMap> condicionesClimaticas = AccuWeatherAPI.getWeather("Buenos Aires, Argentina");
		this.probabilidadPrecipitaciones = (int) condicionesClimaticas.get(0).get("PrecipitationProbability");
		this.temperatura = (int) condicionesClimaticas.get(0).get("Temperature");
	}
	

	public int getProbabilidadPrecipitaciones()
	{
		return this.probabilidadPrecipitaciones;
	}
	
	public int getTemperatura()
	{
		return this.temperatura;
	}
	
}
