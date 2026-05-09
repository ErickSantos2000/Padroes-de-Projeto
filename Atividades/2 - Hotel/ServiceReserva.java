import java.util.List;
import java.util.ArrayList;

public class ServiceReserva {
    

    public void processarReserva(Reserva reserva, ReservaRepository reservaRepository) {
        // Calcula o valor total da estadia
        reserva.calculaTotal();

        // Verifica disponibilidade do quarto
        reserva.quartoDisponivel();

        // Aplica desconto para clientes premium
        reserva.aplicaDesconto();

        // Confirma a reserva
        reserva.getQuarto().setDisponivel(false);
        reservaRepository.adiciconaReserva(reserva);
        System.out.println("Reserva confirmada: " + reserva.getCodigo());
    }
}
