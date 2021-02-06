import java.util.Scanner;
import javax.print.event.PrintJobListener;


public class Calcolatrice {
	

	
	public int somma(int op1,int op2) {
		return op1+op2;
	}
	public int sottrazione(int op1,int op2) {
		return op1-op2;
	}
	public int moltiplicazione(int op1,int op2) {
		return op1*op2;
	}
	public int divisione(int op1,int op2) {
		if(op2 == 0) {
			System.out.println("erroreDibisioneperzero\n");
			return -1;
		}
		else {
			return op1/op2;
		}
	}
	public int potenza(int base,int esponente){

		if(esponente = 1){
			return base;
		}else if(esponente == 0){
			return 1;
		}
		else{
			int s = 1;
			for (int i = 0;i<esponente; i++) {
				s = base * s;
			}
		}
	}
    

	
	public void menu() {
		
		System.out.print("\n\nCiao sei nella calcolatrice in java che vuoi fare?\n\n");
        
        System.out.println("Somma 1\nSottrazione 2\nMoltiplicazione 3\nDivisione 4 \n");

        Scanner in = new Scanner(System.in);
        Scanner oper1 = new Scanner(System.in);
        Scanner oper2 = new Scanner(System.in);
        
        
		
		int scelta = in.nextInt();
		
		if(scelta == 1) {
			
			System.out.println("primo Operando : ");
            int op1 = oper1.nextInt();
            System.out.println("secondo Operando : ");
			int op2 = oper2.nextInt();
            
            System.out.println("risultato  =  ");
			System.out.println(somma(op1,op2));
			
        }
		else if(scelta == 2) {
			
			System.out.println("primo Operando : ");
            int op1 = oper1.nextInt();
            System.out.println("secondo Operando : ");
			int op2 = oper2.nextInt();
            
            System.out.println("risultato  =  ");
			System.out.println(sottrazione(op1,op2));
			
        }else if(scelta == 3) {
			
			System.out.println("primo Operando : ");
            int op1 = oper1.nextInt();
            System.out.println("secondo Operando : ");
			int op2 = oper2.nextInt();
            
            System.out.println("risultato  =  ");
			System.out.println(moltiplicazione(op1,op2));
			
        }
        else if(scelta == 4) {
			
            System.out.println("primo Operando : ");
            int op1 = oper1.nextInt();
            System.out.println("secondo Operando : ");
            int op2 = oper2.nextInt();
            
            System.out.println("risultato  =  ");
            System.out.println(divisione(op1,op2));
            
        }
    
        in.close();
        oper1.close();
        oper2.close();
        
		
	}
	
	
	public static void main(String [] args) {
	
		System.out.println("WELCOME!");

		Calcolatrice calc=new Calcolatrice(); 
		
		calc.menu();
           

	}
	

}
