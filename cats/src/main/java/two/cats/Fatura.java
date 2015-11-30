package two.cats;

import java.math.BigDecimal;
import java.util.List;

public class Fatura {

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

	public BigDecimal getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(BigDecimal valorFatura) {
		this.valorFatura = valorFatura;
	}

	private Cliente cliente;

	private List<Procedimento> procedimentos;

	private BigDecimal valorFatura;

}
