import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExLista {
    public static void main(String[] args) {

        // Crie um algoritmo que exiba um menu para o usuário com as opções:
            // [1] Exibir lista
            // [2] Inserir nome
            // [3] Localizar funcionário por posição
            // [4] Localizar funcionário por nome
            // [5] Remover um funcionario
            // [0] Sair do sistema

        // Observação: O menu deve continuar ativo até que o usuário decida sair
        // do sistema, ou seja, escolher a opção "0", caso contrário é pra continar
        // exibindo o menu para que interaja com as opções.

        List<String> listaFuncionarios = new ArrayList<>();

        String menu = "" +
                "*** Menu de opções ***" +
                "\n[1] Exibir lista" +
                "\n[2] Inserir nome" +
                "\n[3] Localizar funcionário por posição" +
                "\n[4] Localizar funcionário por nome" +
                "\n[5] Remover um funcionario" +
                "\n[0] Sair" +
                "\n**************************";

        int opcao = 999;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String lista = "*** Lista de funcionários ***\n";
                    for (String funcionario : listaFuncionarios ) {
                        lista += funcionario + "\n";
                    }
                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existem funcionários cadastrados");
                    } else  {
                        JOptionPane.showMessageDialog(null, lista);
                    }
                    break;

                case 2:
                    String novoFuncionario = JOptionPane.showInputDialog(
                            null,
                            "Digite o nome do novo funcionario");
                    listaFuncionarios.add(novoFuncionario);
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    break;
                case 3:
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição a ser encontrada"));

                    if (posicao >= 0 && posicao < listaFuncionarios.size()) {
                        String funcPosicao = listaFuncionarios.get(posicao);
                        JOptionPane.showMessageDialog(
                                null,
                                "Funcionário encontrado: " + funcPosicao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
                    }

                    break;

                case 4:
                    String funcNome = JOptionPane.showInputDialog("Informe o nome para buscar");
                    String funcEncontrado = null;

                    for (String func : listaFuncionarios) {
                        if (funcNome.equalsIgnoreCase(func)) {
                            funcEncontrado = func;
                        }
                    }

                    if (funcEncontrado != null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Funcionário encontrado: " + funcEncontrado.toUpperCase());
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
                    }
                    break;
                case 5:
                    String funcRemover = JOptionPane.showInputDialog("Digite o nome a ser removido");
                    boolean exclusao = listaFuncionarios.remove(funcRemover);
                    if (exclusao == true) {
                        JOptionPane.showMessageDialog(
                                null,
                                funcRemover +" removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema ...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        }

    }
}
