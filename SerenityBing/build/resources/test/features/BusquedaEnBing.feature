
@tag
Feature: Buscar en Bing con datos desde el feature
  Mateo quiere realizar una busqueda en Bing con datos

  @tag2
  Scenario Outline: Buscar en Bing
    Given Mateo esta en el sitio web Bing
    When Busca la frase compuesta por "<valor1>" y "<valor2>" 
    Then Verifica que la palabra "<resultadoesperado>" este en la lista de resultados

    Examples: 
      | valor1   | valor2    | resultadoesperado |
      | selenium |  cucumber | seleniumcucumber  |
      | vsvsd    |     dvs   | vsvsddvs          |
      | hola			|s					| knj|
