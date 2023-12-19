package pachet;

import exercitiu.curs;

import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            System.out.println("Introduceti varsta:");
            Scanner cititor = new Scanner(System.in);
            int varst = cititor.nextInt();
            int voucher = curs.acordareVouchere(varst);
            System.out.println("Voucherul obtinut este in valoare de:" + voucher + "de lei");


        }


    }
