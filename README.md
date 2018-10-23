<h1><b>PROJETO AUTOMA��O DE TESTE MOBILE EM PARALELO COM APPIUM</b></h1>

Projeto para automa��o de testes mobile com execu��o em paralelo utilizando a biblioteca de testes automatizados mobile Appium.

<h2><b>FRAMEWORKS E BIBLIOTECAS UTILIZADAS</b></h2>

<b>TestNG</b> http://testng.org/doc/

<b>Appium server</b> http://appium.io/

<b>java-client</b> https://github.com/appium/java-client

<b>Genymotion vers�o free for personal use</b> https://www.genymotion.com/fun-zone/

<b>Gerenciador de depend�ncias Maven</b> https://maven.apache.org/

A configura��o de cada ferramenta citada, pode ser realizada seguindo os passos que se pede na p�gina oficial de cada uma.

<h2><b>CONFIGURA��O DO XML DO TESTNG PARA EXECU��O DE TESTES EM PARALELO</b></h2>

Para que seja poss�vel identificar as capacidades do dispositivo que ir� executar os testes espec�ficados nas su�tes de testes do TestNG, � necess�rio passar por par�metro:
	- udid: Identificador �nico do dispositivo
	- platformVersion: Vers�o do sistema operacional do dispositivo
	- systemPort: No caso de utiliza��o do uiautomator2, � necess�rio informar uma porta de sistema diferente para cada sess�o de Android que deseja iniciar, quando diferentes portas n�o s�o utilizadas, em alguns momentos entra em conflito interrompendo a automa��o
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

As demais a��es para realiza��o dos testes, est�o dispon�veis no c�digo neste mesmo reposit�rio.

Bom teste ;)