package two.cats;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

	String Nomecliente ;
	int clienteID;
	ArrayList animais;

	public void listaItemAdd( Animal animal ) {
		if ( animais == null ) {
			animais = new ArrayList<Item>();
		}
		animais.add( animal );
	}

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getNomecliente() {
		return Nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		Nomecliente = nomecliente;
	}
	  
}
