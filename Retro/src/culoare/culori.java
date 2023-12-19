package culoare;

import java.util.Scanner;

public class culori {
        public static void main(String[] args) {
                System.out.println("Introduceti o culoare");
                Scanner scanner = new Scanner(System.in);
                String culoare = scanner.nextLine();
                culoare = culoare.toLowerCase();

                switch (culoare.toLowerCase()) {
                        case "violet":
                                System.out.println("Culoarea aleasa este:" + culoare);
                                break;
                        case "blue":
                                System.out.println("Culoarea aleasa " + culoare);
                                break;
                        case "red":
                                System.out.println("culoarea aleasa" + culoare);
                        case "galben":
                        case "negru":
                                System.out.println("culorile galben si negru nu sunt admise");
                        default:
                                System.out.println("culoarea aleasa nu este in optiuni");
                }

        }
}
