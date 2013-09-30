package ar.edu.unlam.tallerweb.tanteador;

public class tanteador {
	
	private int tantos;
	
	public tanteador(){
		this.tantos = 0;
	}
	
	private void simple(){
		this.tantos += 1;
	}
	private void doble(){
		this.tantos += 2;
	}
	
	private void triple(){
		this.tantos += 3;
	}
	
	public void anotar( int num){
		switch(num) {
		 case 1: 
		     this.simple();
		     break;
		 case 2: 
			 this.doble();
		     break;
		 case 3: 
			 this.triple();
		     break;
		 default:
			 System.out.println("Valor erroneo");
		}
	}
}
