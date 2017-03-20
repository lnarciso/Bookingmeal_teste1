package misc;

import java.util.ArrayList;

import model.Cliente;
import model.Ficha;
import model.Reserva;
import model.Restaurante;

public class MData {
	

	public static Reserva res = new Reserva ("200317" , "validar reserva");
	public static ArrayList<Reserva> arres = new ArrayList<Reserva>();
	
	public static Restaurante rest = new Restaurante ("Nome " , "morada" , "contato" , "especialidade");
	public static Cliente cl = new Cliente ("Luis" , "Moita" , "luis.narcisoo@gmail.com" , "210000000");
	
	public static Ficha fl = new Ficha(arres);
	
	public static void fillData(){
		arres.add(res);
		cl.getRestaurante().add(rest);
	}

}
