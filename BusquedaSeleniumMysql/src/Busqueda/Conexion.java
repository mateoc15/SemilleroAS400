package Busqueda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/mysqldb";
	private static final String USUARIO = "root";
	private static final String CONTRASENA = "root";

	static {
		try {
			Class.forName(CONTROLADOR);

		} catch(ClassNotFoundException e){
			System.out.println("no se logro cargar el controlador");
			e.printStackTrace();
		}
	}
	public Connection conectarDB(){
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL,USUARIO,CONTRASENA);
			System.out.println("ConexionOk");
			
		}  catch (SQLException e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}
		
		return conexion;
	}
}
