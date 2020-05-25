package com.dominio;

public class SastreSanJuan implements Sastre {
	
	@Override
	public Prenda fabricarParteSuperior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.CHOMBA);
        borrador.especificarColorPrincipal(new Color("82","A4","6E"));
        borrador.especificarMaterial(Material.PIQUE);
        return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.PANTALON);
        borrador.especificarColorPrincipal(new Color("99","99","99"));
        borrador.especificarMaterial(Material.ACETATO);
        return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarcalzado() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.ZAPATILLA);
        borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
        borrador.especificarMaterial(Material.NYLON);
        return borrador.crearPrenda();
	}

}
