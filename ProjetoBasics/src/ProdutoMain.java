import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {
    public static void main(String[] args) {

        // Aplicando o conceito de CRUD em List
        // C - Create
        // R - Read
        // U - Update
        // D - Delete

        // Instanciar o serviço da ProdutoService
        ProdutoService service = new ProdutoService();

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

                    if (service.getListaProduto().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Sem produtos cadastrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, service.getListaTabela());
                    }
                    break;

                case 2:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código para buscar"));
                    Produto produtoEncontrado = service.getProdutoPorCodigo(codigoBusca);

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
                    String novoNome = JOptionPane.showInputDialog("Digite o nome do produto");
                    double novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));

                    Produto novoProduto = new Produto();
                    novoProduto.setNome(novoNome);
                    novoProduto.setValor(novoValor);

                    service.addProduto(novoProduto);
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    break;

                case 4:
                    String tabelaAlterar = service.getListaTabela() + "\nDigite o código para alterar";
                    int codigoAlterar = Integer.parseInt(JOptionPane.showInputDialog(tabelaAlterar));
                    Produto produtoAlterar = service.getProdutoPorCodigo(codigoAlterar);

                    if (produtoAlterar == null) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não encontrado para o código " + codigoAlterar
                        );
                    } else {
                        String mensagemAlterar = "Produto encontrado!\n" +
                                "\nNome: " + produtoAlterar.getNome() +
                                "\nValor: " + produtoAlterar.getValor();
                        JOptionPane.showMessageDialog(null, mensagemAlterar);

                        String nomeAlterar = JOptionPane.showInputDialog("Digite o novo nome");
                        double valorAlterar = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor"));

                        service.updateProduto(codigoAlterar, nomeAlterar, valorAlterar);
                        JOptionPane.showMessageDialog(
                                null,
                                produtoAlterar.getNome() + " alterado com sucesso!");
                    }

                    break;

                case 5:
                    String tabelaExcluir = service.getListaTabela() +
                            "\nDigite o código para excluir";
                    int codigoExclusao = Integer.parseInt(JOptionPane.showInputDialog(tabelaExcluir));

                    boolean isExclusao = service.deleteProduto(codigoExclusao);

                    if (!isExclusao) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto não enontrado para o código " + codigoExclusao
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Produto excluído com sucesso!"
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
