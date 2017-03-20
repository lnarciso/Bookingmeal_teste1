package view;

import java.util.Scanner;

import model.Cliente;

public class GuiCliente {

	private Scanner scanner;

	public GuiCliente() {
		
	}
	
public Cliente criarCliente(){
		
		System.out.println("Introduza o nome do cliente");
		scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		
		System.out.println("Introduza o contato do cliente");
		String contato = scanner.nextLine();
		
		Cliente c = new Cliente( nome, contato, contato, contato, 0);
		c.setNome(nome);

		
		return c;
		
	}
	
}


