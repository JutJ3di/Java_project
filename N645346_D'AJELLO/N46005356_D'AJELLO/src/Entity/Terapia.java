package Entity;

import Stub.TerapiaStub;

public class Terapia {

	private String NomeFarmaco;
	private int dose;
	private int frequenza_assuzione;
	
	public Terapia(String nomeFarmaco, int dose, int frequenza_assuzione) {
		
		TerapiaStub Stub = new TerapiaStub(nomeFarmaco,dose,frequenza_assuzione);
		NomeFarmaco = Stub.getNomeFarmaco();
		this.dose = Stub.getDose();
		this.frequenza_assuzione = Stub.getFrequenza_assuzione();
	}

	public String getNomeFarmaco() {
		return NomeFarmaco;
	}

	public void setNomeFarmaco(String nomeFarmaco) {
		NomeFarmaco = nomeFarmaco;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public int getFrequenza_assuzione() {
		return frequenza_assuzione;
	}

	public void setFrequenza_assuzione(int frequenza_assuzione) {
		this.frequenza_assuzione = frequenza_assuzione;
	}



}