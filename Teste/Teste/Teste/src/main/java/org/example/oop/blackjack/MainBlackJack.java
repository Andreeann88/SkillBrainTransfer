package org.example.oop.blackjack;

import static org.example.oop.blackjack.Blackjack.parseCard;

public class MainBlackJack {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();

        int primacarte = Blackjack.parseCard("ace");
        int aDouacarte = Blackjack.parseCard("king");

        String rezultat = blackjack.firstTurn("king","ace","ace");
        System.out.println(rezultat);

    }
}
