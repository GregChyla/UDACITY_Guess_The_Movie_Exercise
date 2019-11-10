package com.udacity.guessTheMovie;

import java.util.ArrayList;
import java.util.Set;

class PrintData {
    void printTitle(Set<Character> givenSet, ArrayList<Character> pickedTitle) {
        for (Character c : pickedTitle) {
            if (givenSet.contains(c)) {
                System.out.print(c);
            } else if (!c.equals(' ')){
                System.out.print("_");
            } else
                System.out.print(" ");
        }
        System.out.println();
    }
    void printArray(Set<Character> givenSet) {
        givenSet.forEach(System.out::print);
    }
}
