package Skillbrain;

/**
 * // Sa se acorde vouchere in functie de varsta
 * // 1. 35 de lei pentru cei sub 18 ani
 * // 2. 30 de lei pentru cei intre 18 si 40
 * // 3. 25 de lei pentru cei intre 40 si 65
 * // 4. 40 de lei pentru restul
 */
public class curs2 {
    public static int acordareVouchere(int varst){

        if (varst < 18){
            return 35;
        } else if (varst > 18 && varst <40){
            return 30;
        } else if (varst > 40 && varst < 65){
            return 25;
        } else {
            return 40;
        }

    }

    public static class Main {
        public static void main(String[] args) {

           // exercitiu.curs.Exercitii.citireDoi();
           // exercitiu.curs.Exercitii.citire();
           // exercitiu.curs.Exercitii.numere
            //exercitiu.curs.Exercitii.multe();
           //exercitiu.curs.Exercitii.divizibile();
             //   exercitiu.curs.Exercitii.divide();
       //  exercitiu.curs.Exercitii.bar();
    //exercitiu.curs.Exercitii.foobar();
           //exercitiu.curs.Exercitii.putereaA4a();



        }


    }
}
