package Entity;

import Stub.RilevazioneStub;

public class Rilevazione {


	private int PressioneSangue;
	private int LivelloGlicemia;
	private float temperatura;
	private String data;

	
	public Rilevazione () {
		
		this.data = null;
		this.LivelloGlicemia = 0;
		this.PressioneSangue = 0;
		this.temperatura = 0;
		
		
	}
	
	
	public Rilevazione(int pressioneSangue, int livelloGlicemia, float temperatura, String data) {
		
		RilevazioneStub Stub = new RilevazioneStub(pressioneSangue,livelloGlicemia,temperatura,data);
		
		this.data = Stub.getData();
		this.temperatura = Stub.getTemperatura();
		this.LivelloGlicemia = Stub.getLivelloGlicemia();
		this.PressioneSangue = Stub.getPressioneSangue();
		
	}
	
	public int getPressioneSangue() {
		return PressioneSangue;
	}
	public void setPressioneSangue(int pressioneSangue) {
		PressioneSangue = pressioneSangue;
	}
	public int getLivelloGlicemia() {
		return LivelloGlicemia;
	}
	public void setLivelloGlicemia(int livelloGlicemia) {
		LivelloGlicemia = livelloGlicemia;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public String getData() {
		return data;
	}
	public void setData(String string) {
		this.data = string;
	}

}