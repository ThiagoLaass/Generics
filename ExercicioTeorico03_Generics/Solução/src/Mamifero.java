public class Mamifero extends Animal {
    private double custoManutencao;

    // Construtor, inicializa o nome e o custo de manutenção do mamífero
    public Mamifero(String nome, double custoManutencao) {
        super(nome);
        this.custoManutencao = custoManutencao;
    }

    // método abstrato, para obter o custo de manutenção
    @Override
    public double getCustoManutencao() {
        return custoManutencao;
    }

    // string do mamífero
    @Override
    public String toString() {
        return getNome() + ": R$ " + custoManutencao;
    }
}