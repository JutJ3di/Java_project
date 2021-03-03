package Stub;

import java.util.ArrayList;

public class PazienteStub {

	
	private String Nome;
	private String Cognome;
	private String DataNascita;
	private String CV;
	private String email;
	private String Password;
	

	private MedicoStub MedicoAssociato;

	private RilevazioneStub Rilevazione;
	
	public ArrayList<TerapiaStub> TerapieStub = new ArrayList<TerapiaStub>();
	
	
	public PazienteStub(String nome, String cognome, String dataNascita, String cV, String email, String password) {
	
	Nome = nome;
	Cognome = cognome;
	DataNascita = dataNascita;
	CV = cV;
	this.email = email;
	Password = password;
	setMedicoAssociato(null);
	setRilevazione(null);
	
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


	public MedicoStub getMedicoAssociato() {
		return MedicoAssociato;
	}


	public void setMedicoAssociato(MedicoStub medicoAssociato) {
		MedicoAssociato = medicoAssociato;
	}


	public RilevazioneStub getRilevazione() {
		return Rilevazione;
	}


	public void setRilevazione(RilevazioneStub rilevazione) {
		Rilevazione = rilevazione;
	}


	
	
	
}
