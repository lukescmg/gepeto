package Controller;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

import DAO.EventoDAO;
import Model.Evento;

public class EventoCadastro {
	public static void main(String[] args) throws SQLException
	{
		
		Scanner input = new Scanner(System.in);
		
		Evento eventos = new Evento();
		
		UUID EventoGUID;
		String EventoNome;
		String EventoData;
		int EventoHorario;
		String EventoDescricao;
		int EventoFaixaEtaria;
		double EventoValor;
		
		EventoGUID = UUID.randomUUID();
		eventos.setEventoGUID(EventoGUID);
		
		System.out.print("Insira o nome do evento: ");
		eventos.setEventoNome(EventoNome = input.next());
	
		System.out.print("Insira a data do evento: ");
		eventos.setEventoData(EventoData = input.next());
		
		System.out.print("Insira o horário do evento: ");
		eventos.setEventoHorario(EventoHorario = input.nextInt());
		
		System.out.print("Insira a descrição sobre o evento: ");
		eventos.setEventoDescricao(EventoDescricao = input.next());
		
		System.out.print("Insira a faixa etária do evento: ");
		EventoFaixaEtaria = input.nextInt();
		eventos.setEventoFaixaEtaria(EventoFaixaEtaria);
		
		System.out.print("Insira o preço do ingresso: "); 
		EventoValor = input.nextDouble();
		eventos.setEventoValor(EventoValor); 
		
		if ((EventoNome.isEmpty()) || (EventoData.isEmpty()) || (EventoDescricao.isEmpty())) {
			System.out.print("Os campos não podem estar vazios");
			}
			else {
			    EventoDAO dao = new EventoDAO();
			    dao.adiciona(eventos);
			    System.out.print("Evento criado com sucesso! ");
			}
	}
}
