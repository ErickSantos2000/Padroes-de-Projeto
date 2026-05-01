public class Item {
    private double preco;
    private double quantidade;

    public Item(double preco, double quantidade){
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
