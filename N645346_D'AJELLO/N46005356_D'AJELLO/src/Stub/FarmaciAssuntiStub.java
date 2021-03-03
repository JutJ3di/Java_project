package Stub;

import java.util.Date;

public class FarmaciAssuntiStub {

	
	private Date Data;
	private int Ora;
	private String Nome;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getOra() {
		return Ora;
	}
	
	public void setOra(int ora) {
		Ora = ora;
	}
	
	public Date getData() {
		return Data;
	}
	
	public void setData(Date data) {
		Data = data;
	}
	
	public FarmaciAssuntiStub(Date data, int ora, String nome) {
		
		Data = data;
		Ora = ora;
		Nome = nome;
	}

}
