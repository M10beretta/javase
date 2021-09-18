package com.mber.topic.best_practice.husivm._390_scope_minimization_and_cycles_with_min_scoup;

import java.util.*;

//minimize scope
//initialize local when declare //exception try catch
//problem with while loop
//better enhanced for loop
//Filtering //Transforming //Parallel iteration
public class Main {
    enum Suit {CLUB, DIAMOND, HEART, SPADE}

    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>(List.of("2", "4", "5", "6", "21"));

        //bad
        /*Iterator<String> i  = collection.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }*/

        //best
        for (Iterator<String> i = collection.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }

        System.out.println();

        //best
        for (String s : collection) {
            System.out.print(s + " ");
        }


        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();

        //best
        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));

        System.out.println("\n" + deck.size());
    }

    static class Card {
        Suit suit;
        Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }
    }
}
