public class FormaPagementoCartao implements FormaPagamengo{

    public double processarPagamento(double valor){
        double desconto = valor * (15.0 / 100.0);
        return valor - desconto;

    }

}