public class NaoItemMenu {
    private String nome;
    private double preco;

    public NaoItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + preco;
    }
}
