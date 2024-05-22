
import javax.swing.*; // Importa todas as classes do pacote javax.swing

public class VerificarContaBancaria {

    public static void main(String[] args) {
        // Criação da janela principal
        JFrame frame = new JFrame("Verificar Conta Bancária");
        frame.setSize(400, 200); // Define o tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação de fechamento

        // Painel principal
        JPanel panel = new JPanel(); // Cria um painel
        frame.add(panel); // Adiciona o painel à janela
        placeComponents(panel); // Coloca os componentes no painel

        // Torna a janela visível
        frame.setVisible(true); // Define a janela como visível
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Define o layout do painel como nulo

        // Rótulo de instrução
        JLabel userLabel = new JLabel("Digite o número da conta bancária:");
        userLabel.setBounds(10, 20, 300, 25); // Define a posição e o tamanho do rótulo
        panel.add(userLabel); // Adiciona o rótulo ao painel

        // Campo de texto para entrada do número da conta
        JTextField numeroContaText = new JTextField(20);
        numeroContaText.setBounds(10, 50, 300, 25); // Define a posição e o tamanho do campo de texto
        panel.add(numeroContaText); // Adiciona o campo de texto ao painel

        // Botão para verificar a conta
        JButton verifyButton = new JButton("Verificar");
        verifyButton.setBounds(10, 80, 150, 25); // Define a posição e o tamanho do botão
        panel.add(verifyButton); // Adiciona o botão ao painel

        // Rótulo para exibir o resultado
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 300, 25); // Define a posição e o tamanho do rótulo de resultado
        panel.add(resultLabel); // Adiciona o rótulo de resultado ao painel

        // Ação do botão utilizando expressão lambda
        verifyButton.addActionListener(e -> {
            String numeroConta = numeroContaText.getText(); // Obtém o texto digitado no campo de texto
            try {
                verificarNumeroConta(numeroConta); // Verifica se o número da conta é válido
                resultLabel.setText("Número de conta válido."); // Define a mensagem de sucesso no rótulo de resultado
            } catch (IllegalArgumentException ex) {
                resultLabel.setText(ex.getMessage()); // Define a mensagem de erro no rótulo de resultado
            }
        });
    }

    // Define o método verificarNumeroConta para validar o número da conta
    public static void verificarNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem exatamente 8 dígitos
        if (numeroConta.length() != 8) {
            // Se não tiver 8 dígitos, lança uma exceção com mensagem de erro
            throw new IllegalArgumentException("Erro: Número de conta inválido. Digite exatamente 8 dígitos.");
        }
        // Converte a string do número da conta em um array de caracteres e itera sobre ele
        for (char c : numeroConta.toCharArray()) {
            // Verifica se cada caractere é um dígito
            if (!Character.isDigit(c)) {
                // Se encontrar um caractere que não é um dígito, lança uma exceção com mensagem de erro
                throw new IllegalArgumentException("Erro: Número de conta inválido. Digite exatamente 8 dígitos.");
            }
        }
    }
}

/*
Explicação Geral:

O programa lê um número de conta bancária do usuário e verifica se ele possui exatamente 8 dígitos.
Se o número for válido, imprime "Número de conta válido.".
Se o número for inválido (não tiver 8 dígitos ou contiver caracteres não numéricos), lança uma exceção e imprime uma mensagem de erro específica.

Interface Gráfica:: Importações necessárias para usar Swing e manipulação de eventos.
Componentes: Criação e configuração de JLabel, JTextField, JButton e JLabel para a interface do usuário.
JFrame: Criação da janela principal e definição de suas propriedades.
JPanel: Criação e configuração do painel principal que contém os componentes da interface gráfica.
JLabel: Rótulos para instruções e resultados.
JTextField: Campo de texto onde o usuário digita o número da conta.
JButton: Botão para acionar a verificação do número da conta.
ActionListener: Utilização de uma expressão lambda para definir a ação do botão "Verificar".
 */
