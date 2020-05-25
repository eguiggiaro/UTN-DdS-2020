package com.dominio;

public enum TipoPrenda {

	ZAPATO {
		public Categoria getCategoria() {
			return Categoria.CALZADO;
		}
	},
	
	ZAPATILLA {
		public Categoria getCategoria() {
			return Categoria.CALZADO;
		}
	},
	
	CAMISA_MANGAS_CORTAS {
		public Categoria getCategoria() {
			return Categoria.SUPERIOR;
		}
	},


	PANTALON {
		public Categoria getCategoria() {
			return Categoria.INFERIOR;
		}
	},
	
	PANTALON_DE_VESTIR {
		public Categoria getCategoria() {
			return Categoria.INFERIOR;
		}
	},

	SHORT {
		public Categoria getCategoria() {
			return Categoria.INFERIOR;
		}
	},


	PULLOVER {
		public Categoria getCategoria() {
			return Categoria.SUPERIOR;
		}
	},

	SOMBRERO {
		public Categoria getCategoria() {
			return Categoria.ACCESORIO;
		}
	},


	SACO {
		public Categoria getCategoria() {
			return Categoria.SUPERIOR;
		}
	},
	

	COLLAR {
		public Categoria getCategoria() {
			return Categoria.ACCESORIO;
		}
	},
	
	CHOMBA {
		public Categoria getCategoria() {
			return Categoria.SUPERIOR;
		}
	},
	
	CAMISA {
		public Categoria getCategoria() {
			return Categoria.SUPERIOR;
		}		
	},
	
	GORRA_DEPORTIVA {
		public Categoria getCategoria() {
			return Categoria.ACCESORIO;
		}		
	},
	
	COLGANTE {
		public Categoria getCategoria() {
			return Categoria.ACCESORIO;
		}		
	},
	
	CORBATA {
		public Categoria getCategoria() {
			return Categoria.ACCESORIO;
		}		
	};
	public abstract Categoria getCategoria();

}
