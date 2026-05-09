import java.util.List;
import java.util.ArrayList;

public class RepositoryReservaArryList implements ReservaRepository{
    private List<Reserva> reservas = new ArrayList<>();

    public RepositoryReservaArryList(){

    }
    public void adiciconaReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
