package Factory;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/gepetojava","root","root@2024");
		}         
			catch(SQLException excecao) {
				throw new RuntimeException(excecao);
			 }
	    }
}