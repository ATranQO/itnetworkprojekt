package cz.itnetwork;

import java.util.Scanner;

public class JednoduchyProjekt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");

        // Vytvoření instance třídy Evidence pro manipulaci se záznamy
        Evidence evidence = new Evidence();
        String volba;

        // Smyčka pro opakování nabídky a zpracování volby uživatele
        do {
            evidence.vypisUvodniObrazovku();
            volba = scanner.nextLine();
            System.out.println(" ");

            // Zpracování volby uživatele pomocí přepínače
            switch (volba) {
                case "1" -> evidence.pridejZaznam();
                case "2" -> evidence.vypisZaznamy();
                case "3" -> evidence.vyhledejZaznamy();
                case "4" -> System.out.println("Děkuji za použití programu");
                default -> System.out.println("Neplatná volba!");
            }
        } while (!volba.equals("4"));
    }
}
