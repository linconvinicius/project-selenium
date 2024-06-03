# PetLov Test

Este projeto contém testes automatizados usando Selenium WebDriver para verificar as funcionalidades do site PetLov.

## Estrutura do Projeto

├── src
│ └── main
│ └── java
│ └── br
│ └── com
│ └── rocketskills
│ └── petlov
│ └── Slogan.java
| └── Cadastro.java
| └── Selenide.java

## Pré-requisitos

- Java 8 ou superior
- Maven
- Google Chrome
- ChromeDriver compatível com a versão do Google Chrome instalada
- Selenide

## Configuração do Ambiente

1. **Instale o Java e Maven**:
   - Verifique se você possui o Java instalado executando `java -version` no terminal.
   - Verifique se você possui o Maven instalado executando `mvn -version` no terminal.

2. **Instale o Google Chrome**:
   - Certifique-se de ter o Google Chrome instalado. Você pode baixar a versão mais recente [aqui](https://www.google.com/chrome/).

3. **Baixe o ChromeDriver**:
   - Baixe o ChromeDriver compatível com a versão do seu Chrome [aqui](https://chromedriver.chromium.org/downloads).
   - Extraia o arquivo baixado para um diretório acessível.

4. **Importe o Selenide**:
   - Importe o Selenide seguindo o passo a passo [aqui](https://selenide.org/quick-start.html).
   - Adicione as informações no arquivo `pom.xml`, abaixo das dependencias do Selenium.
    ```
      <dependency>
         <groupId>com.codeborne</groupId>
         <artifactId>selenide</artifactId>
         <version>7.3.1</version>
         <scope>test</scope>
      </dependency>
   ```
   - Após adicionar as dependencias do Selenide, importe as mesmas no script de teste:

   ```
   import static com.codeborne.selenide.Selenide.*;
   import static com.codeborne.selenide.Condition.*;
   ```

## Executando os Testes

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

## 🤖 Como executar

1. Após clonar o repositório, execute o comando:
```
mvn test
```

Ou clique  com o botão direito do mouse dentro do seu bloco de teste e selecione: 
```
Run Test at Cursor (Executar o Teste no Cursor)
```

## Estrutura do Código
O código do teste está localizado em src/main/java/br/com/rocketskills/petlov/Slogan.java.

O código do teste está localizado em src/main/java/br/com/rocketskills/petlov/Cadastro.java.
O código do teste está localizado em src/main/java/br/com/rocketskills/petlov/Selenide.java.

Os testes verificam as funcionalidades do site PetLov.

### Bons testes :)
