package Factory;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/gepetojava","root","root@2024");
		}         
			catch(SQLException excecao) {
				throw new RuntimeException(excecao);
			 }
	    }
}