# 🚀 Projeto Solr com Spring Boot
Este projeto é uma API REST desenvolvida com **Spring Boot** e **Apache Solr** para armazenar e buscar informações sobre personagens de animes.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Apache Solr**
- **Maven**

## 📌 Funcionalidades

- Criar personagens.
- Listar todos os personagens cadastrados.
- Atualizar informações de um personagem.
- Remover personagens do banco de dados.

## 🛠️ Como Configurar o Projeto

### 1️⃣ **Pré-requisitos**
Antes de rodar o projeto, certifique-se de ter instalado:
- **Java 17+**
- **Maven**
- **Apache Solr**

### 2️⃣ **Configurar o Solr**
1. Baixe e instale o **Apache Solr**: [Download Solr](https://www.apache.org/dyn/closer.lua/solr/solr/9.7.0/solr-9.7.0.tgz?action=download)
2. Descompacte o arquivo para uma pasta de sua preferência
3. Na pasta em que você descompactou os arquivos, há uma pasta chamada "bin". Acesse-a pelo terminal.
4. Inicie o Solr:
   ```sh
   solr start
   ```
5. Crie um core chamado characters:
  ```sh
  solr create -c characters
  ```
6. Verifique se o Solr está rodando acessando:
  ```sh
   http://localhost:8983/solr
  ``` 
7. Agora você está pronto para executar este projeto.

### 3️⃣ **Executar o Projeto**
1. Execute o seguinte comando para iniciar a aplicação:
  ```sh
  mvn spring-boot:run
  ```
2. Depois que executar, acesse o projeto na seguinte url:
  ```sh
  http://localhost:8080/swagger-ui.html
  ``` 
