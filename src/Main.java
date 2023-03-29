import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char wantsToContinue = 'y';

        while(wantsToContinue == 'y' || wantsToContinue == 'Y'){
            System.out.println("Digite um número: ");
            int number = scanner.nextInt();

            if(number == 0){
                System.out.println("O número é 0");
            } else {
                if(number > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            System.out.println("Deseja continuar a checagem? Y - Sim/N - Não");
            wantsToContinue = scanner.next().charAt(0);
        }

    }
}