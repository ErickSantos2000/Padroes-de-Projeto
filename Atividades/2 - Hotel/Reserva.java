public class Reserva {
    private int numeroDias;
    private Quarto quarto;
    private double total;
    private Cliente cliente;
    private String codigo;

    public Reserva(String codigo, Cliente cliente, Quarto quarto, int numeroDias){
        this.codigo = codigo;
        this.cliente = cliente;
        this.numeroDias = numeroDias;
        this.quarto = quarto;
    }

    public double calculaTotal(){
        double total = this.getNumeroDias() * this.getQuarto().getPrecoDiaria();
        setTotal(total);
        return total;
        
    }

    public void aplicaDesconto(){
        double total = getTotal();

         if (this.getCliente().isPremium()) {
            total = total * 0.9; // 10% de desconto
            this.setTotal(total);
        }
    }

    public void quartoDisponivel(){
         if (!this.getQuarto().isDisponivel()) {
            System.out.println("Quarto Disponivel");
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }


    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getNumeroDias() {
        return numeroDias;
    }
    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }
}
