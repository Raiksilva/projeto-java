import java.util.Locale;
import java.util.Scanner;

public class Boletim{
    public static void main (String [] args){
        int mediaAv1;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("digite sua nota: ");
        mediaAv1 = scanner.nextInt();

        if (mediaAv1 < 4){
            System.out.println("Reprovado!");
        }
        else if (mediaAv1 > 4 && mediaAv1 < 6 ){
            System.out.println("A baixo da média, tente melhorar na proxima!!");
        }
        else{
            System.out.println("Aprovado!!!");
        }
    }
}
