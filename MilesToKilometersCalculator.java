package homeworks;

import java.util.Scanner;

public class MilesToKilometersCalculator {
    public static void main(String[] args) {

        double miles, kilometers;
        System.out.println("*** KALKULATOR MILE - KILOMETRY *** \n");
        System.out.println("Witaj w kalkulatorze, który przelicza wartość z mil lądowych na kilometry.\nNa potrzeby tego programu za wartość 1 mili przyjęto wartość 1,61 km\n ");
        do {
            System.out.println("Podaj wartość w milach: ");
            miles = readValue();
            if (miles <= 0) {
                System.out.println("Wartość nie może być >= 0 !");
            }
        }    while (miles <= 0) ;

        kilometers = (miles * 1.61);  // Za wartość 1 km przyjąłem w przybliżeniu 1,61 mili
        System.out.println("Wartość w kilometrach: " + (kilometers));

    }
    private static double readValue() {
        final Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
