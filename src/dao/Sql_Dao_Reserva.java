package dao;

import java.util.ArrayList;

import beans.Bean_Detalle;
import beans.Bean_Reserva;

public class Sql_Dao_Reserva implements Dao_Reserva{

	@Override
	public void insert_Reserva(Bean_Reserva br) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Bean_Reserva> get_Reservas_ByDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Bean_Reserva> get_Reservas_ByEstilista(int estcod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Bean_Reserva> get_Reservas_Cliente(int clicod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificar_Detalle(Bean_Detalle bd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar_Fecha(int rescod, String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar_Reserva() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertReserva_to_Venta(int cod) {
		// TODO Auto-generated method stub
		
	}

}
