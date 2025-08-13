import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Saída de dados
        System.out.println("Hello and welcome!");


        // Importação da classe para Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        // String, Integer, Double, Boolean
        String nome = scanner.next();

        System.out.println("Olá " + nome + " seja bem vindo!");

    }
}