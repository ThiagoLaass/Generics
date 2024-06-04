
# Solução para o Exercício Teórico Desafiador sobre Generics em Java

## Definição das Classes

### Animal.java
```java
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
```

### Mamifero.java
```java
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
```

### Ave.java
```java
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
```

### Reptil.java
```java
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
```

## Implementação de Generics

### Zoologico.java
```java
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
```

## Exemplo de Uso

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        Zoologico<Mamifero> zoologicoMamiferos = new Zoologico<>();
        Mamifero leao = new Mamifero("Leão", 5000.0);
        Mamifero elefante = new Mamifero("Elefante", 7000.0);

        // Adiciona animais 
        zoologicoMamiferos.adicionarAnimal(leao);
        zoologicoMamiferos.adicionarAnimal(elefante);

        // Calcula e exibe o custo total de manutenção dos mamíferos
        double custoTotal = zoologicoMamiferos.calcularCustoTotal();
        System.out.println("Custo total de manutenção: R$ " + custoTotal);

        Zoologico<Ave> zoologicoAves = new Zoologico<>();
        Ave arara = new Ave("Arara", 2000.0);
        zoologicoAves.adicionarAnimal(arara);

    }
}
```

## Explicação da Solução

# Estrutura das Classes

- Animal.java: lasse abstrata que define um modelo para todos os animais. Cada animal tem um nome e um método abstrato `getCustoManutencao()` que deve ser implementado pelas subclasses para fornecer o custo de manutenção específico do animal.

- Mamifero.java, Ave.java, Reptil.java: classes concretas que estendem a classe `Animal` e implementam o método `getCustoManutencao()` para fornecer o custo de manutenção específico de cada tipo de animal.

# Implementação de Generics

- Zoologico.java: classe genérica que pode gerenciar uma coleção de animais. Faz uso de uma restrição do tipo (`T extends Animal & Serializable`), garantindo que apenas objetos que são tanto animais quanto serializáveis possam ser usados. 

fornece métodos para adicionar, remover e listar animais, bem como calcular o custo total de manutenção com um adicional de 15%(esse é um valor simplóprio).

# Exemplo de Uso

- Main.java: Apenas um exemplo de um possível caso de uso, demonstra como criar zoológicos específicos para diferentes tipos de animais, adicionar animais a esses zoológicos, calcular o custo total de manutenção e transferir animais entre zoológicos.

# Conclusão

Com essa solução, utilizamos generics para criar uma aplicação que pode gerenciar diferentes tipos de animais em um zoológico. Além disso, demonstramos também como usar reflexão para invocar métodos em objetos genéricos e como aplicar restrições de tipo.
