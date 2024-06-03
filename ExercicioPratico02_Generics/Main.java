public class Main {
    public static void main(String[] args) {
        Pedido<ItemMenu> pedido = new Pedido<>();

        ItemMenu item1 = new ItemMenu("Pizza", 25.0);
        ItemMenu item2 = new ItemMenu("Refrigerante", 5.0);
        ItemMenu item3 = new ItemMenu("Sobremesa", 10.0);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);

        System.out.println("Pedido atual:");
        System.out.println(pedido);

        pedido.removerItem(item2);

        System.out.println("Pedido após remover o refrigerante:");
        System.out.println(pedido);

        double totalComImposto = pedido.calcularTotal();
        System.out.println("Total com imposto: R$ " + totalComImposto);

        pedido.limparPedido();

        System.out.println("Pedido após limpar:");
        System.out.println(pedido);
    }
}