package model;

import java.util.ArrayList;

public class Ficha {
	
	ArrayList<Restaurante> Restaurante;
	ArrayList<Reserva> Reserva;
	public Ficha(ArrayList<model.Restaurante> restaurante, ArrayList<model.Reserva> reserva) {
		super();
		Restaurante = restaurante;
		Reserva = reserva;
	}
	public ArrayList<Restaurante> getRestaurante() {
		return Restaurante;
	}
	public void setRestaurante(ArrayList<Restaurante> restaurante) {
		Restaurante = restaurante;
	}
	public ArrayList<Reserva> getReserva() {
		return Reserva;
	}
	public void setReserva(ArrayList<Reserva> reserva) {
		Reserva = reserva;
	}
	
	
	


}
