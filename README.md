
# 🏫 Room Schedule - Gerenciamento de Salas e Horários de Aula

Este projeto é uma API REST desenvolvida com **Spring Boot**, **JPA**, **Flyway** e **PostgreSQL**, que permite gerenciar a alocação de salas, professores, disciplinas e horários em uma instituição de ensino.

---

## 📦 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Flyway (migrações de banco de dados)  
- Maven  

---

## ⚙️ Requisitos para rodar o projeto

- Java 17
- Maven 3.8+
- PostgreSQL 12 ou superior

---

## 🗃️ Configuração do Banco de Dados

Crie um banco de dados no PostgreSQL com o nome:

```
roomschedule
```

Em seguida, atualize as configurações no arquivo:

```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/roomschedule
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
```

> O Flyway será executado automaticamente ao iniciar a aplicação e criará todas as tabelas e dados necessários.

---

## ▶️ Executando a aplicação

1. Compile o projeto:
   ```bash
   ./mvnw clean install
   ```

2. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse:
   ```
   http://localhost:8080
   ```

---

## 🧪 Endpoints disponíveis


---

### ⏱️ Carga Horária de Professores

| Método | Endpoint           | Descrição                               |
|--------|--------------------|------------------------------------------|
| GET    | `/professor-hours` | Exibe a quantidade de horas por professor |

---

### 🗓️ Disponibilidade de Salas

| Método | Endpoint             | Descrição                               |
|--------|----------------------|------------------------------------------|
| GET    | `/room-availability` | Exibe os horários livres e ocupados de cada sala |

---

## 🧬 Sobre as Tabelas do BD

As tabelas são criadas automaticamente via Flyway com os scripts que estão na pasta:

```
src/main/resources/db/migration/
```

---

## 👨‍💻 Desenvolvido por

- Diogo Vinícius de Sousa Silva
- diogovss@gmail.com
- [http://www.github.com/diogovss](https://github.com/seu-usuario)
