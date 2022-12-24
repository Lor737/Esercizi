import java.util.Scanner;

public class CalcoloSecondi
{
    public static void main(String[] args)
    {
        //Calcolo secondi da input: giorni, ore, minuti e secondi
        Scanner input = new Scanner(System.in);
        System.out.println("Calcolo secondi da input: giorni, ore, minuti e secondi");
        System.out.println("inserisci i giorni");
        int giorni = input.nextInt(); //inserisci i giorni
        System.out.println("inserisci le ore");
        int ore = input.nextInt(); //inserisci le ore
        System.out.println("inserisci i minuti");
        int minuti = input.nextInt(); //inserisci i minuti
        System.out.println("inserisci i secondi");
        int secondi = input.nextInt(); //inserisci i secondi
        input.close();
        int giorni_in_secondi = giorni * 24 * 60 * 60; //converto i giorni in secondi
        int ore_in_secondi = ore * 60 * 60; //converto le ore in secondi
        int minuti_in_secondi = minuti * 60; //converto i minuti in secondi
        //faccio la somma: secondi dai giorni, secondi dalle ore, secondi dai minuti, l'input secondi
        int totale_secondi = giorni_in_secondi + ore_in_secondi + minuti_in_secondi + secondi;
        System.out.println("I secondi totali sono: " + totale_secondi);
    }
}
