# Enunciado

Una empresa de gestión logística terrestre que administra el transporte en camiones, al ser bastante exitosa, ha recibido en los últimos meses peticiones de empresas de transporte marítimo para agregar la logística marítima a sus servicios.

Por ello, la empresa lo ha contratado a usted para que inicie con el desarrollo de una nueva aplicación con las funcionalidades de logística terrestre y logística marítima.

## Requerimientos del sistema

### Funcionalidades básicas
El sistema debe:
- Registrar los datos básicos del cliente.
- Registrar los tipos de productos que transporta, tanto para logística terrestre como para logística marítima.
- Registrar las bodegas de almacenamiento terrestre y puertos marítimos disponibles, a nivel nacional e internacional.

### Logística terrestre
El plan de entrega debe incluir los siguientes datos:
1. Tipo de producto.
2. Cantidad del producto.
3. Fecha de registro.
4. Fecha de entrega.
5. Bodega de entrega.
6. Precio de envío.
7. Placa del vehículo (formato: 3 letras iniciales y 3 números finales).
8. Número de guía (número único alfanumérico de 10 dígitos).

### Logística marítima
El plan de entrega debe incluir los siguientes datos:
1. Tipo de producto.
2. Cantidad del producto.
3. Fecha de registro.
4. Fecha de entrega.
5. Puerto de entrega.
6. Precio de envío.
7. Número de flota (formato: 3 letras iniciales, 4 números y 1 letra al final).
8. Número de guía (número único alfanumérico de 10 dígitos).

### Relación cliente-envío
Cada envío debe estar relacionado con un cliente para permitir un seguimiento adecuado del servicio.

### Descuentos
- Si la cantidad de productos es superior a 10 unidades:
  - Logística terrestre: 5% de descuento en el precio de envío.
  - Logística marítima: 3% de descuento en el precio de envío.
- Registrar el precio normal y el descuento otorgado.

## Desarrollo del sistema
Deberá desarrollar una API RESTful con las siguientes características:
1. CRUD para logística terrestre y logística marítima.
2. Sistema de filtros para consultar los datos.

### Seguridad
- Implementar la seguridad de los servicios mediante tokens del tipo **Bearer** (validar únicamente el token).

### Validación
- Validar los campos de la API RESTful.
- En caso de errores, retornar códigos HTTP apropiados:
  - 401, 422, 400, 500.

### Persistencia de datos
Seleccione uno de los siguientes motores de base de datos para almacenar los datos:
1. MySQL
2. SQL Server
3. PostgreSQL
4. MongoDB

### Pruebas unitarias
Crear pruebas para garantizar la calidad del código desarrollado.

## Bonus (Opcional)
Estas funcionalidades no son requeridas pero ayudarán a evaluar el nivel de seniority:
1. Despliegue en un servidor público, especificando cómo acceder.
2. Separar el desarrollo en backend y frontend.
3. Documentación de la API RESTful.
4. Funcionalidad de registro y autenticación de usuarios.
5. Funcionalidad de autorización de acceso a las funcionalidades.
6. Navegación básica entre funcionalidades y landing page (por ejemplo, "Volver", "Inicio").
7. Estructurar el repositorio con el estándar **GIT-FLOW**.

## Entregables
1. Diagrama E-R del modelo de datos (utilizar una herramienta de diagramación; no se aceptan fotos o scans de diagramas hechos a mano).
2. Script de base de datos.
3. URL del repositorio GIT.
4. Artefactos de despliegue.
5. Definición de buenas prácticas.
6. Justificación de las tecnologías y patrones de diseño empleados.
