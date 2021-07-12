# Automação de Teste Mobile em Paralelo com Appium

Projeto para automação de testes mobile com execução em paralelo utilizando a biblioteca de testes automatizados mobile Appium.

## Tecnologias Utilizadas

- [**Appium**](http://appium.io/), como biblioteca para automação de teste _mobile_ :white_check_mark:
- [**Java**](https://openjdk.java.net/), como linguagem de programação :coffee:
- [**Java-client**](https://github.com/appium/java-client), como biblioteca com implementação do _client_ para o **Appium** :coffee:
- [**Lombok**](https://projectlombok.org/), como biblioteca para trabalhar com POJO :wrench:  
- [**Maven**](https://maven.apache.org/), como gerenciador de dependências :wrench:
- [**TestNG**](https://testng.org/doc/), como _framework_ de teste :white_check_mark:

| :exclamation:  A configuração de cada biblioteca/ferramenta/_framework_ citada pode ser realizada seguindo os passos que se pede na página oficial de cada uma.|
|----------------------------------------------------------------------------------------------------------------------------------------------------------------|

| :memo:        | Para configuração das variáveis de ambiente, seguir os passos descritos conforme [**este artigo no Medium**](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26).       |
|---------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

## Configuração do .xml do TestNG para Execução em Paralelo
Para que seja possível identificar as capacidades de sessão de automação que irá executar os testes específicados na suíte de testes do TestNG, é necessário informar por parâmetro:

- `deviceName`: Nome do dispositivo
- `udid`: Identificador único do dispositivo
- `systemPort`: No caso de utilização do UiAutomator2 é necessário informar uma porta de sistema diferente para cada sessão de Android que deseja iniciar

| :warning: CUIDADO          |
|:---------------------------|
| Para _capability_ `systemPort`, quando portas iguais são utilizadas para mais de um dispositivo, em alguns momentos entra em conflito interrompendo a automação      |

```
<suite name="Suite Name" parallel="tests" thread-count="5">
   
   <test name="Teste de Login Válido">
   		<parameter name="deviceName" value="Google Pixel 5X"/>
        <parameter name="udid" value="asdjio8924jkdsa"/>
        <parameter name="systemPort" value="8200"/>
        
        <classes>
			<class name="path-to-test-class" />
		</classes>
   </test>

</suite>

```

As demais ações para realização dos testes estão disponíveis nos fontes neste mesmo repositório.

## Materiais de Apoio e _Links_ Importantes

- [**Apresentação no YouTube**](https://www.youtube.com/watch?v=03jCYtxBa10)
- [**Artigo sobre esta proposta de arquitetura**](https://medium.com/@tiagoguimaraesss/utilizando-appium-e-testng-como-alternativa-para-execu%C3%A7%C3%A3o-em-paralelo-de-testes-mobile-2ca99e505307)
- [**Artigo sobre config. das variáveis de ambiente**](https://medium.com/beelabsolutions/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26)
- [**Apresentação no SlideShare**](https://www.slideshare.net/TiagoGuimaresdaSilva/utilizando-appium-e-testng-como-alternativa-para-execuo-de-testes-mobile-em-paralelo)

Bom teste :blush: