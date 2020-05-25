package com.dominio;

public enum Material {
	JEAN {
		public int getTemperaturaMaxima() {
			return 40;
		}
	},
	
	ALGODON{
		public int getTemperaturaMaxima() {
			return 40;
		}
	},
	
	LANA{
		public int getTemperaturaMaxima() {
			return 15;
		}
	},
	
	NYLON{
		public int getTemperaturaMaxima() {
			return 20;
		}
	},
	
	CUERO{
		public int getTemperaturaMaxima() {
			return 15;
		}
	},
	
	PIQUE{
		public int getTemperaturaMaxima() {
			return 40;
		}
	},
	
	ACETATO{
		public int getTemperaturaMaxima() {
			return 20;
		}
	},
	
	PLATA{
		public int getTemperaturaMaxima() {
			return 40;
		}
	};

	
	public abstract int getTemperaturaMaxima();

}
