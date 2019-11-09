package com.udacity.guessTheMovie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class LoadMovie {
    ArrayList<String> movieList = new ArrayList<>();

    void loadMovieList(String pathToFile) {
        try {
            FileReader file = new FileReader(pathToFile);
            Scanner scan = new Scanner(file);

            try {
                while (scan.hasNextLine()) {
                    movieList.add(scan.nextLine());
                }
            } catch (NullPointerException e) {
                System.out.println("Błąd null: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Błąd: " + e.getMessage());;
        }

    }

    ArrayList<String> getMovieList() {
        return movieList;
    }
}
