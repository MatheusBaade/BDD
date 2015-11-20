package two.cats;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Recibo {
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public BigDecimal getValorAtendimento() {
		return valorAtendimento;
	}

	public void setValorAtendimento(BigDecimal valorAtendimento) {
		this.valorAtendimento = valorAtendimento;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	private String nomeCliente;
	private String nomeAnimal;
	private BigDecimal valorAtendimento = new BigDecimal( 0 );
	private List<Item> itens;

	public void listaItemAdd( Item item ) {
		if ( itens == null ) {
			itens = new ArrayList<Item>();
		}
		itens.add( item );
		this.valorAtendimento = this.valorAtendimento.add( item.getValor() );
	}
}
