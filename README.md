# 🛒📦 Desafio OJO

### Arquitetura de Microservices com Spring Boot e Kotlin

## 📌 Visão Geral

Este projeto foi desenvolvido como solução para o **Desafio OJO** e implementa um **sistema de compras e entregas** baseado em **microservices**, utilizando **Spring Boot**, **Kotlin** e **MySQL**.

A proposta do sistema é demonstrar a comunicação entre serviços independentes, respeitando boas práticas de arquitetura, organização de código e responsabilidade bem definida entre os domínios.

---

## 🧩 Descrição da Arquitetura

O sistema é composto por **dois microservices independentes**:

### 🛍️ Compras Service

Responsável por:

* Gerenciamento de **pedidos de compra**
* Cadastro de **clientes**
* Cadastro de **produtos**

### 🚚 Entregas Service

Responsável por:

* Gerenciamento das **ordens de entrega**
* Controle dos **endereços de entrega** relacionados aos pedidos

---

## 🔗 Comunicação entre os Microservices

A comunicação entre os serviços é feita por meio de **chamadas REST**.

Fluxo principal:

1. Um pedido é criado no **Compras Service**
2. Após a criação do pedido, uma **ordem de entrega correspondente** é automaticamente criada no **Entregas Service**
3. Cada microservice mantém seu próprio banco de dados, garantindo **baixo acoplamento**

---

## 🧰 Tecnologias Utilizadas

* **Spring Boot**
* **Kotlin**
* **REST APIs**
* **MySQL**
* **Arquitetura de Microservices**

---

## 🗂 Estrutura do Projeto

```
.
├── compras-service
│   └── Microservice responsável pelas compras
│
├── entregas-service
│   └── Microservice responsável pelas entregas
│
└── database-scripts
    └── Scripts SQL para criação das tabelas
       nos bancos de dados de Compras e Entregas
```

---

## ✅ Observações

* Cada microservice possui **banco de dados próprio**
* A separação de responsabilidades segue princípios de **Domain-Driven Design**
* Comunicação síncrona via REST para simplicidade e clareza do fluxo
