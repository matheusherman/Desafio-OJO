# DESAFIO OJO

Este projeto implementa um sistema de compras e entregas baseado em microservices, utilizando as tecnologias Spring Boot, Kotlin e MySQL.

## Descrição

O sistema é composto por dois microservices: Compras e Entregas. 
- O microservice de Compras é responsável por gerenciar os pedidos de compra, clientes e produtos. 
- O microservice de Entregas é responsável por gerenciar as ordens de entrega e endereços de entrega dos pedidos.

Os microservices se comunicam entre si por meio de chamadas REST. 
Quando um pedido é inserido no microservice de Compras, uma ordem de entrega correspondente é criada no microservice de Entregas.

## Tecnologias Utilizadas

- Spring Boot
- REST
- Kotlin
- MySQL

## Estrutura do Projeto

O projeto está dividido nos seguintes diretórios:

- `compras-service`: Microservice de Compras.
- `entregas-service`: Microservice de Entregas.
- `database-scripts`: Scripts SQL para criação das tabelas nos bancos de dados de Compras e Entregas.

