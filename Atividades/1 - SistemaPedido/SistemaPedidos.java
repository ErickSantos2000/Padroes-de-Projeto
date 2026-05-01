import java.util.*;

public class SistemaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();


    public void processarPedido(Pedido pedido) {

        // Calcula o total
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco() * item.getQuantidade();
        }
        pedido.setTotal(total);

        // Valida o pagamento
        if (pedido.getFormaPagamento().equals("Cartão")) {
            System.out.println("Processando cartão...");
        } else if (pedido.getFormaPagamento().equals("Boleto")) {
            System.out.println("Gerando boleto...");
        }

        // Salva no banco de dados
        pedidos.add(pedido);
        pedido.setId(pedidos.size());
        System.out.println("Total: " + total);
        System.out.println("Pedido salvo: " + pedido.getId());
    }
}
