# Sistema de Pedidos com Generics

Implemente uma classe genérica chamada Pedido que permita adicionar, remover e 
listar itens de qualquer tipo, contanto que esses itens possuam um método getPreco(). 
A classe deve ser capaz de calcular o total dos preços dos itens adicionados, aplicar 
um valor de atendimento no de 20% no cálculo total e permitir a limpeza do pedido.

## Auxílio

### 1. Classe Pedido:
- Crie uma classe genérica `Pedido<T>`, que irá gerenciar uma lista de itens de um pedido.
- O construtor deve inicializar a lista de itens e o total do pedido.
- Implemente um método privado `getPreco(T item)`.

### 2. Classe ItemMenu:

- O construtor deve inicializar os atributos `nome` e `preco`.
- Implemente um método `getPreco()` que retorna o preço do item.
- Implemente o método `toString()` para retornar uma representação em String do item no formato "nome: R$ preco".

### 3. Classe Main:

- Exiba o pedido atual utilizando o método `toString` da classe `Pedido`.
