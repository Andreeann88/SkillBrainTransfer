package exercitiu;

import java.util.Scanner;

public class tema2 {
        //ex1
        public static void citire() {
            Scanner nume = new Scanner(System.in);
            System.out.println("Introduceti numele:");
            String primulNume = nume.nextLine();
            System.out.println("Numele introdus este:" + primulNume);
            nume.close();
        }
        //ex2
        public static void citireDoi() {
            Scanner nume2 = new Scanner(System.in);
            System.out.println("Intrdouceti numele:");
            String numePentru2 = nume2.nextLine();
            System.out.println("Introduceti prenumele:");
            String prenumele = nume2.nextLine();
            System.out.println("Ati introdus numele intreg:" + (numePentru2.concat(prenumele)));
            nume2.close();
        }
        //ex3
        public static void numere(){
            Scanner number = new Scanner(System.in);
            System.out.println("Introduceti primul numar:");
            int primulNumar = number.nextInt();
            System.out.println("Introduceti al doilea numar:");
            int alDoileaNumar =  number.nextInt();
            System.out.println("Restul impartirii:" + primulNumar + " la " + alDoileaNumar + " este: " + (primulNumar % alDoileaNumar));
            number.close();
        }
        //ex4
        public static void multe(){
            for (int i = 1; i <= 100; i++){
                System.out.println(i);
            }
        }
        //ex5
        public static void divizibile(){
            Scanner text = new Scanner(System.in);
            System.out.println("Introduceti un numar:");
            int divizibil = text.nextInt();
            if (divizibil % 7 == 0)
            {
                System.out.println("Numarul introdus este divizibil cu 7.");
            }
            else{
                System.out.println("Numarul introdus nu este divizibil cu 7.");
            }
            text.close();
        }
        //ex6
        public static void divide (){
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println("Foo");
                } else {
                    System.out.println(i);
                }
            }
        }
        //ex7
        public static void bar (){
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.println("Bar");
                } else {
                    System.out.println(i);
                }
            }
        }
        //ex8
        public static void foobar(){
            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println("FooBar");
                } else if (i % 3 == 0){
                    System.out.println("Foo");
                } else if (i % 5 == 0) {
                    System.out.println("Bar");
                } else {
                    System.out.println(i);
                }

            }
        }
        //ex9
        public static void putereaA4a(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceți un număr: ");
            double numarul = scanner.nextDouble();
            double puterePatru = Math.pow(numarul, 4);
            System.out.println(numarul + " ridicat la puterea a patra este: " + puterePatru);
            scanner.close();
        }
        //ex10
        public static void varste(int varsta){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceți vârsta: ");
            int  var = scanner.nextInt();
            scanner.close();
            if (var > 60) {
                System.out.println("Ești bătrân.");
            } else if (var < 25) {
                System.out.println("Ești tânăr/tânără.");
            } else {
                System.out.println("Nu ești nici tânăr/tânără, nici bătrân/bătrână.");
            }
        }

    }
