import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ImpostoContribuinte {

    public static void main(String[] args) {

        ArrayList<Contribuinte> contribuintes= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the number of tax payers:");

        int nContribuintes= scanner.nextInt();
        scanner.nextLine();


        double totalImposto=0;

        DecimalFormat df = new DecimalFormat("#0.00");

        for (int i = 0; i < nContribuintes; i++) {

            System.out.print("Tax payer #" + (i+1) + " data:");
            System.out.print("\nIndividual or company (i/c)? ");
            String tipo= scanner.nextLine().toLowerCase();

            System.out.print("Name: ");
            String nome = scanner.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = scanner.nextDouble();

            if (tipo.equals("i")) {

                System.out.print("Health expenditures: ");
                double gastosSaude = scanner.nextDouble();
                scanner.nextLine();

                Contribuinte contrib = new PessoaFisica(nome, rendaAnual, gastosSaude);
                double imposto = contrib.calcularImposto();

                totalImposto += imposto;

                contribuintes.add(contrib);
            }

            else if (tipo.equals("c")) {


                System.out.print("Number of employees: ");

                int numFuncionarios = scanner.nextInt();
                scanner.nextLine();

                Contribuinte contrib = new PessoaJuridica(nome, rendaAnual, numFuncionarios);

                double imposto = contrib.calcularImposto();
                totalImposto += imposto
                ;

                contribuintes.add(contrib);
            }

        }

        System.out.println("\nTAXES PAID: ");

        for (Contribuinte contrib : contribuintes) {
            System.out.println(contrib.getNome() + ": $" + df.format(contrib.calcularImposto()));
        }


        System.out.println("\nTOTAL TAXES: $ " + totalImposto);
        scanner.close();
    }
}
