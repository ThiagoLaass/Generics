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