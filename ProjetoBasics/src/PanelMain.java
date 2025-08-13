import javax.swing.*;

public class PanelMain {
    public static void main(String[] args) {

        // Abre um painel e apenas exibe uma mensagem para o usuário
        JOptionPane.showMessageDialog(null, "Bem vindo");

        // Abre um painel para o usuário digitar um valor, captura esse valor
        // e insere na variável correspondente
        String nome = JOptionPane.showInputDialog("Digite seu nome");

        // Capturar um valor e converter para o tipo Integer
        Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu código"));

        String mensagem = "******** Dados do usário ********" +
                "\nCódigo: " + codigo +
                "\nNome: " + nome;

        // Novamente um painel, porém exibindo uma mensagem dinâmica
        JOptionPane.showMessageDialog(null, mensagem);

        //JOptionPane.showMessageDialog(null, mensagem, "Tela Inicial", JOptionPane.ERROR_MESSAGE);
    }
}
