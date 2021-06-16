Feature: HU-001 Buscador Haceb

  Scenario:busco el producto en el buscador Haceb fallido
    Given me encuentro en la pagina de Haceb con la url https://www.haceb.com/
    When busco el producto en el buscador
      | nombreProducto                          |
      | Tuercas |
    Then puedo validar el producto buscado en pantalla

  Scenario:Buscar un producto en el buscador exitoso
    Given me encuentro en la pagina de Haceb con la url https://www.haceb.com/
    When busco el producto en el buscador
      | nombreProducto                         |
      | Minibar 87 Haceb - 90 Litros - Titanio |
    Then puedo validar el producto buscado en pantalla

