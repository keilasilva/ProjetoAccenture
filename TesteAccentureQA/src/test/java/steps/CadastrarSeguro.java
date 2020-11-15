package steps;


import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.openqa.selenium.WebDriver;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CadastrarEnterInsurantData;
import pages.CadastrarEnterProductData;
import pages.CadastrarEnterVehicleData;
import pages.CadastrarSelectPriceOption;
import pages.CadastrarSendQuote;
import pages.ValidarMensagem;

@RunWith(Runner.class)
public class CadastrarSeguro {
	private WebDriver driver;
	
	@Before
	public void iniciar() {
		driver = BaseUtil.createChrome();
	}
	
	@After
//	public void Finalizar() {
//	driver.quit();
//	}
	@Given("^que informo os campos da aba enter Vehicle Data e prossigo$")
	public void que_informo_os_campos_da_aba_enter_Vehicle_Data_e_prossigo() throws Throwable {
		 new CadastrarEnterVehicleData (driver)
		   .preencherAbaEnterVehicleData("BMW","Moped","125", "12", "01/01/2020", "2","Yes","2", "Diesel","120","525", "1200", "154ff","14545");   
	}

	@Given("^informo os dados da aba enter Insurant Data e prossigo$")
	public void informo_os_dados_da_aba_enter_Insurant_Data_e_prossigo() throws Throwable {
		new CadastrarEnterInsurantData (driver)
		 .preencherEnterInsurantData("Testes", "Testes", "07/24/1984", "Rua Teste", "F","Aruba", "08150545", "Sao Paulo", "Farmer","Yes", "Yes", "Yes", "No", "No");
	}

	@Given("^informo os dados da aba enter Product Data e prossigo$")
	public void informo_os_dados_da_aba_enter_Product_Data_e_prossigo() throws Throwable {
		new CadastrarEnterProductData (driver)
		.preencherAbaEnterProductData("01/01/2021", "7.000.000,00", "Bonus 4", "Partial Coverage", "NO","Yes", "Yes");
	}

	@Given("^informo os dados da aba Select Price Option e prossigo$")
	public void informo_os_dados_da_aba_Select_Price_Option_e_prossigo() throws Throwable {
		new CadastrarSelectPriceOption (driver)
		.preencherAbaSelectPriceOption("selectplatinum");
	}

	@Given("^informo os dados da aba Send Quote e envio$")
	public void informo_os_dados_da_aba_Send_Quote_e_envio() throws Throwable {
		new CadastrarSendQuote (driver)
		.preencherAbaSendQuote("keila.silva38@gmail.com", "11987046301", "teste", "Teste123", "Teste123");
	}

	@Then("^valido a mensagem de sucesso$")
	public void valido_a_mensagem_de_sucesso() throws Throwable {
		new ValidarMensagem (driver)
		.validaMensagens();
	}
	
}
