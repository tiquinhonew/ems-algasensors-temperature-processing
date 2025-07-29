# EMS - AlgaSensors Temperature Processing

Microserviço responsável pelo processamento dos dados brutos de temperatura recebidos dos sensores no sistema EMS AlgaSensors.

## Funcionalidades

- Processamento de leituras de temperatura recebidas dos sensores
- Aplicação de regras de negócio e validações sobre os dados
- Envio de dados processados para outros microserviços ou sistemas
- Geração de eventos ou alertas com base em leituras anômalas

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.x
- JPA/Hibernate
- H2 Database (para desenvolvimento)
- Lombok
- Gradle

## Como Executar

1. Certifique-se de ter clonado o repositório principal com os submódulos:
   ```sh
   git clone --recurse-submodules git@github.com:tiquinhonew/ems-algasensors-temperature-processing.git
   ```

2. Acesse a pasta do microserviço:
   ```sh
   cd microservices/temperature-processing
   ```

3. Execute o serviço:
   ```sh
   ./gradlew bootRun
   ```

O serviço estará disponível em `http://localhost:8081`.

## Endpoints Principais

- `POST /process` – Processar nova leitura de temperatura
- `GET /processed` – Listar dados de temperatura já processados

## Configuração

O microserviço utiliza o banco de dados H2 em memória para desenvolvimento. As configurações podem ser ajustadas no arquivo `application.yml`.

## Testes

Para rodar os testes automatizados:
```sh
./gradlew test
```

## Licença

MIT License © Douglas Moraes