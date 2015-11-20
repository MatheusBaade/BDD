package two.cats;

import java.math.BigDecimal;

public class Animal {

	String nomeAnimal;
	int codigoAnimal;
	Cliente dono = new Cliente();
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public int getCodigoAnimal() {
		return codigoAnimal;
	}
	public void setCodigoAnimal(int codigoAnimal) {
		this.codigoAnimal = codigoAnimal;
	}
	
	public Animal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	
	  
	
	
}
