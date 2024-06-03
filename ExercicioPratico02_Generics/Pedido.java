import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Method;

public class Pedido<T> {
    private List<T> itens;
    private double total;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(T item) {
        itens.add(item);
        total += getPreco(item);
    }

    public void removerItem(T item) {
        if (itens.remove(item)) {
            total -= getPreco(item);
        }
    }

    public double calcularTotal() {
        return total * 1.2;
    }

    public List<T> getItens() {
        return itens;
    }

    public void limparPedido() {
        itens.clear();
        total = 0.0;
    }

    @Override
    public String toString() {
        StringBuilder descricaoPedido = new StringBuilder();
        for (T item : itens) {
            descricaoPedido.append(item.toString()).append("\n");
        }
        descricaoPedido.append("Total: R$ ").append(total).append("\n");
        return descricaoPedido.toString();
    }

    private double getPreco(T item) {
        try {
            Method metodoGetPreco = item.getClass().getMethod("getPreco");
            return (double) metodoGetPreco.invoke(item);
        } catch (Exception e) {
            throw new RuntimeException("O item não possui um método getPreco", e);
        }
    }
}
