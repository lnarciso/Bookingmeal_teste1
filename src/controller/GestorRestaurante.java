package controller;

import java.util.ArrayList;

import model.Restaurante;

public class GestorRestaurante {

	ArrayList<Restaurante> arRestaurante;
	
	public GestorRestaurante() {
		this.arRestaurante = new ArrayList<Restaurante>();	
	}
	
	public void addRestaurante(String nome, String morada, String contato, String especialidade) {
		
		Restaurante r = new Restaurante(nome, morada, contato, especialidade, 0);
		
		int novoId = arRestaurante.size();
		
		r.setId(novoId);
		
		arRestaurante.add(r);
		
	}
	
	public void addClient(Restaurante r) {
		
		int novoId = arRestaurante.size();
		
		r.setId(novoId);
		
		arRestaurante.add(r);
		
	}
	
	
	public Restaurante getCliente(int id) {

		for (Restaurante r : arRestaurante) {
			if (r.getId() == id)
				return r;
		}
		
		return null;
	}
}