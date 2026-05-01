import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Item> itens = new ArrayList<>();
    private double total; 
    private String formaPagamento;
    private int id;

    public Pedido(String formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    // formaPagamento get e set
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
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

