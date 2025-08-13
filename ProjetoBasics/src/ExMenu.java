import javax.swing.*;

public class ExMenu {
    public static void main(String[] args) {


        // Crie um algoritmo que exiba o seguinte menu para o usuário
            // Opção 1 - Somar
                // Pedir para o usuário 2 números, somar os dois e exibir o resultado

            // Opção 2 - Imprimir sequencia
                // Pedir para o usuário um número, imprimir uma sequência
                // de zero até o número digitado

            // Opção 3 - Par / Ímpar
                // Pedir um número para o usuário e exibir se é Par ou Ímpar

            // Opção 4 - Sair

            // Obs - Validar opções inválidas

        String menu = "" +
                "*** Menu de opções ***" +
                "\n[1] Somar" +
                "\n[2] Imprimir sequência" +
                "\n[3] Descobrir par ou impar" +
                "\n[4] Sair" +
                "\n**************************";

        // Obtendo a opção que o usuário digitou e convertendo para tipo Integer
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcao) {
            case 1:
                int numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
                int numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
                int soma = numA + numB;
                JOptionPane.showMessageDialog(null, "A soma entre os números é: " + soma);
                break;

            case 2:
                int numeroSeq = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
                String sequencia = "";
                for (int i = 0; i <= numeroSeq; i++) {
                    if (i == numeroSeq) {
                        sequencia += i;
                    } else {
                        sequencia += i + " - ";
                        //sequencia.concat(i + " - ");
                    }
                }
                JOptionPane.showMessageDialog(null, sequencia);
                break;

            case 3:
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, numero + " é um número PAR.");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " é um número ÍMPAR.");
                }
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Até breve...");
                break;

            default:
                JOptionPane.showMessageDialog(null, opcao + " é uma opção inválida!");
        }

    }
}
