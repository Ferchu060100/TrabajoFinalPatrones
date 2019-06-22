package fabrica;

import dao.Dao_Reserva;

public interface Dao_Factory {
	
	public static final int SQL=1;

	public static Dao_Factory get_DAOFactory(int whichFactory){
		switch(whichFactory){   
	       	case SQL:
	       	    return  new Sql_Dao_Factory();
	    	default:
	       	    return null;
		}
	}
	
	Dao_Reserva get_Reserva_Dao();
	
}
