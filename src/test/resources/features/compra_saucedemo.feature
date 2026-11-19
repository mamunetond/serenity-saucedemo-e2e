# language: es
Característica: Flujo de compra E2E en SauceDemo
  Como usuario registrado de SauceDemo
  Quiero agregar dos productos al carrito y completar el proceso de checkout
  Para confirmar que mi orden fue procesada exitosamente

  Escenario: Compra exitosa de dos productos con usuario estándar
    Dado que el usuario navega a la página de inicio de SauceDemo
    Cuando inicia sesión con el usuario "standard_user" y contraseña "secret_sauce"
    Y agrega dos productos al carrito y visualiza el detalle del carrito
    Y completa el formulario de compra con nombre "Carlos", apellido "Pérez" y código postal "055422"
    Entonces debería visualizar el mensaje de confirmación "THANK YOU FOR YOUR ORDER"