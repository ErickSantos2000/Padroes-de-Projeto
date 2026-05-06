public class FormaPagamentoBoleto implements FormaPagamengo{

    public double processarPagamento(double valor){
        double desconto = valor * (10.0 / 100.0);
        return valor - desconto;
    }

}