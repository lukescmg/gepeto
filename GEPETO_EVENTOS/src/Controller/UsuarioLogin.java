package Controller;
import java.util.Scanner;
import java.util.HashMap;


public class UsuarioLogin {
	static HashMap<String, String> users = new HashMap<String, String>();
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	int escolha = 0;
	while (escolha != 3){
		System.out.println("Menu");
		System.out.println("Selecione uma opção");
		System.out.println("1-Login");
		System.out.println("2-Cadastro");
		System.out.println("3-Sair");
		escolha = scanner.nextInt();
		scanner.nextLine();
		switch (escolha) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}
	scanner.close();
	}
}