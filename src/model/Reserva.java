package model;

public class Reserva {
	
	private String nome_Res, morada_Res, Contato_Res;
	private String nome_Cli, morada_Cli, contato_Cli, email_Cli;
	private String data_Reserva;
	
	public Reserva(String nome_Res, String morada_Res, String contato_Res, String nome_Cli, String morada_Cli,
			String contato_Cli, String email_Cli, String data_Reserva) {
		super();
		this.nome_Res = nome_Res;
		this.morada_Res = morada_Res;
		Contato_Res = contato_Res;
		this.nome_Cli = nome_Cli;
		this.morada_Cli = morada_Cli;
		this.contato_Cli = contato_Cli;
		this.email_Cli = email_Cli;
		this.data_Reserva = data_Reserva;
	}

	public String getNome_Res() {
		return nome_Res;
	}

	public void setNome_Res(String nome_Res) {
		this.nome_Res = nome_Res;
	}

	public String getMorada_Res() {
		return morada_Res;
	}

	public void setMorada_Res(String morada_Res) {
		this.morada_Res = morada_Res;
	}

	public String getContato_Res() {
		return Contato_Res;
	}

	public void setContato_Res(String contato_Res) {
		Contato_Res = contato_Res;
	}

	public String getNome_Cli() {
		return nome_Cli;
	}

	public void setNome_Cli(String nome_Cli) {
		this.nome_Cli = nome_Cli;
	}

	public String getMorada_Cli() {
		return morada_Cli;
	}

	public void setMorada_Cli(String morada_Cli) {
		this.morada_Cli = morada_Cli;
	}

	public String getContato_Cli() {
		return contato_Cli;
	}

	public void setContato_Cli(String contato_Cli) {
		this.contato_Cli = contato_Cli;
	}

	public String getEmail_Cli() {
		return email_Cli;
	}

	public void setEmail_Cli(String email_Cli) {
		this.email_Cli = email_Cli;
	}

	public String getData_Reserva() {
		return data_Reserva;
	}

	public void setData_Reserva(String data_Reserva) {
		this.data_Reserva = data_Reserva;
	}
	
	
	
	
	
	
	

}
