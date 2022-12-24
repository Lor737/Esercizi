import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class TuttiGliEsercizi
{
    public static void main(String[] args)
    {
        System.out.println("Scegli l'eserizio da vedere premendo i seguenti numeri:");
        System.out.println("1 - HelloWorld");
        System.out.println("2 - Rettangolo Nome");
        System.out.println("3 - Perimetro e Area di un Rettangolo");
        System.out.println("4 - Perimetro e Area di un Triangolo Rettangolo");
        System.out.println("5 - Perimetro e Area di un Cerchio");
        System.out.println("6 - Perimetro e Area di un Quadrato");
        System.out.println("7 - Calcolo Secondi");
        System.out.println("8 - Calcolo Giorni, Ore, Minuti e Secondi");
        System.out.println("9 - Somma di due numeri");
        System.out.println("10 - Calcolatrice");
        Scanner input = new Scanner(System.in);
        int NumeroEsercizio = input.nextInt();
        if (NumeroEsercizio == 1)
        {
            //Stampa della scritta Hello, World!
            System.out.println("Hello, World!");
        }
        if (NumeroEsercizio == 2)
        {
            System.out.println("Rettangolo Nome");
            System.out.println("+-------+");
            System.out.println("|Lorenzo|");
            System.out.println("+-------+");
        }
        if (NumeroEsercizio == 3)
        {
            //Calcolo area e perimetro di un rettangolo
            System.out.println("Calcolo area e perimetro di un rettangolo");
            System.out.println("inserisci la base");
            int base = input.nextInt(); //inserisci base
            System.out.println("inserisci l'altezza");
            int altezza = input.nextInt(); //inserisci l'altezza
            input.close();
            int perimetro = ((base*2) + (altezza*2));
            int area = base*altezza;
            System.out.println("Il perimetro del rettangolo è: " + perimetro);
            System.out.println("L'area del rettangolo è: " + area);
        }
        if (NumeroEsercizio == 4)
        {
            //Calcolo area e perimetro di un triangolo rettangolo
            System.out.println("Calcolo area e perimetro di un triangolo rettangolo");
            System.out.println("inserisci la base");
            float base = input.nextInt(); //inserisci base
            System.out.println("Inserisci l'altezza");
            float altezza = input.nextInt(); //inserisci altezza
            input.close();
            float area = (base * altezza)/2;
            double ipotenusa = sqrt((base*base) + (altezza*altezza));
            double perimetro = ipotenusa + base + altezza;
            System.out.println("Il perimetro del triangolo rettangolo è: " + perimetro);
            System.out.println("L'area del triangolo rettangolo è: " + area);
        }
        if (NumeroEsercizio == 5)
        {
            //Calcolo area e perimetro di un cerchio
            System.out.println("Calcolo area e perimetro di un cerchio");
            System.out.println("inserisci il raggio");
            float raggio = input.nextInt(); //inserisci il raggio
            input.close();
            double area = 3.14*raggio*raggio; //calcolo area cerchio
            double perimetro = 2*3.14*raggio; //calcolo perimetro cerchio
            System.out.println("L'area del cerchio è: " + area);
            System.out.println("Il perimetro del cerchio è: " + perimetro);
        }
        if (NumeroEsercizio == 6)
        {
            //Calcolo area e perimetro di un quadrato
            System.out.println("Calcolo area e perimetro di un quadrato");
            System.out.println("inserisci il lato");
            int lato = input.nextInt(); //inserisci lato
            input.close();
            int perimetro = (lato * 4);
            int area = lato*lato;
            System.out.println("Il perimetro del quadrato è: " + perimetro);
            System.out.println("L'area del quadrato è: " + area);
        }
        if (NumeroEsercizio == 7)
        {
            //Calcolo secondi da input: giorni, ore, minuti e secondi
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
        if (NumeroEsercizio == 8)
        {
            //Calcolo giorni, ore, minuti e secondi da totale secondi
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
        if (NumeroEsercizio == 9)
        {
            //Calcolo somma di due numeri in input
            System.out.println("Somma di due numeri in input");
            System.out.println("inserisci il pirmo numero");
            int numero1 = input.nextInt(); //inserisci il primo numero
            System.out.println("inserisci il secondo numero");
            int numero2 = input.nextInt(); //inserisci il secondo numero
            input.close();
            int somma = numero1 + numero2;
            System.out.println("La somma dei due numeri è: " + somma);
        }
        if (NumeroEsercizio == 10)
        {
            //Calcolo somma, differenza, moltiplicazione e divisione tra due numeri in input
            System.out.println("Calcolo somma, differenza, moltiplicazione e divisione tra due numeri in input");
            System.out.println("Inserisci l'operazione che vuoi fare, scrivi:");
            System.out.println("+ per la somma, - per la sottrazione, * per la moltiplicazione, / per la divisione");
            String operazione = input.next(); //inserisci l'operazione che si vuole fare

            //la stringa inserita finchè è diversa da "+" o "-" o "*" o "/" mi dà errore.
            //quando l'operazione è corretta allora esce dal ciclo while
            while (!(operazione.equals("+") || operazione.equals("-") || operazione.equals("*") || operazione.equals("/")))
            {
                System.out.println("Errore, riscrivi l'operazione da fare");
                operazione = input.next();
            }

            System.out.println("inserisci il primo numero.");
            double numero1 = input.nextDouble(); //inserisci il primo numero
            double numero2;  //definisco la variabile numero2

            //se l'operazione è la divisione allora inserisci un valore tranne lo 0.
            //e finchè il secondo numero è 0 mi dà errore.
            //quando il secondo numero è diverso da 0 allora esce dal ciclo while
            if (operazione.equals("/"))
            {
                System.out.println("inserisci il secondo numero tranne lo 0.");
                numero2 = input.nextDouble(); //inserisci il secondo numero
                while (numero2 == 0)
                {
                    System.out.println("Errore, riscrivi il secondo numero, tranne lo 0.");
                    numero2 = input.nextDouble(); //inserisci il secondo numero
                }
            }
            //altrimenti inserisci un qualsiasi valore compreso lo 0
            else
            {
                System.out.println("inserisci il secondo numero");
                numero2 = input.nextDouble(); //inserisci il secondo numero
            }
            input.close();

            //Se la stringa operazione è uguale a "+" allora stampa la somma dei due numeri
            if (operazione.equals("+"))
            {
                System.out.println("La somma tra i due numeri è: " + (numero1 + numero2));
            }
            //Se la stringa operazione è uguale a "-" allora stampa la sottrazione dei due numeri
            if (operazione.equals("-"))
            {
                System.out.println("La differenza tra i due numeri è: " + (numero1 - numero2));
            }
            //Se la stringa operazione è uguale a "*" allora stampa la moltiplicazione dei due numeri
            if (operazione.equals("*"))
            {
                System.out.println("La moltiplicazione tra i due numeri è: " + (numero1 * numero2));
            }
            //Se la stringa operazione è uguale a "/" allora stampa la divisione dei due numeri
            if (operazione.equals("/"))
            {
                System.out.println("La divisione tra i due numeri è: " + (numero1/numero2));
            }
        }
    }
}
