public class Reptil extends Animal {
    private double custoManutencao;

    // Construtor, inicializa o nome e o custo de manutenção do réptil
    public Reptil(String nome, double custoManutencao) {
        super(nome);
        this.custoManutencao = custoManutencao;
    }

    // metodo abstrato para obter o custo de manutenção
    @Override
    public double getCustoManutencao() {
        return custoManutencao;
    }

    // String de reptil
    @Override
    public String toString() {
        return getNome() + ": R$ " + custoManutencao;
    }
}