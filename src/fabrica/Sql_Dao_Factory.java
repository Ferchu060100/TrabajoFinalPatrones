package fabrica;

import dao.Dao_Reserva;
import dao.Sql_Dao_Reserva;

public class Sql_Dao_Factory implements Dao_Factory {

	@Override
	public Dao_Reserva get_Reserva_Dao() {
		return new Sql_Dao_Reserva();
	}

}
