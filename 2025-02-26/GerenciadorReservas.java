import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciadorReservas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reserva reserva = null;

        try {
            System.out.print("Room: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            String dataEntrada = sc.nextLine();

            System.out.print("Check-out date(dd/MM/yyyy): ");
            String dataSaida = sc.nextLine();

            reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida);
            reserva.mostrarReserva();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida! Certifique-se de digitar os dados corretamente.");
            sc.nextLine();
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            System.out.println("\nCheck-in date(dd/MM/yyyy): ");
            String novoDiaEntrada = sc.nextLine();

            System.out.println("Check-out date(dd/MM/yyyy): ");
            String novoDiaSaida = sc.nextLine();

            reserva.atualizarDatas(novoDiaEntrada, novoDiaSaida);
            reserva.mostrarReserva();

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please make sure to enter the data correctly.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

