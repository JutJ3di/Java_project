package Entity;

import java.util.ArrayList;

import Stub.MedicoStub;

public class Medico {



	private int codiceMedico;
	private String Nome;
	private String cognome;
	public static ArrayList<Paziente> Pazienti = new ArrayList<Paziente>();
	public static ArrayList<Terapia> AssegnaTerapie = new ArrayList<Terapia>();
	
	
	public Medico(int codiceMedico, String nome, String cognome) {
		
		MedicoStub Stub = new MedicoStub(codiceMedico,nome,cognome);
		
		this.codiceMedico = Stub.getCodiceMedico();
		Nome = Stub.getNome();
		this.cognome = Stub.getCognome();
		
	}
	
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

	public String VerificaRilevazione(Paziente P) {
		
		
		if(P.getRilevazione_giornaliera().getLivelloGlicemia()>100) {
			
			return "Livello Glicemia Elevato : " + Integer.valueOf(P.getRilevazione_giornaliera().getLivelloGlicemia()).toString() + " ";
			
		}
		
		if(P.getRilevazione_giornaliera().getPressioneSangue()<70 || P.getRilevazione_giornaliera().getPressioneSangue() > 150) {
			
			return "Livello Pressione non nella norma : " + Integer.valueOf(P.getRilevazione_giornaliera().getPressioneSangue()).toString() + " ";
			
		}
		
		if(P.getRilevazione_giornaliera().getTemperatura()>37.5) {
			
			return "Livello Temperatura alta : " + Float.valueOf(P.getRilevazione_giornaliera().getTemperatura()).toString() + " ";
			
		}
		
		return "TUTTO NELLA NORMA";
		
		
	}
		


}