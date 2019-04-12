@tag
Feature: Look for an apartment
  I want to search an apartment with the specific conditions

  @tag2
  Scenario Outline: Custom search
    Given He is in the fincaraiz home page
    When He select the search options
      | tipo   | categoria   | transaccion   | ubicacion   |
      | <tipo> | <categoria> | <transaccion> | <ubicacion> |
    Then He must see that the results match with his search

    Examples: 
      | tipo     | categoria | transaccion | ubicacion |
      | Vivienda | Casa      | Arriendo    | Medell�n  |
