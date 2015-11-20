package two.cats;

import java.math.BigDecimal;

public class Item {
	public Item( String descricao, BigDecimal valor ) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	private String descricao;
	private BigDecimal valor;

}