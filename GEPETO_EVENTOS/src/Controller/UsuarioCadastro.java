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
		
		System.out.print("Insira seu email: ");
		usuarios.setUsuarioEmail(UsuarioEmail = input.next());
	
		System.out.print("Insira seu nome: ");
		usuarios.setUsuarioNome(UsuarioNome = input.next());
		
		System.out.print("Insira seu sobrenome: ");
		usuarios.setUsuarioSobrenome(UsuarioSobrenome = input.next());
		
		System.out.print("Insira sua data de nascimento: ");
		usuarios.setUsuarioDataNascimento(UsuarioDataNascimento = input.next());
		
		System.out.print("Insira seu telefone: ");
		usuarios.setUsuarioTelefone(UsuarioTelefone = input.next());
		
		System.out.print("Insira uma senha: ");
		usuarios.setUsuarioSenha(UsuarioSenha = input.next());
		
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
