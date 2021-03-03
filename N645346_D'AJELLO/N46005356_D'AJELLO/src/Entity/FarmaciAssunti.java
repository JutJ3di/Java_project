package Entity;

import java.util.*;

public class FarmaciAssunti {

	private Date Data;
	private int Ora;
	private String Nome;
	
	public FarmaciAssunti(Date data, int ora, String nome) {
		
		Data = data;
		Ora = ora;
		Nome = nome;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public int getOra() {
		return Ora;
	}

	public void setOra(int ora) {
		Ora = ora;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


}