package Entity;

import java.util.ArrayList;
import Stub.MedicoStub;
import Stub.PazienteStub;
import Stub.RilevazioneStub;


public class SistemaDiMonitoraggio {

	/**
	 * 
	 * @param Nome
	 * @param C
	 * @param d
	 * @param Cv
	 * @param em
	 * @param pas
	 */

	static public ArrayList<Medico> Medici = new ArrayList<Medico>();
	static public ArrayList<Paziente> Pazienti = new ArrayList<Paziente>();
	static public ArrayList<Rilevazione> Rilevazioni = new ArrayList<Rilevazione>();
		



	static public Paziente VerificaUtente(String CV) {

			
		
		MedicoStub ME1 = new MedicoStub(12345,"Armando","Netturbino");
		MedicoStub ME2 = new MedicoStub(31334,"Giuseppe","Albume");
		MedicoStub ME3 = new MedicoStub(21029,"Francesco","Bellofresco");
	
			
		RilevazioneStub RI1 = new RilevazioneStub(1);
		RilevazioneStub RI2 = new RilevazioneStub(2);
		RilevazioneStub RI3 = new RilevazioneStub(3);
		RilevazioneStub RI4 = new RilevazioneStub(4);
	
		
		PazienteStub PA1 = new PazienteStub("Marco","Rossi","12/12/2000","S23KDNC36SBDH32J","marco.rossi@mail.com","ssdjkdkjs");	
		PazienteStub PA2 = new PazienteStub("Ciro","Verdi","11/12/1999","CV3KDNC36SBDH32J","ciro.verdi@mail.com","aasdjkdkjs");
		PazienteStub PA3 = new PazienteStub("Antonio","Fassi","03/02/2000","AF3KDNS363BDH32J","antonio.fassi@mail.com","ssdaSDdkjs");
		PazienteStub PA4 = new PazienteStub("Davide","Latobi","08/10/1997","WJQAV32JS73HDBA7","davide.latobi@mail.com","sisiuihje");
		
		
		
		Rilevazione R1 = new Rilevazione();
		R1.setLivelloGlicemia(RI1.getLivelloGlicemia());
		R1.setData(RI1.getData());
		R1.setPressioneSangue(RI1.getPressioneSangue());
		R1.setTemperatura(RI1.getTemperatura());
		
	
		Rilevazione R2 = new Rilevazione();
		R2.setLivelloGlicemia(RI2.getLivelloGlicemia());
		R2.setPressioneSangue(RI2.getPressioneSangue());
		R2.setData(RI2.getData());
		R2.setTemperatura(RI2.getTemperatura());
		
		
		Rilevazione R3 = new Rilevazione();
		R3.setData(RI3.getData());
		R3.setLivelloGlicemia(RI3.getLivelloGlicemia());
		R3.setPressioneSangue(RI3.getPressioneSangue());
		R3.setTemperatura(RI3.getTemperatura());
		
		Rilevazione R4 = new Rilevazione();
		R4.setData(RI4.getData());
		R4.setLivelloGlicemia(RI4.getLivelloGlicemia());
		R4.setPressioneSangue(RI4.getPressioneSangue());
		R4.setTemperatura(RI4.getTemperatura());
		
		

		Medico M1 = new Medico(0, "VUOTO", "VUOTO");
		M1.setNome(ME1.getNome());
		M1.setCognome(ME1.getCognome());
		M1.setCodiceMedico(ME1.getCodiceMedico());
		
		Medico M2 = new Medico(0,"VUOTO","VUOTO");
		M2.setCodiceMedico(ME2.getCodiceMedico());
		M2.setNome(ME2.getNome());
		M2.setCognome(ME2.getCognome());
		
		Medico M3 = new Medico(0,"VUOTO","VUOTO");
		M3.setCodiceMedico(ME2.getCodiceMedico());
		M3.setNome(ME3.getNome());
		M3.setCognome(ME3.getCognome());
		
		Paziente P1 = new Paziente();
		P1.setNome(PA1.getNome());
		P1.setCognome(PA1.getCognome());
		P1.setCV(PA1.getCV());
		P1.setEmail(PA1.getEmail());
		P1.setDataNascita(PA1.getDataNascita());
		P1.setPassword(PA1.getPassword());
		P1.setMedicoAssociato(M1);
		P1.setRilevazione_giornaliera(R1);
		
		Paziente P2 = new Paziente();
		P2.setNome(PA1.getNome());
		P2.setCognome(PA2.getCognome());
		P2.setCV(PA2.getCV());
		P2.setDataNascita(PA2.getDataNascita());
		P2.setMedicoAssociato(M3);
		P2.setEmail(PA2.getEmail());
		P2.setPassword(PA2.getPassword());
		P2.setRilevazione_giornaliera(R2);
		
		Paziente P3 = new Paziente();
		P3.setNome(PA3.getNome());
		P3.setCognome(PA3.getCognome());
		P3.setCV(PA3.getCV());
		P3.setEmail(PA3.getEmail());
		P3.setDataNascita(PA3.getDataNascita());
		P3.setRilevazione_giornaliera(R3);
		P3.setPassword(PA3.getPassword());
		P3.setMedicoAssociato(M3);
		
		Paziente P4 = new Paziente();
		P4.setNome(PA4.getNome());
		P4.setEmail(PA4.getEmail());
		P4.setCognome(PA4.getCognome());
		P4.setCV(PA4.getCV());
		P4.setDataNascita(PA4.getDataNascita());
		P4.setPassword(PA4.getPassword());
		P4.setMedicoAssociato(M1);
		P4.setRilevazione_giornaliera(R4);
		
		P1.Effettua_Rilevazione(R1);
		P2.Effettua_Rilevazione(R2);
		P3.Effettua_Rilevazione(R3);
		P4.Effettua_Rilevazione(R4);
		
		
		
		
		Pazienti.add(P1);
		Pazienti.add(P2);
		Pazienti.add(P3);
		Pazienti.add(P4);
		
		
		Paziente P = null;
		
		for(Paziente e : Pazienti) {
			
			if(e.getCV().equals(CV))
				return e;
			
		}
		
		return P;
		

	}
	
	static public Medico VerificaCodiceMedico(int codice,Paziente P) {
			
		if(P.getMedicoAssociato().getCodiceMedico() == codice) {
			return P.getMedicoAssociato();//return true
		}else {
			return null;//return false
		}
		
	}
	
	/*static public String VerificaRilevazione(Paziente P) {
		
		
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
		
		
	}*/
		


}