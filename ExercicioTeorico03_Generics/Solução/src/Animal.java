import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String nome;

    // Construtor que inicializa o nome do animal
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome do animal
    public String getNome() {
        return nome;
    }

    // Método abstrato, obtem o custo de manutenção
    public abstract double getCustoManutencao();
}
