package Factory;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {
		
		Connection conexao = null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/gepeto", "root", "root@2024");

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de dados não encontrado");
		} catch (SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
		} finally {
			if (conexao != null) {
				System.out.println("Banco conectado com sucesso.");
				return conexao;
			}
		}
		return conexao;
		
		
		
	}
	
}