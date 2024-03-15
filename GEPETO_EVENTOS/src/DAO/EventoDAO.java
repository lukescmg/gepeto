package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import Factory.ConnectionFactory;
import Model.Evento;

public class EventoDAO {
	private Connection connection;
	
	UUID EventoGUID;
	String EventoNome;
	String EventoData;
	int EventoHorario;
	String EventoDescricao;
	int EventoFaixaEtaria;
	double EventoValor;
	
	public EventoDAO() throws SQLException{
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Evento evento){ 
        String sql = "INSERT INTO evento(EventoGUID,EventoNome,EventoData,EventoHorario,EventoDescricao,EventoFaixaEtaria,EventoValor) VALUES(?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, evento.getEventoGUID().toString());
            stmt.setString(2, evento.getEventoNome());
            stmt.setString(3, evento.getEventoData());
            stmt.setInt(4, evento.getEventoHorario());
            stmt.setString(5, evento.getEventoDescricao());
            stmt.setInt(6, evento.getEventoFaixaEtaria());
            stmt.setDouble(7, evento.getEventoValor());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }
	}
}

