package org.example.oop.annalyns;

import static org.example.oop.annalyns.AnnalynsInfiltration.*;

public class MainAnnalynsInfiltration {
    public static void main(String[] args) {

        boolean knightIsAwake = true;
        System.out.println("Can a fast attack be made? " + canFastAttack(knightIsAwake));


        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println("Can the group be spied upon? " + canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));


        archerIsAwake =false;
        prisonerIsAwake =true;
        System.out.println("Can the prisoner be signalled? " + canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        boolean petDogIsPresent = false;
        System.out.println("Can the prisoner be freed? " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));

    }


}
