public class FormaPagementoCartao implements FormaPagamengo{

    public double pagar(double valor){
        double desconto = valor * (15.0 / 100.0);
        return valor - desconto;

    }

}