package two.cats;

import java.math.BigDecimal;
import java.util.List;

public class Boleto {

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Fatura> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}

	public BigDecimal getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(BigDecimal valorBoleto) {
		this.valorBoleto = valorBoleto;
	}

	private Cliente cliente;

	private List<Fatura> faturas;

	private BigDecimal valorBoleto;

}
