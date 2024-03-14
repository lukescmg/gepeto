package DAO;

import Factory.ConnectionFactory;
import Model.Usuario;
import java.sql.*;

public class UsuarioDAO {
	private Connection connection;
	
	String UsuarioEmail;
	String UsuarioNome;
	String UsuarioSobrenome;
	String UsuarioDataNascimento;
	String UsuarioTelefone;
	String UsuarioSenha;
	
	public UsuarioDAO() throws SQLException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(UsuarioEmail,UsuarioNome,UsuarioSobrenome,UsuarioDataNascimento,UsuarioTelefone,UsuarioSenha) VALUES(?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuarioEmail());
            stmt.setString(2, usuario.getUsuarioNome());
            stmt.setString(3, usuario.getUsuarioSobrenome());
            stmt.setString(4, usuario.getUsuarioDataNascimento());
            stmt.setString(5, usuario.getUsuarioTelefone());
            stmt.setString(6, usuario.getUsuarioSenha());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
	}
}
