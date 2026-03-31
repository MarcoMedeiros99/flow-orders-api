# Flow Orders API

API REST desenvolvida para o gerenciamento completo de pedidos, simulando o ecossistema de backend de sistemas de e-commerce e ERPs. O projeto foca em padrões de design robustos e uma arquitetura escalável para aplicações Java.

## Tecnologias e Ferramentas

* Linguagem: Java 17
* Framework: Spring Boot 3
* Persistência: Spring Data JPA / Hibernate
* Banco de Dados: H2 (Desenvolvimento)
* Gerenciador de Dependências: Maven
* Ferramentas de Teste: Postman / Insomnia

## Arquitetura e Organização

O projeto utiliza o padrão de Arquitetura em Camadas para garantir a separação de responsabilidades e facilitar a manutenção do código:

* Controllers: Camada de exposição dos endpoints e manipulação de requisições HTTP.
* Services: Implementação das regras de negócio e validações do sistema.
* Repositories: Interface de comunicação com o banco de dados via JPA.
* Entities: Representação do modelo de domínio e mapeamento objeto-relacional.
* DTOs: Objetos de transferência de dados para maior segurança e performance nas respostas da API.

## Endpoints da API

| Método | Endpoint | Descrição |
| --- | --- | --- |
| GET | /orders | Retorna a lista de pedidos com paginação |
| GET | /orders/{id} | Retorna os detalhes de um pedido específico |
| POST | /orders | Registra um novo pedido no sistema |
| PUT | /orders/{id} | Atualiza informações de um pedido existente |
| DELETE | /orders/{id} | Remove um pedido da base de dados |

## Modelo de Dados (Exemplo JSON)

```json
{
  "id": 1,
  "data": "2026-03-31T13:00:00Z",
  "status": "WAITING_PAYMENT",
  "client": {
    "name": "Marco Medeiros",
    "email": "marco@email.com"
  },
  "total": 250.00
}
```
# Como Executar o Projeto
Clone o repositório:
git clone https://github.com/MarcoMedeiros99/flow-orders-api.git

Acesse a pasta do projeto:
cd flow-orders-api

Execute a aplicação via Maven:
./mvnw spring-boot:run

A API estará disponível para testes em: http://localhost:8080

Autor
## Desenvolvido por Marco Medeiros.