#language: es
Característica: agregar producto al carrito de compras

  Escenario: agregar producto exitoso
    Dado que el usuario se encuentre en la pagina principal de ebay
    Cuando ingrese sus credenciales
    Y el usuario seleccione un producto de una categoria para agregarlo al carrito de compras
    Y el usuario ingresa el producto a buscar para agregarlo al carrito de compras
    Entonces el usuario visualiza los productos seleccionados en el carrito de compras