import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {


        // const listaNumeros = [];

        // Declarar uma lista com um tipo específico
        List<String> listaAlunos = new ArrayList<>();


        // Adicionar elementos na lista
        listaAlunos.add("Harry");
        listaAlunos.add("Rony");
        listaAlunos.add("Hermione");
        listaAlunos.add("Luna");
        listaAlunos.add("Bob");


        // Imprimir um elemento específico da lista
        System.out.println("Nome:" + listaAlunos.get(2));

        // Descobrir se a lista está vazia
        System.out.println(listaAlunos.isEmpty());

        // Descobir o index de um elemento
        int index = listaAlunos.indexOf("Bob");
        System.out.println("Index: " + index);

        // Remover um elemento da lista
        listaAlunos.remove("Bob");

        // Imprimir a lista através de um laço de repetição
        System.out.println("Lista de alunos ...");
        for (String aluno : listaAlunos) {
            System.out.println(aluno);
        }

        // Retorna a quantidade elementos da lista
        int tamanhoLista = listaAlunos.size();
        System.out.println("Tamanho da lista: " + tamanhoLista);


    }
}
