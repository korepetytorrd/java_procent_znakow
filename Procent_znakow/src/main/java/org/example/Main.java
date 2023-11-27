package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String tekst = "Przykładowy tekst do zliczenia znaków.";

        Map<Character, Integer> mapaZnakow = zliczZnaki(tekst);
        int dlugoscTekstu = tekst.length();

        System.out.println("Znaki w tekście i ich procentowa ilość:");

        for (Map.Entry<Character, Integer> entry : mapaZnakow.entrySet()) {
            char znak = entry.getKey();
            int ilosc = entry.getValue();
            double procent = (ilosc / (double) dlugoscTekstu) * 100;

            System.out.println("'" + znak + "': " + ilosc + " (" + String.format("%.2f", procent) + "%)");
        }
    }

    private static Map<Character, Integer> zliczZnaki(String tekst) {
        Map<Character, Integer> mapaZnakow = new HashMap<>();

        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);

            // Jeśli znak już występuje w mapie, zwiększ ilość, w przeciwnym razie dodaj nowy klucz z ilością 1
            mapaZnakow.put(znak, mapaZnakow.getOrDefault(znak, 0) + 1);
        }

        return mapaZnakow;
    }
}
