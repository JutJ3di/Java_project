package Entity;

import java.util.ArrayList;

import Stub.PazienteStub;

public class Paziente {

	private String Nome;
	private String Cognome;
	private String DataNascita;
	private String CV;
	private String email;
	private String Password;
	
	private Medico MedicoAssociato;
	
	private Rilevazione rilevazione_giornaliera;
	
	public ArrayList<Terapia> Terapie = new ArrayList<Terapia>();
	


	public Paziente() {

	}



	

	
	public Paziente(String nome, String cognome, String dataNascita, String cV, String email, String password,
			Medico medicoAssociato, Rilevazione rilevazione_giornaliera) {
	
		PazienteStub Stub = new PazienteStub(nome,cognome,dataNascita,cV,email,password);
		
		Nome = Stub.getNome();
		Cognome = Stub.getCognome();
		DataNascita = Stub.getDataNascita();
		CV = Stub.getCV();
		this.email = Stub.getEmail();
		Password = Stub.getPassword();
		this.rilevazione_giornaliera = rilevazione_giornaliera;
		MedicoAssociato = medicoAssociato;
		Terapie = null;
	}
	
	public Medico getMedicoAssociato() {
		return MedicoAssociato;
	}


	public void setMedicoAssociato(Medico medicoAssociato) {
		MedicoAssociato = medicoAssociato;
	}


	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getDataNascita() {
		return DataNascita;
	}
	public void setDataNascita(String dataNascita) {
		DataNascita = dataNascita;
	}
	public String getCV() {
		return CV;
	}
	public void setCV(String cV) {
		CV = cV;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public Rilevazione getRilevazione_giornaliera() {
		return rilevazione_giornaliera;
	}

	public void setRilevazione_giornaliera(Rilevazione rilevazione_giornaliera) {
		this.rilevazione_giornaliera = rilevazione_giornaliera;
	}

	public void Effettua_Rilevazione(Rilevazione rile) {
		
		this.rilevazione_giornaliera.setData(rile.getData());
		this.rilevazione_giornaliera.setLivelloGlicemia(rile.getLivelloGlicemia());
		this.rilevazione_giornaliera.setPressioneSangue(rile.getPressioneSangue());
		this.rilevazione_giornaliera.setTemperatura(rile.getTemperatura());
		
	}
	

}