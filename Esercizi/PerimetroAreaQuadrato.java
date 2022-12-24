import java.util.Scanner;

public class PerimetroAreaQuadrato
{
    public static void main(String[] args)
    {
        //Calcolo area e perimetro di un quadrato
        Scanner input = new Scanner(System.in);
        System.out.println("Calcolo area e perimetro di un quadrato");
        System.out.println("inserisci il lato");
        int lato = input.nextInt(); //inserisci lato
        input.close();
        int perimetro = (lato * 4);
        int area = lato*lato;
        System.out.println("Il perimetro del quadrato è: " + perimetro);
        System.out.println("L'area del quadrato è: " + area);
    }
}
