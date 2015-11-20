package feature.two.cats;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith( Cucumber.class )
public class StepAtendimentoDoisGatos {
	
	@Given("^um cliente com nome \"([^\"]*)\" que tem dois animais de nomes \"([^\"]*)\" e \"([^\"]*)\"$")
	public void um_cliente_com_nome_que_tem_dois_animais_de_nomes_e(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^um servico de \"([^\"]*)\"$")
	public void um_servico_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^um outro servico de \"([^\"]*)\"$")
	public void um_outro_servico_de(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^o cliente vai pagar em \"([^\"]*)\"$")
	public void o_cliente_vai_pagar_em(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^o recibo deve ter (\\d+) servicos$")
	public void o_recibo_deve_ter_servicos(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^o servico (\\d+) deve ser \"([^\"]*)\"$")
	public void o_servico_deve_ser(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
