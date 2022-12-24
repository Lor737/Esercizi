import java.util.Scanner;

public class Calcolatrice
{
    public static void main(String[] args)
    {
        //Calcolo somma, differenza, moltiplicazione e divisione tra due numeri in input
        Scanner input = new Scanner(System.in);
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
