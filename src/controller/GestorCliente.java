package controller;


import java.util.ArrayList;

import model.Cliente;


public class GestorCliente {
	ArrayList<Cliente> arCliente;
	
	public GestorCliente() {
		this.arCliente = new ArrayList<Cliente>();	
	}
	
	public void addClient(String nome, String morada, String email, String telefone) {
		
		Cliente c = new Cliente(nome, morada, email, telefone, 0);
		
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
	}
	
	public void addClient(Cliente c) {
		
		int novoId = arCliente.size();
		
		c.setId(novoId);
		
		arCliente.add(c);
		
	}
	
	
	public Cliente getCliente(int id) {

		for (Cliente c : arCliente) {
			if (c.getId() == id)
				return c;
		}
		
		return null;
	}
}