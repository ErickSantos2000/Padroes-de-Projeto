public class Main{
    public static void main(String[] args) {
        // Instancia o sistema
        ServiceReserva sistema = new ServiceReserva();

        // Cria objetos de teste
        Cliente cliente = new Cliente(true); // Cliente Premium (tem desconto)
        Quarto quarto = new Quarto(100.0);   // Diária de R$ 100,00
        
        // Cria uma reserva de 3 dias para o código "RES123"
        Reserva minhaReserva = new Reserva("RES123", cliente, quarto, 3);

        ReservaRepository reservaRepository = new RepositoryReservaArryList();

        sistema.processarReserva(minhaReserva, reservaRepository);
 
    }
}

