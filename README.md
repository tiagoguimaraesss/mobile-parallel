# Automa��o de Teste Mobile em Paralelo com Appium

Projeto para automa��o de testes mobile com execu��o em paralelo utilizando a biblioteca de testes automatizados mobile Appium.

## Tecnologias Utilizadas

- [**Appium**](http://appium.io/), como biblioteca para automa��o de teste _mobile_ :white_check_mark:
- [**Java**](https://openjdk.java.net/), como linguagem de programa��o :coffee:
- [**Java-client**](https://github.com/appium/java-client), como biblioteca com implementa��o do _client_ para o **Appium** :coffee:
- [**Lombok**](https://projectlombok.org/), como biblioteca para trabalhar com POJO :wrench:  
- [**Maven**](https://maven.apache.org/), como gerenciador de depend�ncias :wrench:
- [**TestNG**](https://testng.org/doc/), como _framework_ de teste :white_check_mark:

| :exclamation:  A configura��o de cada biblioteca/ferramenta/_framework_ citada pode ser realizada seguindo os passos que se pede na p�gina oficial de cada uma.|
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|

| :memo:        | Para configura��o das vari�veis de ambiente, seguir os passos descritos conforme [**este artigo no Medium**](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26).       |
|---------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

## Configura��o do .xml do TestNG para Execu��o em Paralelo
Para que seja poss�vel identificar as capacidades de sess�o de automa��o que ir� executar os testes espec�ficados na su�te de testes do TestNG, � necess�rio informar por par�metro:

- `deviceName`: Nome do dispositivo
- `udid`: Identificador �nico do dispositivo
- `systemPort`: No caso de utiliza��o do UiAutomator2 � necess�rio informar uma porta de sistema diferente para cada sess�o de Android que deseja iniciar

| :warning: CUIDADO          |
|:---------------------------|
| Para _capability_ `systemPort`, quando portas iguais s�o utilizadas para mais de um dispositivo, em alguns momentos entra em conflito interrompendo a automa��o      |

```
<suite name="Suite Name" parallel="tests" thread-count="5">
   
   <test name="Teste de Login V�lido">
   		<parameter name="deviceName" value="Google Pixel 5X"/>
        <parameter name="udid" value="asdjio8924jkdsa"/>
        <parameter name="systemPort" value="8200"/>
        
        <classes>
			<class name="path-to-test-class" />
		</classes>
   </test>

</suite>

```

As demais a��es para realiza��o dos testes est�o dispon�veis nos fontes neste mesmo reposit�rio.

## Materiais de Apoio e _Links_ Importantes

- [**Apresenta��o no YouTube**](https://www.youtube.com/watch?v=03jCYtxBa10)
- [**Artigo sobre esta proposta de arquitetura**](https://medium.com/@tiagoguimaraesss/utilizando-appium-e-testng-como-alternativa-para-execu%C3%A7%C3%A3o-em-paralelo-de-testes-mobile-2ca99e505307)
- [**Artigo sobre config. das vari�veis de ambiente**](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26)
- [**Apresenta��o no SlideShare**](https://www.slideshare.net/TiagoGuimaresdaSilva/utilizando-appium-e-testng-como-alternativa-para-execuo-de-testes-mobile-em-paralelo)

Bom teste :blush: