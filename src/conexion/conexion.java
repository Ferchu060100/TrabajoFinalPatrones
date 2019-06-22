package conexion;


import java.sql.*;

public class conexion {

	static {
		try {
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			//Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	/**
	 * Obtiene una conexión a la Base de Datos.
	 */
	public Connection getConnection() {

		Connection connection = null;
		try {

			//connection =
			//	DriverManager.getConnection("jdbc:mysql://localhost:3306/demodbdao","root","mysql");
			
			connection =
			DriverManager.getConnection("jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=demodbdao",
					"sa","SQL2014");
				//DriverManager.getConnection("jdbc:odbc:dsnNatures","sa","sql");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return connection;
	}
}
