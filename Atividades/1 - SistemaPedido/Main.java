public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(new FormaPagementoCartao());
        Item i1 = new Item(20.0, 2.0);
        Item i2 = new Item(10.0, 3.0);

        pedido1.getItens().add(i1);
        pedido1.getItens().add(i2);

        Pedido pedido2 = new Pedido(new FormaPagamentoBoleto());
        Item i3 = new Item(40.0, 2.0);
        Item i4 = new Item(80.0, 3.0);

        pedido2.getItens().add(i3);
        pedido2.getItens().add(i4);

        PedidoService sistemaPedidos = new PedidoService();

        sistemaPedidos.processarPedido(pedido1);
        sistemaPedidos.processarPedido(pedido2);
    }
}
