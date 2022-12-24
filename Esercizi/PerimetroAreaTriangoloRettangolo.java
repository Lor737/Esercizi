import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class PerimetroAreaTriangoloRettangolo
{
    public static void main(String[] args)
    {
        //Calcolo area e perimetro di un triangolo rettangolo
        Scanner input = new Scanner(System.in);
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
}
