package org.example.oop.overloading.car;

public class SportCar extends Car{
    public SportCar(String nume, String culoare, String marca){
        super(nume, culoare, marca);
    }
    @Override
    public void printDetails(String option1, String option2, String option3){
        System.out.println("Suprascriere: numele, culoare, marca - masina"
        +getNume() + "" + getCuloare() + "" + getMarca());
        super.printDetails("", "","");
    }

}
