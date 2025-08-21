public class ProdSoftware extends Produto {

    private int tamanho;
    private String versao;

    public ProdSoftware () {
        super();
    }

    // Exigindo somente valores do construtor da classe mãe
    public ProdSoftware (String nome, Double valor) {
        super(nome, valor);
    }

    // Exige valor tanto de atributo da classe mãe quanto da própria classe
    public ProdSoftware (String versao, String nome) {
        super(nome);
        this.versao = versao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
