import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {

        // Aplicando o conceito de CRUD em List
        // C - Create
        // R - Read
        // U - Update
        // D - Delete

        // Criando a lista do tipo da classe 'Produto'
        List<Produto> produtoList = new ArrayList<>();

        // Criar um contador para sequência dos códigos
        int sequeciaCodigos = 1;

        int opcao = 999;
        String menu = "*** Menu Produto ***\n" +
                "\n[1] Listar todos" +
                "\n[2] Buscar por código" +
                "\n[3] Adicionar novo" +
                "\n[4] Alterar" +
                "\n[5] Excluir" +
                "\n[0] Sair";

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    String tabela = "<html><table border='1'>" +
                            "<tr>" +
                            "   <th>Código</th>" +
                            "   <th>Nome</th>" +
                            "   <th>Valor</th>" +
                            "</tr>";

                    for (Produto produto : produtoList) {
                        tabela += "" +
                                "<tr>" +
                                "   <td>" + produto.getCodigo() + "</td>" +
                                "   <td>" + produto.getNome() + "</td>" +
                                "   <td>" + produto.getValor() + "</td>" +
                                "</tr>";
                    }

                    tabela += "</table></html>";

                    if (produtoList.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, tabela);
                    }
                    break;

                case 2:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código para buscar"));
                    Produto produtoEncontrado = null;

                    for (Produto produto : produtoList) {
                        if (codigoBusca == produto.getCodigo()) {
                            produtoEncontrado = produto;
                        }
                    }

                    if (produtoEncontrado == null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não encontrado para o código " + codigoBusca);
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto encontrado!\n" +
                                        "\nCódigo: " + produtoEncontrado.getCodigo() +
                                        "\nNome: " + produtoEncontrado.getNome() +
                                        "\nValor: R$" + produtoEncontrado.getValor()
                        );
                    }

                    break;

                case 3:
                    Produto novoProduto = new Produto();

                    novoProduto.setCodigo(sequeciaCodigos);
                    sequeciaCodigos++;

                    novoProduto.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));

                    double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
                    novoProduto.setValor(novoValor);

                    produtoList.add(novoProduto);

                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

                    break;

                case 5:
                    tabela = "<html><table border='1'>" +
                            "<tr>" +
                            "   <th>Código</th>" +
                            "   <th>Nome</th>" +
                            "   <th>Valor</th>" +
                            "</tr>";

                    for (Produto produto : produtoList) {
                        tabela += "" +
                                "<tr>" +
                                "   <td>" + produto.getCodigo() + "</td>" +
                                "   <td>" + produto.getNome() + "</td>" +
                                "   <td>" + produto.getValor() + "</td>" +
                                "</tr>";
                    }

                    tabela += "</table></html>" +
                            "\nDigite o código para excluir";
                    int codigoExclusao = Integer.parseInt(JOptionPane.showInputDialog(tabela));

                    Produto produtoExcluir = null;
                    for (Produto produto : produtoList) {
                        if (produto.getCodigo() == codigoExclusao) {
                            produtoExcluir = produto;
                        }
                    }

                    if (produtoExcluir == null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não enontrado para o código " + codigoExclusao
                        );
                    } else {
                        produtoList.remove(produtoExcluir);
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto excluído com sucesso!" +
                                        "\n" + produtoExcluir.getCodigo() +
                                        " - " + produtoExcluir.getNome()
                        );
                    }

                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        }


    }
}
