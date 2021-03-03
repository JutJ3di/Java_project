package Stub;

public class TerapiaStub {

	private String NomeFarmaco;
	private int dose;
	private int frequenza_assuzione;

	public TerapiaStub(String nomeFarmaco, int dose, int frequenza_assuzione) {
		
		NomeFarmaco = nomeFarmaco;
		this.setDose(dose);
		this.frequenza_assuzione = frequenza_assuzione;
	}
	
	public String getNomeFarmaco() {
		return NomeFarmaco;
	}
	public void setNomeFarmaco(String nomeFarmaco) {
		NomeFarmaco = nomeFarmaco;
	}

	public int getFrequenza_assuzione() {
		return frequenza_assuzione;
	}
	public void setFrequenza_assuzione(int frequenza_assuzione) {
		this.frequenza_assuzione = frequenza_assuzione;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}
	
}
