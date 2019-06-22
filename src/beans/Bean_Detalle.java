package beans;

import java.io.Serializable;

public class Bean_Detalle implements Serializable{
	//TODO
		/* 1. Completar Clase (atributos, constructor,get,set) 
		 * para los atributos guiarese del Diagrama de BD
		 * */
	private static final long serialVersionUID = 1L;
	int cod_estilista;
	int cod_servicio;

	public Bean_Detalle() {
		super();
		this.cod_estilista = 0;
		this.cod_servicio = 0;
	}
	
	public Bean_Detalle(int cod_estilista, int cod_servicio) {
		super();
		this.cod_estilista = cod_estilista;
		this.cod_servicio = cod_servicio;
	}

	public int getCod_estilista() {
		return cod_estilista;
	}

	public void setCod_estilista(int cod_estilista) {
		this.cod_estilista = cod_estilista;
	}

	public int getCod_servicio() {
		return cod_servicio;
	}

	public void setCod_servicio(int cod_servicio) {
		this.cod_servicio = cod_servicio;
	}
	
	
	
}
