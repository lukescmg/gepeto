package Controller;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;
import DAO.CategoriaDAO;
import Model.Categoria;

public class CategoriaCadastro {
	
	public static void main(String[] args) throws SQLException
	{
		
		Scanner input = new Scanner(System.in);
		
		Categoria categorias = new Categoria();
		
		UUID CategoriaGUID = null;
		String CategoriaNome;
		Boolean CategoriaStatus = true;
		
		CategoriaGUID = UUID.randomUUID();
		categorias.setCategoriaGUID(CategoriaGUID);
	
		System.out.print("Insira a categoria do evento: ");
		categorias.setCategoriaNome(CategoriaNome = input.next());
		
		categorias.setCategoriaStatus(CategoriaStatus);
		
		if (CategoriaNome.isEmpty()) {
			System.out.print("Os campos não podem estar vazios");
			}
			else {
			    CategoriaDAO dao = new CategoriaDAO();
			    dao.adiciona(categorias);
			    System.out.print("Categoria cadastrada com sucesso! ");
			}

	}
	

}
