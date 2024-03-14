package DAO;

public class CategoriaDAO {
	String CategoriaGUID;
	String CategoriaNome;
	String CategoriaStatus;
	
	public String getCategoriaGUID() {
		return CategoriaGUID;
	}
	public void setCategoriaGUID(String CategoriaGUID) {
		this.CategoriaGUID = CategoriaGUID;
	}
	public String getCategoriaNome() {
		return CategoriaNome;
	}
	public void setCategoriaNome(String CategoriaNome) {
		this.CategoriaNome = CategoriaNome;
	}
	public String getCategoriaStatus() {
		return CategoriaStatus;
	}
	public void setCategoriaStatus(String CategoriaStatus) {
		this.CategoriaStatus = CategoriaStatus;
	}
}
