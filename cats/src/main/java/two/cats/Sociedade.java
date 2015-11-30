package two.cats;

import java.util.HashSet;
import java.util.Set;

public class Sociedade extends Cliente {

	private Set<Cliente> socios = new HashSet<Cliente>();
	public Set<Cliente> getSocios() {
		return socios;
	}
	public void setSocios(Set<Cliente> socios) {
		this.socios = socios;
	}
	public Cliente getResponsavelEncaminhamento() {
		return responsavelEncaminhamento;
	}
	public void setResponsavelEncaminhamento(Cliente responsavelEncaminhamento) {
		this.responsavelEncaminhamento = responsavelEncaminhamento;
	}
	private Cliente responsavelEncaminhamento;
}
