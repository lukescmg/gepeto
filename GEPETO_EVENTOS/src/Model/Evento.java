package Model;

import java.util.UUID;

public class Evento {
	UUID EventoGUID;
	String EventoNome;
	String EventoData;
	int EventoHorario;
	String EventoDescricao;
	int EventoFaixaEtaria;
	double EventoValor;
	
	public UUID getEventoGUID() {
		return EventoGUID;
	}
	public void setEventoGUID(UUID EventoGUID) {
		this.EventoGUID = EventoGUID;
	}
	
	public String getEventoNome() {
		return EventoNome;
	}
	public void setEventoNome(String EventoNome) {
		this.EventoNome = EventoNome;
	}
	
	public String getEventoData() {
		return EventoData;
	}
	public void setEventoData(String EventoData) {
		this.EventoData = EventoData;
	}
	
	public int getEventoHorario() {
		return EventoHorario;
	}
	public void setEventoHorario(int EventoHorario) {
		this.EventoHorario = EventoHorario;
	}
	
	public String getEventoDescricao() {
		return EventoDescricao;
	}
	public void setEventoDescricao(String EventoDescricao) {
		this.EventoDescricao = EventoDescricao;
	}
	
	public int getEventoFaixaEtaria() {
		return EventoFaixaEtaria;
	}
	public void setEventoFaixaEtaria(int EventoFaixaEtaria) {
		this.EventoFaixaEtaria = EventoFaixaEtaria;
	}
	
	public double getEventoValor() {
		return EventoValor;
	}
	public void setEventoValor(double EventoValor) {
		this.EventoValor = EventoValor;
	}
}
