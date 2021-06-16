Feature: HU-001 Buscador Haceb
  Yo como usuario de Haceb
  Quiero usar el buscador
  Para ver los productos que manejan

  Scenario Outline: <Escenario> <Producto>
    Given me encuentro en la pagina de Haceb con la url <Url>
    When busco el producto <Producto> en el buscador
    Then podre ver el producto <Producto> en la pantalla

    Examples:
      | Escenario                               | Producto                                                        | Url                    |
      | Buscar el producto en el buscador Haceb | Lavadora Digital Atlas 18 kg OX Haceb Grafito                   | https://www.haceb.com/ |
      | Buscar el producto en el buscador Haceb | Minibar 87 Haceb - 90 Litros - Titanio                          | https://www.haceb.com/ |
      | Buscar el producto en el buscador Haceb | Freidora de Aire sin Aceite Haceb Negra                         | https://www.haceb.com/ |
      | Buscar el producto en el buscador Haceb | Nevera Bottom Mount Ottawa 514 Lts Haceb - Panel Digital - Inox | https://www.haceb.com/ |
      | Buscar el producto en el buscador Haceb | Nevera Siberia 294 Litros Haceb - Manija Integrada - Titanio    | https://www.haceb.com/ |