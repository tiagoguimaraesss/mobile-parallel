<h1><b>PROJETO AUTOMAÇÃO DE TESTE MOBILE EM PARALELO COM APPIUM</b></h1>

Projeto para automação de testes mobile com execução em paralelo utilizando a biblioteca de testes automatizados mobile Appium.

<h2><b>FRAMEWORKS E BIBLIOTECAS UTILIZADAS</b></h2>

<b>TestNG</b> http://testng.org/doc/

<b>Appium server</b> http://appium.io/

<b>java-client</b> https://github.com/appium/java-client

<b>Genymotion versão free for personal use</b> https://www.genymotion.com/fun-zone/

<b>Gerenciador de dependências Maven</b> https://maven.apache.org/

A configuração de cada ferramenta citada, pode ser realizada seguindo os passos que se pede na página oficial de cada uma.

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

Bom teste ;)