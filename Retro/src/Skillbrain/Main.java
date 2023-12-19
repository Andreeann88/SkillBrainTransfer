package Skillbrain;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti varsta:");
        Scanner cititor = new Scanner(System.in);
        int varsta = cititor.nextInt();
        int voucher = curs2.acordareVouchere(varsta);
        System.out.println("Voucherul obtinut este in valoare de:" + voucher + "de lei");
    }
}
