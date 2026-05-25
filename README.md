# Lilo Bakery

Proyecto Spring Boot con Arquitectura Hexagonal

Este proyecto es una API REST desarrollada con Java y Spring Boot utilizando el enfoque de Arquitectura Hexagonal (Ports & Adapters). 

El objetivo principal es mantener una separación clara entre la lógica de negocio, los casos de uso y la infraestructura, permitiendo que la aplicación sea más mantenible, escalable y fácil de probar.

---

# Tecnologías utilizadas

* Java 21
* Spring Boot 4
* Spring Web MVC
* Spring Data JPA
* H2 Database
* Lombok
* Swagger / OpenAPI
* Gradle

---

# Arquitectura Hexagonal

La aplicación está organizada en capas siguiendo el patrón hexagonal:

```text
src/main/java/etitc/proyecto
│
├── ProyectoApplication.java
│
├── domain
│   │
│   ├── model
│   │   ├── Customer
│   │   ├── Invoice
│   │   └── InvoiceDetail
│   │
│   ├── repository
│   │   ├── ICustomerRepository
│   │   └── IInvoiceRepository
│   │
│   └── exception
│       ├── CustomerNotFoundException
│       ├── InvoiceNotFoundException
│       └── InvalidInvoiceException
│
├── application
│   │
│   ├── create
│   │   ├── CustomerCreateUseCase
│   │   └── InvoiceCreateUseCase
│   │
│   ├── find
│   │   ├── CustomerFindUseCase
│   │   └── InvoiceFindUseCase
│   │
│   ├── update
│   │   ├── CustomerUpdateUseCase
│   │   └── InvoiceUpdateUseCase
│   │
│   └── delete
│       ├── CustomerDeleteUseCase
│       └── InvoiceDeleteUseCase
│
├── infrastructure
│   │
│   ├── in
│   │   ├── controllers
│   │   │   ├── CustomerController
│   │   │   └── InvoiceController
│   │   │
│   │   └── dto
│   │       ├── request
│   │       └── response
│   │
│   └── out
│       ├── entities
│       │   ├── CustomerEntity
│       │   ├── InvoiceEntity
│       │   └── InvoiceDetailEntity
│       │
│       ├── mapper
│       │   ├── CustomerMapper
│       │   ├── InvoiceMapper
│       │   └── InvoiceDetailMapper
│       │
│       └── persistence
│           ├── impl
│           │   ├── CustomerPersistenceImpl
│           │   └── InvoicePersistenceImpl
│           │
│           └── jpa
│               ├── CustomerJpaRepository
│               └── InvoiceJpaRepository
│
└── shared
    ├── config
    └── handler
```

---

# Capas:

## Domain (Dominio)

Contiene el núcleo de negocio de la aplicación.

### model (Modelo)

Define las entidades de dominio:

* `Beverages`
* `Desserts`
* `Invoices`
* `InvoiceDetail`

### repository (Repositorio)

Define las interfaces (puertos) que serán implementadas por la infraestructura.

Ejemplo:

```java
public interface IBeveragesRepository {
    List<Beverages> findAll();
}
```

### exception (Excepción)

Excepciones personalizadas del dominio.

---

## Application (Aplicación)

Contiene los casos de uso de la aplicación.

### create (Crear)

Casos de uso para creación de recursos.

Ejemplo:

* `BeveragesCreateUseCase`
* `DessertsCreateUseCase`
* `InvoiceCreateUseCase`

### find (Buscar)

Casos de uso para consultas.

Ejemplo:

* `BeveragesFindUseCase`
* `DessertsFindUseCase`
* `InvoiceFindUseCase`

Esta capa coordina la lógica de negocio utilizando los puertos definidos en `domain/repository`.

---

## Infrastructure (Infraestructura)

Contiene todo lo relacionado con frameworks y acceso externo.

### in/controllers (Controladores de entrada)

Controladores REST que exponen los endpoints.

### out/entities (Entidades de salida)

Entidades JPA utilizadas para persistencia.

### out/mapper (Mapeo de salidas)

Mapeadores entre entidades JPA y modelos de dominio.

### out/persistence (Persistencia de salida)

Implementaciones de los repositorios.

* `impl`: implementación de los puertos del dominio.
* `jpa`: repositorios JPA de Spring.

---

# Ejecución del proyecto

## 1. Clonar el repositorio

```bash
git clone https://github.com/edanv1401/hexagonal-architecture.git
cd proyecto
```

---

## 2. Ejecutar la aplicación

### Linux / Mac

```bash
./gradlew bootRun
```

### Windows

```bash
gradlew.bat bootRun
```

---

# Endpoints disponibles

## Beverages (Bebidas)

### Obtener todas las bebidas

```http
GET /beverages
```

### Obtener bebida por ID

```http
GET /beverages/{id}
```

### Crear bebida

```http
POST /beverages
```

Ejemplo:

```json
{
  "name": "Café Latte",
  "description": "Bebida caliente con leche",
  "price": 12.5
}
```

---

## Desserts (Postres)

### Obtener todos los postres

```http
GET /desserts
```

### Obtener postre por ID

```http
GET /desserts/{id}
```

### Crear postre

```http
POST /desserts
```

Ejemplo:

```json
{
  "name": "Cheesecake",
  "description": "Postre de queso",
  "price": 15.0
}
```

---
# Base de datos H2

La aplicación utiliza una base de datos en memoria H2.

Consola H2:

```text
http://localhost:8080/h2-console
```

---

# Dependencias principales

```gradle
implementation 'org.springframework.boot:spring-boot-starter-webmvc'
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:3.0.2'
runtimeOnly 'com.h2database:h2'
```

---
# Autores:

Edwin Villarraga

Lina Arroyo