package application;

import controller.GestorCliente;
import misc.MData;

public class App {
		
		public static void main(String[] args) {
			//System.out.println(" Hello World ");
			
			MData.fillData();
			
			GestorCliente gc = new GestorCliente();
			gc.addClient(MData.cl);

		}
		
	}

