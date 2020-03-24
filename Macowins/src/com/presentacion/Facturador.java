package com.presentacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.dominio.*;

public class Facturador {

	public static void main(String[] args) {
			System.out.println("Iniciando Facturador...");
		
			ArrayList<Prenda> listaPrendas = new ArrayList<Prenda>();
			ArrayList<Venta> listaVentas = new ArrayList<Venta>();
			ArrayList<ItemVenta> listaItems = new ArrayList<ItemVenta>();

			
			Prenda pantalonJean = new Prenda(TipoPrenda.PANTALON, new EstadoPrendaLiquidacion(),4000);
			Prenda pantalonOscuro = new Prenda(TipoPrenda.PANTALON, new EstadoPrendaNuevo(),4500);
			Prenda camisaCuadrille = new Prenda(TipoPrenda.CAMISA, new EstadoPrendaPromocion(1000),3200);
			Prenda camisaLisa = new Prenda(TipoPrenda.CAMISA, new EstadoPrendaLiquidacion(),2500);
			Prenda sacoInvierno = new Prenda(TipoPrenda.SACO, new EstadoPrendaLiquidacion(),3800);
			Prenda sacoVerano = new Prenda(TipoPrenda.SACO, new EstadoPrendaLiquidacion(),3500);

			listaPrendas.add(pantalonJean);
			ItemVenta item1 = new ItemVenta(pantalonJean,2);
			listaItems.add(item1);
			
			listaPrendas.add(pantalonOscuro);
			ItemVenta item2 = new ItemVenta(pantalonOscuro,5);
			listaItems.add(item2);
			
			listaPrendas.add(camisaCuadrille);
			ItemVenta item3 = new ItemVenta(camisaCuadrille,1);
			listaItems.add(item3);
			
			listaPrendas.add(camisaLisa);
			ItemVenta item4 = new ItemVenta(camisaLisa,1);
			listaItems.add(item4);
			
			listaPrendas.add(sacoInvierno);
			ItemVenta item5 = new ItemVenta(sacoInvierno,3);
			listaItems.add(item5);
			
			listaPrendas.add(sacoVerano);
			ItemVenta item6 = new ItemVenta(sacoVerano,1);
			listaItems.add(item6);			
			
			

			Venta venta1 = new Venta(devolverFecha("23/03/2020"),listaItems,new MedioPagoEfectivo());
			listaVentas.add(venta1);
			
			Venta venta2 = new Venta(devolverFecha("24/03/2020"),listaItems,new MedioPagoTarjeta(2,5));
			listaVentas.add(venta2);
			

			imprimirPrendas(listaPrendas);
			imprimirGananciasDia(listaVentas,devolverFecha("23/03/2020"));
			imprimirGananciasDia(listaVentas,devolverFecha("24/03/2020"));


	
	
	
	}
	public static void imprimirPrendas(ArrayList<Prenda> lista) {
		System.out.println("Imprimiendo listado de prendas...");
		Iterator<Prenda> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
	}
	}
	
	public static Date devolverFecha(String fechaString) { 

	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    Date miFecha = null;
		try {
			miFecha = formato.parse(fechaString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // convierte String a Date
	    return miFecha;
	  }
	
	
	public static void imprimirGananciasDia(ArrayList<Venta> lista, Date fecha) {
		Iterator<Venta> it = lista.iterator();
		Venta venta;
		double ganancia = 0;
		while (it.hasNext()) {
			venta = it.next();
			if (venta.getFecha().compareTo(fecha) == 0) {
				ganancia += venta.calcularPrecioFinal();
			}
		}
		System.out.println("La ganancia del d�a " + fecha.toString() + " es de $" + ganancia);
	
	}
	
}
