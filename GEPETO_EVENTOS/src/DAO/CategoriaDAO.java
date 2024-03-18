package DAO;

import java.sql.*;
import java.util.UUID;

import Factory.ConnectionFactory;
import Model.Categoria;

public class CategoriaDAO {
	private Connection connection;
	UUID CategoriaGUID;
	String CategoriaNome;
	String CategoriaStatus;
		
	public CategoriaDAO() throws SQLException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Categoria categoria){ 
        String sql = "INSERT INTO categoria(CategoriaGUID,CategoriaNome,CategoriaStatus) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getCategoriaGUID().toString());
            stmt.setString(2, categoria.getCategoriaNome());
            stmt.setBoolean(3, categoria.getCategoriaStatus());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException stmt) { 
            throw new RuntimeException(stmt);
        }
	}
	
}
