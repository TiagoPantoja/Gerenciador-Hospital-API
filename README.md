# Gerenciador-Hospital-API
Esta é uma API REST desenvolvida com o framework Spring Boot, utilizando a linguagem Java. A API é voltada para fornecer funcionalidades relacionadas ao gerenciamento de informações de médicos e pacientes de um hospital.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1
- Spring Data JPA 3.1.1
- Maven
- HATEOAS
- Lombok
- MySQL
- FlyWay
- Spring Security
- Auth0 JWT

## Pré-requisitos

- JDK 8 ou superior
- Maven

## Configuração do Projeto
1. Clone o repositório do projeto: `https://github.com/TiagoPantoja/Gerenciador-Hospital-API.git`
2. Navegue até o diretório raiz do projeto: `cd src`
3. Compile o projeto com o Maven: `mvn compile`
4. Execute o projeto: `mvn spring-boot:run`

A API estará disponível em `http://localhost:8080/gerenciador`

## Dependências
O projeto utiliza as seguintes dependências:

`spring-boot-starter-web`: Fornece as dependências necessárias para criar uma aplicação web com Spring Boot.

`spring-boot-devtools`: Fornece ferramentas de desenvolvimento para agilizar o processo de desenvolvimento.

`lombok`: Biblioteca que simplifica a criação de classes Java, gerando automaticamente os getters, setters, construtores e outros métodos comuns.

`spring-boot-starter-test`: Fornece as dependências necessárias para realizar testes na aplicação.

`spring-boot-starter-data-jpa`: Fornece suporte ao Spring Data JPA para persistência de dados.

`spring-boot-starter-validation`: Fornece suporte à validação de dados usando as anotações de validação do Bean Validation.

`flyway-core`: Fornece suporte ao FlyWay, para realizar a migração de bancos de dados na aplicação.

`flyway-mysql`: Fornece suporte ao banco de dados MySQL utilizando o FlyWay, para migrar os dados dentro da apilicação.

`mysql-connector-j`: Fornece suporte ao banco de dados MySQL na aplicação Spring Boot.

`java-jwt`: Fornece suporte ao JWT como ferramenta para realizar a autenticação dos dados na aplicação.

`spring-boot-starter-security`: Fornece as dependências necessárias para integrar o Spring Boot Security na aplicação.

## Banco de Dados
O projeto utiliza um banco de dados MySQL para armazenar os dados dos médicos e dos pacientes. Certifique-se de ter um servidor MySQL em execução e atualize as configurações de conexão no arquivo `application.properties` com as informações corretas do seu banco de dados.

## Executando o Projeto
Para executar o projeto, você pode utilizar o comando abaixo:

`mvn spring-boot:run`

A aplicação será iniciada e estará disponível no endereço `http://localhost:8080`.

## Endpoints
### Médicos

- `POST /medicos`: Cadastra um novo médico com base nos dados fornecidos.
- `GET /medicos`: Lista os médicos cadastrados.
- `PUT /medicos`: Atualiza as informações de um médico existente.
- `DELETE /medicos/{id}`: Exclui um médico com base no seu ID.

### Pacientes

- `POST /pacientes`: Cadastra um novo paciente com base nos dados fornecidos.
- `GET /pacientes`: Lista os pacientes cadastrados.
- `PUT /pacientes`: Atualiza as informações de um paciente existente.
- `DELETE /pacientes/{id}`: Exclui um paciente com base no seu ID.

### Endereço

A API também possui um componente relacionado a endereços, com as seguintes classes:

- `DadosEndereco`: Representa os dados de um endereço.
- `Endereco`: Classe de domínio que encapsula os dados de um endereço.
- `DadosCadastroMedico` e `DadosCadastroPaciente`: Possuem um campo do tipo `DadosEndereco` para representar o endereço de um médico ou paciente.

## Estrutura do Projeto
A estrutura do projeto segue uma organização padrão do Spring Boot, onde os arquivos Java estão agrupados em pacotes de acordo com sua funcionalidade.

`controller`: Contém os controladores da API responsáveis por receber as requisições e retornar as respostas adequadas.

`endereco`: Contém as classes relacionadas aos dados de endereço.

`medicos`: Contém as classes relacionadas aos médicos, incluindo as entidades, os DTOs e o repositório.

`ApiApplication.java`: Classe principal responsável por iniciar a aplicação Spring Boot.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novos recursos.
