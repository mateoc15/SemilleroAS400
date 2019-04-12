@SmokeTest
Feature: Select a result
  Mateo wants to select  result of my custom search

  Background: 
    Given User is in the fincaraiz home page
    When He selects the search options
      | tipo     | categoria | transaccion | ubicacion |
      | Vivienda | Casa      | Arriendo    | Medellin  |

    Then He must see that the search return results

  @selectresult
  Scenario Outline: Select a result
    Given User is in the page result of the search
    When He clicks on a random result
    Then He checks the result matches with the search
      | tipo   | categoria   | transaccion   | ubicacion   |
      | <tipo> | <categoria> | <transaccion> | <ubicacion> |

    Examples: 
      | tipo     | categoria | transaccion | ubicacion |
      | Vivienda | Casa      | Arriendo    | Medellin  |
      | Vivienda | Casa      | Arriendo    | Bogota  |

      
