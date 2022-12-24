import java.util.Scanner;

public class SommaNumeri
{
    public static void main(String[] args)
    {
        //Calcolo somma di due numeri in input
        Scanner input = new Scanner(System.in);
        System.out.println("Somma di due numeri in input");
        System.out.println("inserisci il pirmo numero");
        int numero1 = input.nextInt(); //inserisci il primo numero
        System.out.println("inserisci il secondo numero");
        int numero2 = input.nextInt(); //inserisci il secondo numero
        input.close();
        int somma = numero1 + numero2;
        System.out.println("La somma dei due numeri è: " + somma);
    }
}
