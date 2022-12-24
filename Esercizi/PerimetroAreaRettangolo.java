import java.util.Scanner;

public class PerimetroAreaRettangolo
{
    public static void main(String[] args)
    {
        //Calcolo area e perimetro di un rettangolo
        Scanner input = new Scanner(System.in);
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
}
