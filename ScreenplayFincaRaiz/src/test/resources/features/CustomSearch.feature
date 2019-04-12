@SmokeTest2
Feature: Look for an apartment
  Mateo wants to search an apartment with the specific conditions

  @customsearch
  Scenario Outline: Custom search
    Given User is in the fincaraiz home page
    When He selects the search options
      | tipo   | categoria   | transaccion   | ubicacion   |
      | <tipo> | <categoria> | <transaccion> | <ubicacion> |
    Then He must see that the search return results

    Examples: 
      | tipo     | categoria | transaccion | ubicacion |
      | Vivienda | Casa      | Arriendo    | Medellin  |
      | Vivienda | Finca     | Venta       | usin      |
