package Stub;

import java.util.ArrayList;

public class MedicoStub {

	private int codiceMedico;
	private String Nome;
	private String cognome;
	
	public static ArrayList<PazienteStub> StubPazienti = new ArrayList<PazienteStub>();	
	
	public static ArrayList<TerapiaStub> StubTerapie = new ArrayList<TerapiaStub>();
	


	public int getCodiceMedico() {
		return codiceMedico;
	}


	public void setCodiceMedico(int codiceMedico) {
		this.codiceMedico = codiceMedico;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public MedicoStub(int codiceMedico, String nome, String cognome) {
		this.codiceMedico = codiceMedico;
		Nome = nome;
		this.cognome = cognome;
		
	}	

}
