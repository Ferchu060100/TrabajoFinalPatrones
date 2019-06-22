package beans;

import java.io.Serializable;
import java.util.ArrayList;

public class Bean_Reserva implements Serializable {
	
	 
	private static final long serialVersionUID = 1L;
	int id;
	String tipo; //('R')eserva ... ('S')in Reserva;
	String estado; // (P O F) creo que no sera necesario :V
	String fechareserva;
	String fechaservicio;
	ArrayList<Bean_Detalle> detail;
	
	public Bean_Reserva(int id, String tipo, String estado, String fechareserva, String fechaservicio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.estado = estado;
		this.fechareserva = fechareserva;
		this.fechaservicio = fechaservicio;
		this.detail = new ArrayList<Bean_Detalle>();
	}
	
	public Bean_Reserva() {
		super();
		this.id = 0;
		this.tipo = "";
		this.estado = "";
		this.fechareserva = "";
		this.fechaservicio = "";
		this.detail = new ArrayList<Bean_Detalle>();	
		
	}

	void agregar_Detalle(Bean_Detalle bd) {
		this.detail.add(bd);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechareserva() {
		return fechareserva;
	}

	public void setFechareserva(String fechareserva) {
		this.fechareserva = fechareserva;
	}

	public String getFechaservicio() {
		return fechaservicio;
	}

	public void setFechaservicio(String fechaservicio) {
		this.fechaservicio = fechaservicio;
	}

	public ArrayList<Bean_Detalle> getDetail() {
		return detail;
	}

	public void setDetail(ArrayList<Bean_Detalle> detail) {
		this.detail = detail;
	}
	
	
	
	
}
