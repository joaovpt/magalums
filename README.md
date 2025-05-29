<h1 align="center">
  Magalu
</h1>

API RESTful. Este projeto serve como base para estudos e práticas de desenvolvimento backend utilizando Java e Spring Boot.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [PostgreSQL](https://www.postgresql.org/download/)

## Práticas adotadas

- API REST
- Arquitetura em camadas
- Consultas com Spring Data JPA
- Gerenciamento de dependências com Maven
- Containerização com Docker

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação com Docker Compose:
```
$ docker-compose up
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/):

- Criar um Notificação
```
POST - localhost:8080/notifications

{
    "dateTime": "2025-05-14T16:13:00",
    "destination": "teste@teste.tech",
    "message": "Seja bem vindo!",
    "channel": "EMAIL"
}
```

- Listar Notificação pelo ID
```
GET - localhost:8080/notifications/2

{
    "notificationId": 2,
    "dateTime": "2025-05-14T16:13:00",
    "destination": "teste@teste.tech",
    "message": "Seja bem vindo!",
    "channel": {
        "channelId": 1,
        "description": "email"
    },
    "status": {
        "statusId": 2,
        "description": "success"
    }
}
```

- Cancelar uma Notificação
```
DELETE - localhost:8080/notifications/1

[
    {
        "id": 1,
        "name": "Aventura e RPG"
    },
    {
        "id": 2,
        "name": "Jogos de plataforma"
    }
]
```
