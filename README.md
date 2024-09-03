Gestão Saúde Mental

Descrição

Este projeto é uma aplicação que visa ajudar os usuários a melhorar seu bem-estar mental. Ele permite que os usuários registrem diariamente seu estado emocional, e a aplicação sugere ações e fornece informações úteis com base nesse estado. Além disso, os usuários podem acompanhar seu histórico emocional ao longo do tempo para monitorar sua evolução.

Funcionalidades Atuais

Cadastro de usuários
Registro diário do estado emocional do usuário
Atualização das informações pessoais do usuário
Exclusão lógica de usuários

Funcionalidades Focadas no Usuário
Histórico Emocional Pessoal: Exibição do histórico emocional do usuário, permitindo a visualização da evolução ao longo do tempo.
Sugestões Personalizadas: A cada registro de estado emocional, o sistema sugere ações e conteúdos relevantes para o bem-estar do usuário.
Página de Perfil: Uma interface onde o usuário pode visualizar suas informações pessoais, histórico emocional, e receber sugestões diárias.

Tecnologias Utilizadas

Java 17
Spring Boot 3.3.2
JPA/Hibernate
MySQL (gerenciado com Flyway)
Maven para gerenciamento de dependências

Endpoints da API

POST /usuarios: Cadastra um novo usuário.
POST /usuarios/estado-emocional: Registra o estado emocional do usuário para o dia atual.
GET /usuarios/perfil: Exibe as informações do perfil do usuário, incluindo o histórico emocional.
PUT /usuarios: Atualiza as informações pessoais de um usuário existente.
DELETE /usuarios/{id}: Exclui logicamente um usuário.

Ajustes e Melhorias

 Implementar a lógica para sugerir ações com base no estado emocional.
 Integrar com APIs externas para enriquecer as sugestões.
 Desenvolver uma interface de usuário para facilitar a interação.
 Adicionar autenticação e autorização.
 Criar testes unitários e de integração.
 Configurar Docker para facilitar o deploy.

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.


