package view;

import java.util.Scanner;

import model.Restaurante;

public class GuiRestaurante {

	
	public GuiRestaurante (){
		
	}//end GuiVendedor
	
	public Restaurante criarRestaurante(){
		
		System.out.println("Introduza o nome do restaurante");
		String nome = new Scanner(System.in).nextLine();
		
		System.out.println("Introduza a categoria do restaurante (1-3)");
		String cat = new Scanner(System.in).nextLine();
		
		Restaurante r = new Restaurante(nome, nome, nome, nome, cat);
		r.setNome(nome);
		r.setCategoria(cat);
		
		
	
		return r;
		
	}

}
