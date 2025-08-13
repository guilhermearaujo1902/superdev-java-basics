import javax.swing.*;

public class ExMaioridade {
    public static void main(String[] args) {

        // Executar com JOptionPane
        // Crie um algoritmo capaz de obter o nome e a idade do usuário e valide:
        // Se for MAIOR ou IGUAL a 18, exiba a informação
        //          "Olá <nome>, você é maior de idade!"
        // Se for MENOR que 18, exiba a informação
        //          "Olá <nome>, você é menor de idade!"


        String nome = JOptionPane.showInputDialog("Digite seu nome");

        // Captura a idade em forma de String(texto)
        String idadeTexto = JOptionPane.showInputDialog("Digite sua idade");

        // Converter a idade em texto para o formato de número inteiro
        Integer idade = Integer.parseInt(idadeTexto);

        // Testar a idade do usário
        String mensagemFinal = "";
        if (idade >= 18) {
            mensagemFinal = "Olá " + nome + ", você é Maior de idade!";
        } else {
            mensagemFinal = "Olá " + nome + ", você é Menor de idade!";
        }

        JOptionPane.showMessageDialog(null,mensagemFinal);

    }
}
