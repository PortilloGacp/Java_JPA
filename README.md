# Sistema de Cadastro de Pessoas (Java/JPA com Oracle)

Este projeto é um sistema de cadastro desenvolvido em Java, utilizando as especificações da Java Persistence API (JPA) para interação com o banco de dados Oracle. A ferramenta de desenvolvimento utilizada foi o Oracle SQL Developer.

## Funcionalidades Implementadas

O sistema oferece as seguintes funcionalidades para o gerenciamento de cadastros de pessoas:

* **Cadastro:** Permite a inclusão de novos registros no sistema, armazenando os seguintes dados:
    * Nome completo
    * Endereço de e-mail
    * Data de nascimento
* **Atualização:** Possibilita a modificação de dados de um cadastro existente. A atualização é realizada através da identificação única do registro pelo seu ID.
* **Exclusão:** Permite a remoção de um cadastro do banco de dados, utilizando o ID do registro como critério de exclusão.
* **Consultas:** Oferece a funcionalidade de buscar e exibir os dados de um cadastro específico, utilizando o seu ID como parâmetro de consulta.
* **Listagem:** Exibe todos os registros de cadastro armazenados no sistema.

## Tecnologias Utilizadas

* **Linguagem de Programação:** Java
* **API de Persistência:** Java Persistence API (JPA)
* **Banco de Dados:** Oracle Database
* **Ferramenta de Desenvolvimento:** Oracle SQL Developer
* **Framework de Persistência JPA:** ( Hibernate ORM)

## Configuração do Banco de Dados

Os detalhes de conexão com o banco de dados Oracle foram configurados no arquivo `persistence.xml`. Por razões de segurança, as informações sensíveis (como URL, usuário e senha) foram omitidas e substituídas por `*******` neste arquivo. Para executar o projeto, você precisará configurar as credenciais de acesso ao seu banco de dados Oracle no `persistence.xml`.

