import javax.swing.*;

public class MainProduto {
    public static void main(String[] args) {

        // Instanciar objeto da classe Produto
        Produto produto1 = new Produto();

        produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto"));

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
        produto1.setValor(valor);

        String mensagem = "Detalhes do produto\n" +
                "\nProduto: " + produto1.getNome() +
                "\nValor: RS" + produto1.getValor();

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
