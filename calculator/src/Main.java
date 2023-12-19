import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sa calculam pe niste numere!");
        System.out.println("Introduceti primul numar fractionar: ");

        Scanner scanner= new Scanner(System.in);
       double numar1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea nr fractionar");
        double numar2 = scanner.nextDouble();



        Double rezultatInmultire = inmultire (numar1,numar2);
        double rezultatAdaugare = adaugare(numar1, numar2);
        double rezultatScadere = scadere(numar1, numar2);
        double rezultatImpartire= impartire(numar1,numar2);
        double rezultatModul =  modul((int)numar1,((int)numar2));

        double random = genereazaNumarRandom(rezultatScadere, rezultatInmultire);

        System.out.println("Rezultatul inmultirii este: " + rezultatInmultire);
        System.out.println("Rezultatul adaugarii este: " + rezultatAdaugare);
        System.out.println("Rezultatul scaderii este: " + rezultatScadere);
        System.out.println("Rezultatul impartire este: " + rezultatImpartire);
        System.out.println("Rezultatul modul este: " + rezultatModul);

        System.out.println("Numarul radom generat intre " + rezultatScadere + " si " + rezultatInmultire + " este " + random);




    }
    public static double inmultire(double nr1, double nr2){
        double rezultat =  nr1 * nr2;
        return rezultat;
    }
    public static Double adaugare(double numar1, double nr2){
        double rezultat = numar1 * nr2;
        return rezultat;
    }
    public static double scadere(Double numar1, Double numar2){
        Double rezultat = numar1 - numar2;
        return rezultat;
    }
    public static Double impartire (Double numar1, double  numar2){
        double rezultat = numar1 / numar2;
        return rezultat;
    }
    public static int modul(int nr1, Integer nr2){
        return nr1 % nr2;
    }

    public static double genereazaNumarRandom(double minim, double maxim){
        return Math.random()*(maxim - minim) + minim;
    }
}