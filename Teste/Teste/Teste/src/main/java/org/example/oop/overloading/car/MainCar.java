package org.example.oop.overloading.car;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Zambila");
        // Car - clasa car1 = obiect / nume obiect
        //new = keywordb CAr () = constructor
        // new Car() - instanta
        Car car2 = new Car();
        Car car3 = new Car ("Supermasina", "negru");
        Car car4 = new Car("Masina4", "albastra", "vw");

        System.out.println(car3.getNume());
        System.out.println(car3.getNume() + "" + car3.getCuloare());
        System.out.println(car4.getNume() + "" + car4.getCuloare() + "" + car4.getMarca());

        SportCar sportsCar = new SportCar("maria","alb","dacia");
        sportsCar.printDetails("");
        sportsCar.printDetails("","");
        sportsCar.printDetails("","","");

    }
}
