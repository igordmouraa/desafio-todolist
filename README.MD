<h1 align="center">
  TODO List API 📝
</h1>

<p align="center">
  A simple API for managing tasks (CRUD) ⚡
</p>

## Tecnologias Utilizadas 🛠️

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Spring Boot** 🚀: Framework utilizado para facilitar o desenvolvimento de aplicações Java baseadas em microserviços. Ele configura automaticamente diversos componentes do Spring, permitindo maior produtividade.
- **Spring Data JPA** 💾: Facilita a integração com bancos de dados relacionais, oferecendo uma camada de abstração que simplifica o gerenciamento de dados através de JPA (Java Persistence API).
- **MySQL** 🗄️: Banco de dados relacional utilizado para armazenar as informações das tarefas.
- **Dotenv** 🌱: Biblioteca para carregar variáveis de ambiente de um arquivo `.env`, mantendo configurações sensíveis fora do código-fonte.

## Funcionalidade ✨

A API permite realizar operações CRUD (Create, Read, Update, Delete) sobre tarefas (Todos). O objetivo principal é gerenciar uma lista de tarefas, com as funcionalidades básicas de criação, listagem, atualização e remoção.

- **Criar tarefas** ➕: É possível adicionar novas tarefas à lista.
- **Listar tarefas** 📜: A API retorna todas as tarefas armazenadas no banco de dados.
- **Atualizar tarefas** ✏️: Você pode modificar os detalhes de uma tarefa existente.
- **Remover tarefas** 🗑️: Permite excluir uma tarefa específica.

Além disso, a API é documentada automaticamente através do **Swagger** 📚, permitindo visualização e teste das rotas diretamente no navegador.

## Estrutura do Projeto 📁

O projeto segue uma arquitetura simples e bem organizada, com as seguintes pastas principais:

- **Controller** 🖥️: Responsável pela gestão das requisições HTTP e pela comunicação com os serviços.
- **Service** ⚙️: Contém a lógica de negócios, realizando as operações de manipulação de dados.
- **Entity** 🔐: Representa os objetos de dados persistidos no banco de dados.
- **Repository** 🏗️: Interface que facilita a interação com o banco de dados, utilizando Spring Data JPA.
- **Exception** 🚨: Lida com exceções e erros de forma centralizada, retornando respostas adequadas para o cliente.

Essa estrutura ajuda a manter o código modular e fácil de entender, além de facilitar futuras manutenções e expansões da API.

