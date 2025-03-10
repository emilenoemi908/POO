import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {

    private int numeroQuarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(int numeroQuarto, String dataEntrada, String dataSaida) {
        this.numeroQuarto = numeroQuarto;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataEntrada = LocalDate.parse(dataEntrada, formatter);
        this.dataSaida = LocalDate.parse(dataSaida, formatter);
    }

    private boolean validarDatas(LocalDate dataEntrada, LocalDate dataSaida) {
        return dataSaida.isAfter(dataEntrada);
    }

    public int duracao() {
        return (int) ChronoUnit.DAYS.between(dataEntrada, dataSaida);
    }

    public void atualizarDatas(String novaDataEntrada, String novaDataSaida) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaEntrada = LocalDate.parse(novaDataEntrada, formatter);
        LocalDate novaSaida = LocalDate.parse(novaDataSaida, formatter);

        if (!validarDatas(novaEntrada, novaSaida)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }
        this.dataEntrada = novaEntrada;
        this.dataSaida = novaSaida;
    }

    public void mostrarReserva() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Reservation: Room %d, check-in: %s, check-out: %s, %d nights%n",
                numeroQuarto, dataEntrada.format(formatter), dataSaida.format(formatter), duracao());
    }
}

