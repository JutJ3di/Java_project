package Stub;



public class RilevazioneStub {
	
	private int PressioneSangue;
	private int LivelloGlicemia;
	private float temperatura;
	private String data;

	
	public RilevazioneStub(int pressioneSangue, int livelloGlicemia, float temperatura, String data) {
	
		PressioneSangue = pressioneSangue;
		LivelloGlicemia = livelloGlicemia;
		this.temperatura = temperatura;
		this.data = data;
	

	
	}
	
	public RilevazioneStub(int num){
		
		if(num == 1) {
			this.data=null;
			this.LivelloGlicemia = 70;
			this.PressioneSangue = 60;
			this.temperatura = (float) 36.0;
		}else if(num == 2) {
			this.data=null;
			this.LivelloGlicemia = 120;
			this.PressioneSangue = 85;
			this.temperatura = (float) 36.4;	
		}else if (num == 3) {
			
			this.data=null;
			this.LivelloGlicemia = 70;
			this.PressioneSangue = 85;
			this.temperatura = (float) 38.0;
			
		}else if (num == 4) {
			
			this.data = null;
			this.LivelloGlicemia = 80;
			this.PressioneSangue = 100;
			this.temperatura = 36;
			
			
		}
		
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

	public void setData(String data) {
		this.data = data;
	}


}
