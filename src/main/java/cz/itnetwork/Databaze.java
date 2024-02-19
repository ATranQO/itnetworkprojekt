package cz.itnetwork;

import java.util.ArrayList;
import java.util.Arrays;

public class Databaze {

    // Seznam pojištěnců v databázi
    private ArrayList<Pojistenec> seznamPojistencu = new ArrayList<>();

    // List pro validaci čísel
    private ArrayList<String> validaceCisla = new ArrayList<>();

    // List pro uchování délek jmen pojištěnců
    private ArrayList<Integer> delkaJmen = new ArrayList<>();

    // Pole pro validaci čísel jako pole znaků
    private String[] validaceCislaPole;

    // Proměnné pro validaci čísel
    private String cisla, doplneniCisla = "";
    private int delkaCisla;

    // Metoda pro přidání záznamu pojištěnce do databáze
    public void pridejZaznam(String jmeno, String prijmeni, String telefon, String vek) {
        seznamPojistencu.add(new Pojistenec(jmeno, prijmeni, telefon, vek));
    }

    // Metoda pro vrácení seznamu všech pojištěnců
    public ArrayList<Pojistenec> najdiZaznamy() {
        return seznamPojistencu;
    }

    // Metoda pro validaci telefonního čísla
    public String validaceCisla(String telefon) {
        // Převedení čísla na pole znaků
        validaceCislaPole = new String[telefon.length()];
        validaceCislaPole = telefon.split("");
        validaceCisla.addAll(Arrays.asList(validaceCislaPole));
        telefon = "";
        cisla = "0123456789";
        // Validace čísel a přidání pouze čísel do řetězce telefon
        for (String c : validaceCisla) {
            if ((!c.isBlank()) && (cisla.contains(c))) {
                telefon += c;
            }
        }
        // Doplnění nulami, pokud číslo není dostatečně dlouhé
        if (telefon.length() < 9) {
            delkaCisla = telefon.length();
            for (int i = delkaCisla; i < 9; i++) {
                doplneniCisla += "0";
            }
            telefon = doplneniCisla + telefon;
        }
        // Zkrácení čísla na devět znaků
        telefon = telefon.substring(telefon.length() - 9, telefon.length());
        return telefon;
    }

    // Metoda pro validaci věku
    public String validaceVeku(String vek) {
        // Přidání nuly, pokud je věk jednociferný
        if (vek.length() < 2) {
            vek = "0" + vek;
        }
        return vek;
    }
}
