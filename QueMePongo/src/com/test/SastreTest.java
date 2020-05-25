package com.test;

import org.junit.Before;
import org.junit.Test;

import com.dominio.Color;
import com.dominio.Sastre;
import com.dominio.SastreInstitutoJohnson;
import com.dominio.SastreSanJuan;
import com.dominio.Uniforme;

public class SastreTest {
	Sastre sastreSanJuan;
	Sastre sastreInstitutoJohnson;
	Uniforme uniforme;
	
	@Before
	public void init() {
		sastreSanJuan = new SastreSanJuan();
		sastreInstitutoJohnson = new SastreInstitutoJohnson();	
	}
	
	@Test
	public void UniformeSanJuanEsCorrecto() {
		uniforme = Uniforme.fabricar(sastreSanJuan);
		uniforme.getPrendaSuperior().getColorPrimario().equals(new Color("82","A4","6E")); 
	}
	
	@Test
	public void UniformeInstitutoJohnsonEsCorrecto() {
		uniforme = Uniforme.fabricar(sastreInstitutoJohnson);
		uniforme.getPrendaSuperior().getColorPrimario().equals(new Color("FF","FF","FF")); 
	}
}
