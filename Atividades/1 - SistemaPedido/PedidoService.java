import java.util.*;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();


    public void processarPedido(Pedido pedido) {

        // Calcula o total
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco() * item.getQuantidade();
        }

        pedido.pagar(total);

        // Salva no banco de dados
        pedidos.add(pedido);
        pedido.setId(pedidos.size());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Pedido salvo: " + pedido.getId());
    }
}
