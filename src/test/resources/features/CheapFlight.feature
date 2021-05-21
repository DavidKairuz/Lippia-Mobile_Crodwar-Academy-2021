Feature: buscar un vuelvo

  @Challenge
  Scenario Outline: busco un vuelo disponible en la app cheaptickets
    Given el usuario se encuentra en el home de la app cheaptickets
    When selecciono la opcion Flights
    And selecciono el from '<origin>' , to '<destino>', fecha de ida '<ida>' regreso '<back>',cantidad de adultos'<adults>',chicos'<child>' y tipo servicio '<type>'
    And clickeo en el boton search
    And selecciono un elemento de la lista
    Then compruebo la reserva de ese vuelo
    Examples:
      | origin    | destino | ida | back | adults | child | type |
      | Argentina | Brasil  | 23  | 29   | 1      | 1     | 2    |