import java.util.Scanner;

public class PerimetroAreaCerchio
{
    public static void main(String[] args)
    {
        //Calcolo area e perimetro di un cerchio
        Scanner input = new Scanner(System.in);
        System.out.println("Calcolo area e perimetro di un cerchio");
        System.out.println("inserisci il raggio");
        float raggio = input.nextInt(); //inserisci il raggio
        input.close();
        double area = 3.14*raggio*raggio; //calcolo area cerchio
        double perimetro = 2*3.14*raggio; //calcolo perimetro cerchio
        System.out.println("L'area del cerchio è: " + area);
        System.out.println("Il perimetro del cerchio è: " + perimetro);
    }
}
