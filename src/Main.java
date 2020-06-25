import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum;
        int sub;


        String response;
        Scanner scanner = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);
        String dodawanie = "dodawanie";
        String odejmowanie = "odejmowanie";
        String mnożenie = "mnożenie";
        String dzielenie = "dzielenie";


        System.out.println("Posiadam kilka opcji. Są to: dodawanie, odejmowanie, mnożenie i dzielenie. Wybierz jedną sposród nich i wpisz poniżej: ");
        response = scanner.nextLine();




        if (dodawanie.equalsIgnoreCase(response)) {
            System.out.println("Podaj pierwszą liczbę: ");
            int n1 = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int n2 = scanner.nextInt();
            sum = n1 + n2;
            System.out.println("Wynik Twojego dodawania to: " + sum);
        } else if (odejmowanie.equalsIgnoreCase(response)) {
            System.out.println("Podaj pierwszą liczbę: ");
            int n1 = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int n2 = scanner.nextInt();
            sum = n1 - n2;
            System.out.println("Wynik Twojego odejmowania to: " + sum);
        } else if (mnożenie.equalsIgnoreCase(response)) {
            System.out.println("Podaj pierwszą liczbę: ");
            int n1 = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int n2 = scanner.nextInt();
            sum = n1 * n2;
            System.out.println("Wynik Twojego mnożenia to: " + sum);
        } else if (dzielenie.equalsIgnoreCase(response)) {
            System.out.println("Podaj pierwszą liczbę: ");
            int n1 = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int n2 = scanner.nextInt();
            sum = n1 / n2;
            System.out.println("Wynik Twojego dzielenia to: " + sum);
        } else {
            System.out.println("Niestety nie posiadam takiej opcji.");






        }







    }
}
