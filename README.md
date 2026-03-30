# estoque-api

API REST para gerenciamento de estoque, desenvolvida em Java com Spring Boot. O projeto nasceu como parte de um sistema maior de controle de produtos, e essa versão expõe os dados via HTTP para ser consumida por qualquer frontend ou cliente.

## Tecnologias

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- SQLite
- Maven

## Como rodar

Clone o repositório e execute na raiz do projeto:

```bash
mvn spring-boot:run
```

A aplicação sobe na porta `8080` por padrão.

## Endpoints

**Listar todos os produtos**
```
GET /produtos
```

**Buscar produto por ID**
```
GET /produtos/{id}
```

**Adicionar produto**
```
POST /produtos
Content-Type: application/json

{
  "nome": "Arroz",
  "quantidade": 10,
  "preco": 5.99
}
```

**Remover produto**
```
DELETE /produtos/{id}
```

## Estrutura do projeto

```
src/
└── main/
    ├── java/com/estoque/estoque_api/
    │   ├── controller/   # recebe e responde as requisições HTTP
    │   ├── model/        # entidade Produto mapeada com JPA
    │   └── repository/   # interface que o Spring implementa automaticamente
    └── resources/
        └── application.properties
```

## Sobre

Projeto desenvolvido para aprender na prática os conceitos de API REST, persistência com JPA e estruturação de um backend Java. O banco de dados é gerado automaticamente na primeira execução.