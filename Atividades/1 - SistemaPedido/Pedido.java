import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Item> itens = new ArrayList<>();
    private double total; 
    private FormaPagamengo formaPagamento;
    private int id;

    public Pedido(FormaPagamengo formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    public double processarPagamento(double valor){
        return formaPagamento.processarPagamento(valor);
    }

    // formaPagamento get e set
    public void setFormaPagamento(FormaPagamengo formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public FormaPagamengo getFormaPagamento() {
        return formaPagamento;
    }

    // total get e set
    public double getTotal(){
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Item> getItens() {
        return itens;
    }
    // id set e get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

