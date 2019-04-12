#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Buscar en google con datos desde el feature
  Arthur quiere hacer una busqueda en google con datos

  @tag2
  Scenario Outline: Buscaar en google
    Given arthur esta en el sitio de google
    When cuando el busca la frase "<palabra>" compuesta "<palabrados>"
    #Then I verify the <status> in step
    #entre comillas para manejar un string
    Then El verifica que la palabra "<palabra>" este en los resultado

    Examples: 
      | palabra | palabrados |
      | shopos  | uno        |
      | switch  | dos        |
      | jgkjjj  | tres       |
