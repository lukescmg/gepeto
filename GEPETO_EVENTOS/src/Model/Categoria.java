package Model;

import java.util.UUID;

public class Categoria {
	UUID CategoriaGUID;
	String CategoriaNome;
	Boolean CategoriaStatus;
	
	public UUID getCategoriaGUID() {
		return CategoriaGUID;
	}
	public void setCategoriaGUID(UUID CategoriaGUID) {
		this.CategoriaGUID = CategoriaGUID;
	}
	public String getCategoriaNome() {
		return CategoriaNome;
	}
	public void setCategoriaNome(String CategoriaNome) {
		this.CategoriaNome = CategoriaNome;
	}
	public Boolean getCategoriaStatus() {
		return CategoriaStatus;
	}
	public void setCategoriaStatus(Boolean CategoriaStatus) {
		this.CategoriaStatus = CategoriaStatus;
	}
}
