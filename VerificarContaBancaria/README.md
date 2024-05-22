# VerificarContaBancaria

## Descrição

O `VerificarContaBancaria` é um aplicativo simples em Java que permite ao usuário verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos, todos numéricos. Projeto Desafio curso Santander 2024 - Backend com Java - promovido pela plataforma educativa da DIO.

## Funcionalidades

- **Verificação de Conta Bancária**: O aplicativo verifica se o número da conta bancária inserido possui exatamente 8 dígitos e se todos são numéricos.
- **Interface Gráfica**: Utiliza a biblioteca Swing do Java para fornecer uma interface gráfica amigável ao usuário.

## Como Usar

1. **Compilação**:
   - Abra o terminal e navegue até o diretório onde o arquivo `VerificarContaBancaria.java` está localizado.
   - Execute o comando:

     javac VerificarContaBancaria.java

2. **Execução**:
   - Após a compilação bem-sucedida, execute o programa:

     java VerificarContaBancaria

3. **Uso da Interface**:
   - Uma janela será aberta com um campo de texto onde o usuário pode digitar o número da conta bancária.
   - Após digitar o número da conta, clique no botão "Verificar".
   - O aplicativo exibirá uma mensagem indicando se o número da conta é válido ou inválido.

## Requisitos

- Java JDK instalado (versão 8 ou superior).

## Código Principal

## Explicação do Funcionamento

    Importações: Importa todas as classes necessárias do pacote javax.swing.
    Classe Principal: Define a classe VerificarContaBancaria que contém o método main.
    Criação da Janela: Configura a janela principal (JFrame).
    Painel Principal: Cria e configura o painel (JPanel) onde os componentes da interface serão adicionados.
    Componentes da Interface: Adiciona rótulos (JLabel), campo de texto (JTextField) e botão (JButton) ao painel.
    Ação do Botão: Define a ação a ser executada quando o botão "Verificar" é clicado, utilizando uma expressão lambda.
    Verificação da Conta: Método verificarNumeroConta que valida o número da conta bancária.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE para mais detalhes.

Autor:Izairton O de Vasconcelos
e-mail:iovascon@gmail.com
