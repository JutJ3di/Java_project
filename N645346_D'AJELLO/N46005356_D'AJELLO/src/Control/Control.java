package Control;

import Entity.Medico;
import Entity.Paziente;
import Entity.SistemaDiMonitoraggio;




public class Control {


	
	static public  String ControllaPaziente(String CV, int CodiceMedico) {
		
		String result;
		
		
		
		Paziente P = SistemaDiMonitoraggio.VerificaUtente(CV);	
		
		
		
		if(P == null) { 
		
			result = "ERROR CV invalido";
			return result;
		
		}
		
		else {
		
			if(SistemaDiMonitoraggio.VerificaCodiceMedico(CodiceMedico,P)==null) {
				
				result =  "ERROR Codice Medico non associato al paziente"; 
				return result;
			
			}
				
			else {	
				
				Medico medico = SistemaDiMonitoraggio.VerificaCodiceMedico(CodiceMedico,P);
				result = medico.VerificaRilevazione(P) + "\n" + P.getNome() + " " +  P.getCognome();
			
			}	
		
		}
		
		
		return result;
		
		
	}
}