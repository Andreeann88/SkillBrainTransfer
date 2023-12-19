package org.example.oop.lasagna;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int minuteInCuptor) {
        return Math.max(0, expectedMinutesInOven() - minuteInCuptor);
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int minute) {
        return preparationTimeInMinutes(layers) + minute;
    }

/*
    public static int expectedMinutesInOven(){
     Lasagna lasagna = new Lasagna();
     lasagna.expectedMinutesInOven();
     return 40;
    }
    public static int remainingMinutesInOven(int minuteInCuptor) {
        Lasagna lasagna = new Lasagna();
     lasagna.remainingMinutesInOven(30);
     return Math.max(0, expectedMinutesInOven() - minuteInCuptor);
    }
    public static int preparationTimeInMinutes(int layers){
        Lasagna lasagna = new Lasagna();
        lasagna.preparationTimeInMinutes(2);
        return layers * 2;
    }
    public static int totalTimeInMinutes(int layers, int minute){
        Lasagna lasagna = new Lasagna();
        lasagna.totalTimeInMinutes(3, 20);
        return totalTimeInMinutes(3,20);

    }
*/
}
