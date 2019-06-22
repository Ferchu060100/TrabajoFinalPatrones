package dao;

import java.util.ArrayList;

import beans.Bean_Detalle;
import beans.Bean_Reserva;

public interface Dao_Reserva {
	// Vista: Registrar_Reserva
	void insert_Reserva(Bean_Reserva br); // tipo = 'R', estado = 'P' y otra cosilla algo dificil.
	// Vista: Admin_Consultar_Reserva
	ArrayList<Bean_Reserva> get_Reservas_ByDate(String date); // from Ventas_Reserva where tipo = 'R'and fechaservicio = date
	ArrayList<Bean_Reserva> get_Reservas_ByEstilista(int estcod); // from Ventas_Reserva join Detail where idestilista = estcod
	// Vista: Cliente_Consultar_Reserva
	ArrayList<Bean_Reserva> get_Reservas_Cliente(int clicod); // clicod: codigo de cliente
	// Vista: Modificar_Reserva 
	void modificar_Detalle(Bean_Detalle bd); // opcional  
	void modificar_Fecha(int rescod, String date); // set fechaservicio = date, where id = rescod
	void eliminar_Reserva(); //Lo elimina de la tabla Venta_Reserva y de la tabla Detalle
	//Vista: Reserva_a_Venta
	void convertReserva_to_Venta(int cod); // set tipo = 'S', estado = 'F'
	

}
