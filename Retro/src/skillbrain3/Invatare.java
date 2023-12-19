package skillbrain3;

import java.util.ArrayList;

public class Invatare {
    public static void exIF() {
        int numar = 10;
        if (numar > 5) {
            System.out.println("Nr este mai mare decat 5");
        } else {
            System.out.println("Nr este diferit");
        }
    }

    public static void elseIF() {
        int num = 16;
        if (num == 12) {
            System.out.println("Numarul este 12");
        } else if (num > 10) {
            System.out.println("Numarul este mai mare decat 10");
        } else if (num > 15) {
            System.out.println("Numarul nu este mai mare decat 15");
        } else {
            System.out.println("Numarul este egal cu 12");
        }
    }

    public static void exSwitch() {
        String ziua = "luni";
        switch(ziua){
            case"sambata":{
                System.out.println("Ziua sambata - switch");
            }
            case"duminica":{
                System.out.println("Ziua duminica - switch");
            }
            default:{
                System.out.println("nu este weekend");
            }
        }
    }

    public static void exArray() {
      /*  String[] studenti;
        int numere[];

        studenti = new String[10];
        numere = new int[5];

        double [] duble = new double[7];

        studenti[0]="Mihai";
        studenti[1]="Ana Maria";
        System.out.println(studenti[0]);

        String [] elevi = {"Ana","Maria", "Ioana","Viorica"};
        System.out.println(elevi[0]);
        System.out.println(elevi[3]);

       */

        String[][] bidimensional = new String[3][6];
        String[][][] tridimensional = new String[2][3][4];

        bidimensional[0][1] ="Curs";
        bidimensional[2][1]= "Capitol";
        System.out.println(bidimensional[0][1]);
        System.out.println(bidimensional[2][1]);

        String [][] multidimensonal ={
                {"laptop","masa"},
                {"pahar"}
        };
        System.out.println(multidimensonal[0][0]);
        System.out.println(multidimensonal[0][1]);
        System.out.println(multidimensonal[1][0]);
    }

    public static void exCollection() {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> inturi = new ArrayList<>();

        list.add("mere");
        list.add("pere");
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(0));
        list.set(0,"banane");
        System.out.println(list);
    }
}
