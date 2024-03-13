package Factory;

import java.sql.*;

public class ConnectionFactory {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root@2024");

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de dados não encontrado");
		} catch (SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
		
		
	}
	
}