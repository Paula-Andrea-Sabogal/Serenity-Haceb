Feature: HU-001 Buscador Haceb

  Background:
    Given me encuentro en la pagina de Haceb con la url https://www.haceb.com/

  Scenario:Buscar un producto en el buscador
    When busco un producto en el buscador
      | nombreProducto                          |
      | Freidora de Aire sin Aceite Haceb Negra |
    Then podre ver el producto buscado en pantalla

  Scenario:Buscar un producto en el buscador
    When busco un producto en el buscador
      | nombreProducto                         |
      | Minibar 87 Haceb - 90 Litros - Titanio |
    Then podre ver el producto buscado en pantalla