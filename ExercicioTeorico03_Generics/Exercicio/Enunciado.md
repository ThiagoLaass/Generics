
# Exercício Teórico Desafiador sobre Generics em Java

Bem vindo! Você foi encarregado de desenvovler um sistema para gerenciamento ddos animais do zoólogico de Belo Horizonte. Este sistema precisa ser capaz de manipular diferentes tipos de animais (Mamíferos, Aves, Répteis...), permitindo adicionar, remover e listar animais. Além disso, o sistema deverá permitir também calcular o custo total de manutenção desses animais, baseado em um método `getCustoManutencao()`.

## Definição das Classes:
- Crie uma classe abstrata `Animal` com um método abstrato `getCustoManutencao()`.


- Crie as classes concretas para `Mamifero`, `Ave` e `Reptil`, cada uma estendendo a classe `Animal` e implementando o método `getCustoManutencao()`.

## Implementação de Generics: ----> foco do exercício

- Implemente uma classe genérica `Zoologico<T extends Animal>` que permita adicionar, remover e listar animais.


- A classe `Zoologico` deve ser capaz de calcular o custo total de manutenção dos animais adicionados, aplicar um custo adicional de 15% para manutenção geral e permitir a limpeza do zoológico (remover todos os animais).

## Restrição de Tipo:

- Adicione uma restrição na classe `Zoologico` para garantir que apenas tipos que estendem `Animal` e implementam `Serializable` possam ser usados.

## Métodos Genéricos:

- Crie um método genérico `public <T extends Animal> void transferirAnimais(Zoologico<T> outroZoologico)` na classe `Zoologico` que transfira todos os animais de um zoológico para outro.




## !!Dica para a Implementação!!:


- Utilize reflexão para invocar o método `getCustoManutencao()` ao calcular o custo total.

- Certifique de que a classe `Zoologico` é flexível o suficiente para ser reutilizada com diferentes tipos de animais.

- Teste sua implementação com diferentes tipos de animais e zoológicos para garantir que todas as funcionalidades estão corretas.






## Exemplo:
```java
Zoologico<Mamifero> zoologicoMamiferos = new Zoologico<>();
Mamifero leao = new Mamifero("Leão", 5000.0);
Mamifero elefante = new Mamifero("Elefante", 7000.0);

zoologicoMamiferos.adicionarAnimal(leao);
zoologicoMamiferos.adicionarAnimal(elefante);

double custoTotal = zoologicoMamiferos.calcularCustoTotal();
System.out.println("Custo total de manutenção: R$ " + custoTotal);

Zoologico<Ave> zoologicoAves = new Zoologico<>();
Ave arara = new Ave("Arara", 2000.0);
zoologicoAves.adicionarAnimal(arara);

```
