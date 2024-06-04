public class Ave extends Animal {
    private double custoManutencao;

    // Construtor, inicializa o nome e o custo de manutenção da ave
    public Ave(String nome, double custoManutencao) {
        super(nome);
        this.custoManutencao = custoManutencao;
    }

    // método abstrato, obte, o custo de manutenção
    @Override
    public double getCustoManutencao() {
        return custoManutencao;
    }

    // string da ave
    @Override
    public String toString() {
        return getNome() + ": R$ " + custoManutencao;
    }
}