```markdown
# ContaBanco

## Descrição

O projeto ContaBanco é uma aplicação Java simples que simula a criação de uma conta bancária através do terminal. Utiliza o Lombok para reduzir a verbosidade do código Java, automatizando a geração de getters, setters, construtores e métodos toString.

## Tecnologias Utilizadas

- Java 17
- Maven
- Lombok

## Funcionalidades

- Criação de uma conta bancária com número, agência, nome do cliente e saldo.
- Exibição dos dados da conta criada no terminal.

## Como Executar

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório para sua máquina local.
2. Abra o terminal e navegue até a pasta do projeto.
3. Execute o comando `mvn clean install` para construir o projeto.
4. Execute o comando `java -jar target/ContaBanco-1.0-SNAPSHOT.jar` para iniciar a aplicação.
5. Siga as instruções no terminal para criar uma nova conta bancária.

## Dependências

O projeto utiliza a biblioteca Lombok para simplificar o código. O Lombok é uma biblioteca Java que se pluga ao seu editor ou IDE e constrói em tempo de compilação os métodos getter, setter, toString, equals, hashCode, e muito mais.

Para utilizar o Lombok, é necessário que o plugin do Lombok esteja instalado e habilitado em seu IDE. Para mais informações sobre como configurar o Lombok em seu ambiente de desenvolvimento, visite [a documentação oficial do Lombok](https://projectlombok.org/setup/overview).

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java/com/study/model/Conta.java`: Classe modelo que representa uma conta bancária.
- `src/main/java/com/study/ContaTerminal.java`: Classe principal que executa a aplicação e interage com o usuário através do terminal.

## Licença

Este projeto é distribuído sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
```