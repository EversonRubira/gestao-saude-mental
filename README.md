# Gestão Saúde Mental

## Descrição

Este projeto é uma aplicação que visa ajudar os usuários a melhorar seu bem-estar mental. Ele permite que os usuários registrem seu estado emocional, e a aplicação sugere ações e fornece informações úteis com base nesse estado.

## Funcionalidades Atuais

- Cadastro de usuários
- Listagem de usuários ativos
- Atualização das informações dos usuários
- Exclusão lógica de usuários

## Funcionalidades Futuras

- Sugestão de ações baseadas no estado emocional informado pelo usuário
- Exibição de conteúdos informativos relacionados ao estado emocional do usuário
- Integração com APIs externas para sugestões mais detalhadas (ex: artigos, vídeos, etc.)

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.2**
- **JPA/Hibernate**
- **MySQL** (gerenciado com Flyway)
- **Maven** para gerenciamento de dependências

## Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior instalado
- Maven instalado
- Banco de dados MySQL configurado

### Passos para Execução

1. Clone o repositório:
    ```bash
    git clone https://github.com/EversonRubira/gestao-saude-mental.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd gestao-saude-mental
    ```
3. Configure o banco de dados no arquivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```
4. Execute as migrations para criar a estrutura do banco:
    ```bash
    ./mvnw flyway:migrate
    ```
5. Compile e execute o projeto usando Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
6. Acesse a aplicação em `http://localhost:8080`.

## Endpoints da API

- **POST /usuarios**: Cadastra um novo usuário.
- **GET /usuarios**: Lista todos os usuários ativos.
- **PUT /usuarios**: Atualiza as informações de um usuário existente.
- **DELETE /usuarios/{id}**: Exclui logicamente um usuário.

## Ajustes e Melhorias

- [ ] Implementar a lógica para sugerir ações com base no estado emocional.
- [ ] Integrar com APIs externas para enriquecer as sugestões.
- [ ] Desenvolver uma interface de usuário para facilitar a interação.
- [ ] Adicionar autenticação e autorização.
- [ ] Criar testes unitários e de integração.
- [ ] Configurar Docker para facilitar o deploy.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
