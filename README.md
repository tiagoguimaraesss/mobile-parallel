<h1><b>PROJETO AUTOMAÇÃO DE TESTE MOBILE EM PARALELO COM APPIUM</b></h1>

Projeto para automação de testes mobile com execução em paralelo utilizando a biblioteca de testes automatizados mobile Appium.

<h2><b>FRAMEWORKS E BIBLIOTECAS UTILIZADAS</b></h2>

<b>TestNG</b> http://testng.org/doc/

<b>Appium server</b> http://appium.io/

<b>java-client</b> https://github.com/appium/java-client

<b>Genymotion versão free for personal use</b> https://www.genymotion.com/fun-zone/

<b>Gerenciador de dependências Maven</b> https://maven.apache.org/

A configuração de cada ferramenta citada, pode ser realizada seguindo os passos que se pede na página oficial de cada.

Para configuração das variáveis de ambiente, seguir os passos descritos conforme [este artigo no Medium](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26).

<h2><b>CONFIGURAÇÃO DO XML DO TESTNG PARA EXECUÇÃO DE TESTES EM PARALELO</b></h2>

Para que seja possível identificar as capacidades do dispositivo que irá executar os testes específicados nas suítes de testes do TestNG, é necessário passar por parâmetro:
	- udid: Identificador único do dispositivo
	- platformVersion: Versão do sistema operacional do dispositivo
	- systemPort: No caso de utilização do uiautomator2, é necessário informar uma porta de sistema diferente para cada sessão de Android que deseja iniciar, quando diferentes portas não são utilizadas, em alguns momentos entra em conflito interrompendo a automação
	- deviceName: Nome do dispositivo

```
<suite name="Suite Name" parallel="tests" thread-count="N">
   
   <test name="Execution name">
        <parameter name="udid" value="udid number"/>
        <parameter name="platformVersion" value="SO version"/>
        <parameter name="systemPort" value="8200"/>
        <parameter name="deviceName" value="Device name"/>
        <classes>
			<class name="Test class path" />
		</classes>
   </test>

</suite>

```

As demais ações para realização dos testes, estão disponíveis no código neste mesmo repositório.

Materiais de apoio e _links_ importantes:

- [Apresentação no YouTube](https://www.youtube.com/watch?v=03jCYtxBa10)

- [Artigo sobre está opção de arquitetura](https://medium.com/@tiagoguimaraesss/utilizando-appium-e-testng-como-alternativa-para-execu%C3%A7%C3%A3o-em-paralelo-de-testes-mobile-2ca99e505307)

- [Artigo sobre config. das variáveis de ambiente](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26)

- [Apresentação no SlideShare](https://www.slideshare.net/TiagoGuimaresdaSilva/utilizando-appium-e-testng-como-alternativa-para-execuo-de-testes-mobile-em-paralelo)

Bom teste ;)