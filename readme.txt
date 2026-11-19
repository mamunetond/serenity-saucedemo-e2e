================================================================================
PROYECTO: Automatización E2E - Flujo de Compra en SauceDemo (Serenity BDD)
================================================================================

1. DESCRIPCIÓN
   Automatización de prueba funcional de extremo a extremo (E2E) sobre el portal
   https://www.saucedemo.com/ implementada con Serenity BDD (patrón Screenplay),
   Cucumber (Gherkin en español) y JUnit 5.

   Flujo automatizado:
   - Autenticación con el usuario "standard_user" y contraseña "secret_sauce".
   - Selección y adición de dos productos al carrito de compras.
   - Visualización del detalle del carrito.
   - Diligenciamiento del formulario de datos de envío (Checkout).
   - Finalización de la orden y validación del mensaje "THANK YOU FOR YOUR ORDER".

2. PRERREQUISITOS DEL ENTORNO
   - Java JDK 17 o superior configurado en la variable de entorno JAVA_HOME.
   - Apache Maven 3.8 o superior configurado en la variable PATH.
   - Navegador Google Chrome instalado y actualizado.
   - Conexión a internet para la resolución de dependencias Maven y acceso al sitio.

3. ESTRUCTURA DEL REPOSITORIO
   serenity-saucedemo-e2e/
   ├── pom.xml                                              # Dependencias y plugins Maven
   ├── readme.txt                                           # Guía de instalación y ejecución
   ├── conclusiones.txt                                     # Hallazgos técnicos y conclusiones
   ├── src/test/resources/
   │   ├── serenity.conf                                    # Configuración WebDriver y Serenity
   │   └── features/compra_saucedemo.feature                # Escenario funcional en Gherkin
   ├── src/test/java/com/saucedemo/
   │   ├── ui/                                              # Localizadores (Targets) por página
   │   ├── tasks/                                           # Acciones de negocio (Screenplay)
   │   ├── questions/                                       # Consultas sobre el estado de la UI
   │   ├── stepdefinitions/                                 # Vinculación de pasos Cucumber
   │   └── runners/                                         # Ejecutor JUnit 5 Platform Suite
   └── target/site/serenity/index.html                      # Reporte HTML con evidencias

4. INSTRUCCIONES DE EJECUCIÓN PASO A PASO
   Paso 1: Clonar el repositorio público en su equipo local:
           git clone https://github.com/mamunetond/serenity-saucedemo-e2e.git

   Paso 2: Ingresar al directorio raíz del proyecto:
           cd serenity-saucedemo-e2e

   Paso 3: Ejecutar la suite de pruebas y generar el reporte agregado de Serenity BDD:
           mvn clean verify

   Paso 4: Visualizar el reporte de ejecución y capturas de pantalla paso a paso:
           Abrir en cualquier navegador web el archivo:
           target/site/serenity/index.html