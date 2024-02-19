package cz.itnetwork;
import java.util.Scanner;

// Třída reprezentující pojistného
public class Pojistenec {
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    // Evidence pojistného
    private Evidence evidence = new Evidence();

    // Informace o pojistném
    private String jmeno, prijmeni, telefon, vek;
    private String textMezeraJmeno, textMezeraPrijmeni, textMezeraTelefon;
    private int mezeraJmeno, mezeraPrijmeni, mezeraTelefon;


    // Konstruktor třídy Pojistenec
    public Pojistenec(String jmeno, String prijmeni, String telefon, String vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
        this.vek = vek;
    }

    // Metoda pro získání jména
    public String getJmeno() {
        return jmeno;
    }

    // Metoda pro získání příjmení
    public String getPrijmeni() {
        return prijmeni;
    }

    // Přepisuje metodu toString() třídy Object pro získání textové reprezentace instance
    @Override
    public String toString() {
        // Vypočítání mezer pro zarovnání
        mezeraJmeno = 13 - jmeno.length();
        mezeraPrijmeni = 16 - prijmeni.length();
        mezeraTelefon = 18 - telefon.length();

        // Inicializace textových mezer
        textMezeraJmeno = " ";
        textMezeraPrijmeni = " ";
        textMezeraTelefon = " ";

        // Vytvoření textových mezer
        for(int i = 0; i < mezeraJmeno; i++) {
            textMezeraJmeno += " ";
        }
        for(int i = 0; i < mezeraPrijmeni; i++) {
            textMezeraPrijmeni += " ";
        }
        for(int i = 0; i < mezeraTelefon; i++) {
            textMezeraTelefon += " ";
        }

        // Sestavení řetězce s informacemi o pojistném
        String pojisteny = jmeno.substring(0, 1).toUpperCase() + jmeno.substring(1).toLowerCase() + textMezeraJmeno
                + prijmeni.substring(0, 1).toUpperCase() + prijmeni.substring(1).toLowerCase() + textMezeraPrijmeni
                + telefon + textMezeraTelefon + vek + "\n";
        return pojisteny;
    }
}

