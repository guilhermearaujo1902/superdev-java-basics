import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> listaProduto;

    // Criar um contador para sequência dos códigos
    private int sequeciaCodigos;

    // Construtor principal da classe de serviço
    // Ao gerar um objeto dessa classe, a propriedade 'listaProduto' recebe uma nova lista
    ProdutoService () {
        this.listaProduto = new ArrayList<>();
        this.sequeciaCodigos = 1;
    }

    // Função básica para retornar a lista atual
    public List<Produto> getListaProduto () {
        return this.listaProduto;
    }

    // Adicionar um novo produto na lista
    public void addProduto (Produto novoProduto) {
        novoProduto.setCodigo(this.sequeciaCodigos);
        this.sequeciaCodigos++;
        this.listaProduto.add(novoProduto);
    }

    // Buscar produto por codigo
    public Produto getProdutoPorCodigo (int codigo) {
        for (Produto produto : this.listaProduto) {
            if (codigo == produto.getCodigo()) {
                return produto;
            }
        }
        return null;
    }

    // Obter lista em forma de tabela
    public String getListaTabela () {
        String tabela = "<html><table border='1'>" +
                "<tr>" +
                "   <th>Código</th>" +
                "   <th>Nome</th>" +
                "   <th>Valor</th>" +
                "</tr>";

        for (Produto produto : this.listaProduto) {
            tabela += "" +
                    "<tr>" +
                    "   <td>" + produto.getCodigo() + "</td>" +
                    "   <td>" + produto.getNome() + "</td>" +
                    "   <td>" + produto.getValor() + "</td>" +
                    "</tr>";
        }

        tabela += "</table></html>";

        return tabela;
    }

    // Excluir um produto
    public boolean deleteProduto (int codigo) {
        Produto produto = this.getProdutoPorCodigo(codigo);

        if (produto != null) {
            this.listaProduto.remove(produto);
            return true;
        }

        return false;
    }

    // Alterar um produto
    public void updateProduto (int codigo, String novoNome, double novoValor) {
        Produto produto = this.getProdutoPorCodigo(codigo);
        produto.setNome(novoNome);
        produto.setValor(novoValor);
    }

}
