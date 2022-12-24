import java.util.Scanner;

public class CalcoloGiorniOreMinutiSecondi
{
    public static void main(String[] args)
    {
        //Calcolo giorni, ore, minuti e secondi da totale secondi
        Scanner input = new Scanner(System.in);
        System.out.println("Calcolo giorni, ore, minuti e secondi da totale secondi");
        System.out.println("inserisci i secondi");
        int totalesecondi = input.nextInt(); //inserisci i secondi totali
        input.close();

        //calcolo i giorni totali dividendo i totali secondi per 86400. 1 giorno = 86.400 secondi
        //siccome giorni è una variabile int, la divisione mi dà la parte intera della divisione.
        //Esempio: ho 180.122 secondi, 180.122/86400 = 2,08474537037037.... quindi giorni = 2
        int giorni = (totalesecondi/86400);

        //calcolo le ore totali dividendo i totali secondi per 3600. 1 ora = 3600 secondi
        //Esempio: ho 180.122 secondi, 180.122/3600 = 50,0338888... quindi ho come ore totali 50
        //In queste 50 ore sono inclusi i 2 giorni, perciò devo togliere dalle ore i 2 giorni
        //Converto i 2 giorni in ore moltiplicandoli per 24, perciò 2*24 = 48 ore
        //Faccio la differenza: 50 ore totali - 48 ore dei 2 giorni = 2 ore
        int ore = (totalesecondi/3600) - ((totalesecondi/86400)*24);

        //calcolo i minuti totali dividendo i totale secondi per 60. 1 minuti = 60 secondi
        //Esempio: ho 180.122 secondi, 180.122/60 = 3002,0333.... quindi ho come minuti totali 3002
        //In questi 3002 minuti sono incluse le 50 ore, perciò devo togliere dai minuti le 50 ore.
        //Converto le 50 ore in minuti moltiplicandoli per 60, perciò 50*60 = 3000 minuti
        //Faccio la differenza:  3002 minuti totali - 3000 minuti dalle ore = 2 minuti
        int minuti = (totalesecondi/60) - ((totalesecondi/3600)*60);

        //calcolo i minuti totali dividendo i totale secondi per 60. 1 minuti = 60 secondi
        //Esempio: ho 180.122 secondi, 180.122/60 = 3002,0333.... quindi ho come minuti totali 3002
        //perciò devo togliere dal totale secondi i 3002 minuti.
        //Converto i 3002 minuti moltiplicandoli per 60, perciò 3002*60 = 180.120 secondi
        //Faccio la differenza: 180.122 secondi totali - 180.120 secondi dai minuti = 2 secondi
        int secondi = totalesecondi - ((totalesecondi/60)*60);
        System.out.println("giorni: " + giorni + ", ore: " + ore + ", minuti: " + minuti  + ", secondi: " + secondi);
    }
}
