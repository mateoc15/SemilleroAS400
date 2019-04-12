@tag
Feature: Buscar en google con datos desde el feature
  Arthur quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: Buscar en google
    Given arthur esta en el sitio de google
    When cuando el busca la frase "<palabra>" compuesta "<palabrados>"
    #Then I verify the <status> in step
    #entre comillas para manejar un string
    Then El verifica que la palabra "<resultadoesperado>" este en los resultado

    Examples: 
      | palabra | palabrados | resultadoesperado |
      | shopos  | uno        | shopos |
      | switch  | dos        | switch |
      | jgkjjj  | tres       | kmr |
