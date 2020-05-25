package com.dominio;

public class Color {
	private String cantidadRojo;
	private String cantidadVerde;
	private String cantidadAzul;
	
	public Color(String red, String green, String blue) {
		this.cantidadRojo = red;
		this.cantidadVerde = green;
		this.cantidadAzul = blue;
	}

	@Override
	public boolean equals(Object c) {

        if (!(c instanceof Color)) { 
            return false; 
        } 
          
        Color color = (Color) c; 
		
		return ((this.cantidadRojo == color.cantidadRojo) && (this.cantidadVerde == color.cantidadVerde) && (this.cantidadAzul == color.cantidadAzul));
	}
	
	
	

}
