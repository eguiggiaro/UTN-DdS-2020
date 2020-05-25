package com.API;

public class MockWeatherServicio implements ServicioClima{

	int temperatura;
	
	public MockWeatherServicio(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getTemperatura()
	{
		return this.temperatura;
	}
	
}
