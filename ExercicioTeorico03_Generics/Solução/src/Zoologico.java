import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Zoologico<T extends Animal & Serializable> {
    private List<T> animais;
    private double totalCusto;

    // Construtor que inicializa a lista de animais e o custo total
    public Zoologico() {
        this.animais = new ArrayList<>();
        this.totalCusto = 0.0;
    }

    // Adiciona um animal ao zoológico
    public void adicionarAnimal(T animal) {
        animais.add(animal);
        totalCusto += getCustoManutencao(animal);
    }

    // Remove um animal do zoológico
    public void removerAnimal(T animal) {
        if (animais.remove(animal)) {
            totalCusto -= getCustoManutencao(animal);
        }
    }

    // calcula o custo total de manutenção com um adicional de 15%
    public double calcularCustoTotal() {

        return totalCusto * 1.15;
    }

    // lista todos os animais no zoológico
    public List<T> listarAnimais() {

        return animais;
    }

    //  limpa todos os animais do zoológico
    public void limparZoologico() {

        animais.clear();
        totalCusto = 0.0;
    }

    // Printa string do zoológico e seu custo total
    @Override
    public String toString() {

        StringBuilder descricaoZoologico = new StringBuilder();
        for (T animal : animais) {
            descricaoZoologico.append(animal.toString()).append("\n");
        }
        descricaoZoologico.append("Custo total: R$ ").append(totalCusto).append("\n");
        return descricaoZoologico.toString();
    }

    // Obtem o custo de manutenção do animal usando reflexão
    private double getCustoManutencao(T animal) {

        try {
            Method metodoGetCusto = animal.getClass().getMethod("getCustoManutencao");
            return (double) metodoGetCusto.invoke(animal);
        } catch (Exception e) {
            throw new RuntimeException("O animal não possui um método getCustoManutencao", e);
        }
    }

}