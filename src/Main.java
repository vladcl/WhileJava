import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int totalCars = 10;

        Scanner scanner = new Scanner(System.in);

        while(totalCars > 0) {
            String carName = scanner.nextLine();
            int carYear = scanner.nextInt();

            System.out.println("A marca do seu carro é: " + carName
            + ", e o ano de fabricação é: " + carYear);

            totalCars = totalCars - 1;
        }
    }
}