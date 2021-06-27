package CadastroUsuarios;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuario {

	String url;
	WebDriver driver;

	@Before
	public void iniciar() {
		url = "http://prova.stefanini-jgr.com.br/teste/qa/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ticiano\\OneDrive\\Documentos\\PROVA\\CadastroUsuarios\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
@After
	public void finalizar() {
		driver.quit();

		
	}

@Dado("^que acesso o site de cadastro da stefanini$")
public void que_acesso_o_site_de_cadastro_da_stefanini() throws Throwable {
driver.get(url);

}

@Quando("^Realizo o preenchimento do Nome \"([^\"]*)\"$")
public void realizo_o_preenchimento_do_Nome(String nome) throws Throwable {
   driver.findElement(By.id("name")).sendKeys(nome);
}

@Quando("^realizo o preenchimento do campo Senha \"([^\"]*)\"$")
public void realizo_o_preenchimento_do_campo_Senha(String senha) throws Throwable {
driver.findElement(By.id("password")).sendKeys(senha);
}

@Quando("^Clico no botao \"([^\"]*)\"$")
public void clico_no_botao(String arg1) throws Throwable {
 driver.findElement(By.id("register")).click();
 
	
}

@Entao("^exibe a mensagem a baixo do campo email \"([^\"]*)\"$")
public void exibe_a_mensagem_a_baixo_do_campo_email(String MensagemEmail) throws Throwable {
 assertEquals("O campo E-mail é obrigatório.", driver.findElement(By.cssSelector("p.error")).getText());
	

}


@Quando("^realizo o preenchimento do Nome \"([^\"]*)\"$")
public void realizo_o_preenchimento_do_Nome1(String PrimeiroNome) throws Throwable {
driver.findElement(By.id("name")).sendKeys(PrimeiroNome);
}

@Quando("^clico no botao \"([^\"]*)\"$")
public void clico_no_botao1(String arg1) throws Throwable {
	 driver.findElement(By.id("register")).click();
	
}

@Entao("^exibe a mensagem abaixo do campo Nome \"([^\"]*)\"$")
public void exibe_a_mensagem_abaixo_do_campo_Nome(String MensagemNome) throws Throwable {
  assertEquals(MensagemNome, driver.findElement(By.cssSelector("p.error")).getText());
  
}



@Quando("^realizo o preenchimento do campo email \"([^\"]*)\"$")
public void realizo_o_preenchimento_do_campo_email(String EmailInvalido) throws Throwable {
driver.findElement(By.id("email")).sendKeys(EmailInvalido);
	
}

@Quando("^realizo o preechimento do campo Senha \"([^\"]*)\"$")
public void realizo_o_preechimento_do_campo_Senha(String Senhacorreta) throws Throwable {
   driver.findElement(By.id("password")).sendKeys(Senhacorreta);
}

@Entao("^exibe a mensagem abaixo do campo email \"([^\"]*)\"$")
public void exibe_a_mensagem_abaixo_do_campo_email(String emailinvalido1) throws Throwable {
 assertEquals("Por favor, insira um e-mail válido.", driver.findElement(By.cssSelector("p.error")).getText());
 
}

@Quando("^realizo o preenchimento do campo email: \"([^\"]*)\"$")
public void realizo_o_preenchimento_do_campo_email1(String EmailValido) throws Throwable {
driver.findElement(By.id("email")).sendKeys(EmailValido);

   
}

@Quando("^realizo o preechimento do campo senha com menos que oito caracteres \"([^\"]*)\"$")
public void realizo_o_preechimento_do_campo_senha_com_menos_que_oito_caracteres(String SenhaInvalida) throws Throwable {
driver.findElement(By.id("password")).sendKeys(SenhaInvalida);

}

@Entao("^exibe a mensagem abaixo do campo Senha \"([^\"]*)\"$")
public void exibe_a_mensagem_abaixo_do_campo_Senha(String MensagemSenhaIncorreta) throws Throwable {
   assertEquals(MensagemSenhaIncorreta, driver.findElement(By.cssSelector("p.error")).getText());
   
}



@Entao("^exibe na tabela de Usuarios Cadastrados Id \"([^\"]*)\"$")
public void exibe_na_tabela_de_Usuarios_Cadastrados_Id(String IdConsulta) throws Throwable {
   assertEquals(IdConsulta, driver.findElement(By.id("tdUserId1")).getText());
   
	
	
	
}

@Entao("^Nome \"([^\"]*)\"$")
public void nome(String NomeConsulta) throws Throwable {
	   assertEquals(NomeConsulta, driver.findElement(By.id("tdUserName1")).getText());
	   
}

@Entao("^email \"([^\"]*)\"$")
public void email(String EmailConsulta) throws Throwable {
	  assertEquals(EmailConsulta, driver.findElement(By.id("tdUserEmail1")).getText());
}

@Quando("^clico no link referente ao primeiro ID \"([^\"]*)\"$")
public void clico_no_link_referente_ao_primeiro_ID(String ID) throws Throwable {
   driver.findElement(By.id("removeUser1")).click();
	
}

@Entao("^retorna para a tela de \"([^\"]*)\"$")
public void retorna_para_a_tela_de(String formulario) throws Throwable {
assertEquals(formulario, driver.findElement(By.cssSelector("div.h2")).getText());
}










}