package com.dominio;

public class SastreInstitutoJohnson implements Sastre{
	
	@Override
	public Prenda fabricarParteSuperior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.CAMISA);
        borrador.especificarColorPrincipal(new Color("FF","FF","FF"));
        borrador.especificarMaterial(Material.ALGODON);
        return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteInferior() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.PANTALON_DE_VESTIR);
        borrador.especificarColorPrincipal(new Color("00","00","00"));
        borrador.especificarMaterial(Material.ALGODON);
        return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarcalzado() {
        BorradorPrenda borrador = new BorradorPrenda(TipoPrenda.ZAPATO);
        borrador.especificarColorPrincipal(new Color("00","00","00"));
        borrador.especificarMaterial(Material.CUERO);
        return borrador.crearPrenda();
	}
}
