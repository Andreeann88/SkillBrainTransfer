import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crearea unui obiect Scanner pentru citirea de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Citirea unui număr de la tastatură
        System.out.print("7: ");
        double numar = scanner.nextDouble();

        // Calculul și afișarea rezultatelor
        System.out.println("Suma cu 5: " + (numar + 5));
        System.out.println("Scăderea cu 12.3: " + (numar - 12.3));
        System.out.println("Înmulțirea cu -3.2: " + (numar * -3.2));
        System.out.println("Împărțirea cu 4: " + (numar / 4));
        System.out.println("Modul cu 6: " + (numar % 6));

        // Închiderea obiectului Scanner
        scanner.close();
    }
}
