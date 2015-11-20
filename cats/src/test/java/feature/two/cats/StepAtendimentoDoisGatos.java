package feature.two.cats;

import two.cats.Animal;
import two.cats.Cliente;
import two.cats.Recibo;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class StepAtendimentoDoisGatos {
	
	Recibo recibo = new Recibo();
	Cliente cliente = new Cliente();
	
	@Given("^um cliente com nome \"([^\"]*)\" que tem dois animais de nomes \"([^\"]*)\" e \"([^\"]*)\"$")
	public void um_cliente_com_nome_que_tem_dois_animais_de_nomes_e(String arg1, String arg2, String arg3) throws Throwable {
	    recibo.setNomeCliente(arg1);
	    cliente.listaItemAdd(new Animal(arg2));
	    cliente.listaItemAdd(new Animal(arg2));	    
	}

	@Given("^um servico de \"([^\"]*)\"$")
	public void um_servico_de(String arg1) throws Throwable {
		Assert.assertEquals( arg1, "Castração" );
	}

	@Given("^um outro servico de \"([^\"]*)\"$")
	public void um_outro_servico_de(String arg1) throws Throwable {
		Assert.assertEquals( arg1, "Esterelização" );
	}

	@When("^o cliente vai pagar em \"([^\"]*)\"$")
	public void o_cliente_vai_pagar_em(String arg1) throws Throwable {
		Assert.assertTrue( arg1.equals( "Boleto" ) );
	}
	
	@Then("^o recibo deve ter (\\d+) servicos$")
	public void o_recibo_deve_ter_servicos(int arg1) throws Throwable {
		Assert.assertTrue( arg1 == 4 );
	}

	@Then("^o servico (\\d+) deve ser \"([^\"]*)\"$")
	public void o_servico_deve_ser(int arg1, String arg2) throws Throwable {
		switch ( arg1 ) {
		case 1:
			Assert.assertEquals( arg2, "Castração" );
			break;

		default:
			Assert.assertEquals( arg2, "Esterelização" );
			break;
	}
	}



}
