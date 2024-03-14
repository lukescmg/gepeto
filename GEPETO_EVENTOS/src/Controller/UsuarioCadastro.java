package Controller;

import Model.Usuario;
import DAO.UsuarioDAO;

import java.sql.SQLException;
import java.util.Scanner;



public class UsuarioCadastro {

	public static void main(String[] args) throws SQLException
	{
		
		Scanner input = new Scanner(System.in);
		
		Usuario usuarios = new Usuario();
		
		String UsuarioEmail;
		String UsuarioNome;
		String UsuarioSobrenome;
		String UsuarioDataNascimento;
		String UsuarioTelefone;
		String UsuarioSenha;
		
		System.out.print("Insira seu nome: ");
		UsuarioNome = input.next();
		
		System.out.print("Insira seu sobrenome: ");
		UsuarioSobrenome = input.next();
		
		System.out.print("Insira sua data de nascimento: ");
		UsuarioDataNascimento = input.next();
		
		System.out.print("Insira seu telefone: ");
		UsuarioTelefone = input.next();
		
		System.out.print("Insira seu email: ");
		UsuarioEmail = input.next();
		
		System.out.print("Insira uma senha: ");
		UsuarioSenha = input.next();
		
		if ((UsuarioSenha.isEmpty()) || (UsuarioEmail.isEmpty()) || (UsuarioTelefone.isEmpty()) || (UsuarioDataNascimento.isEmpty() || UsuarioSobrenome.isEmpty() || UsuarioNome.isEmpty())) {
			System.out.print("Os campos não podem estar vazios");
			}
			else {
			    UsuarioDAO dao = new UsuarioDAO();
			    dao.adiciona(usuarios);
			    System.out.print("Usuário inserido com sucesso! ");
			}
	}
}
