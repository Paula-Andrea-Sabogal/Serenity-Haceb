Feature: Title of your feature

  Scenario Outline: <Escenario>
    Given me encuentro en la pagina de Haceb con la url <Url>
    When busco un producto aleatorio en la pagina
    Then podre ver un producto aleatorio en pantalla

    Examples:
      | Escenario                                   | Url                    |
      | Buscar un producto aleatorio en OLX exitoso | https://www.haceb.com/ |
