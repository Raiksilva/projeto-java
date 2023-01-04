package edu.raik.anatomia;
import java.util.Scanner;

public class BoletimEstutantil {
    public static void main (String [] args){
        int mediaAv1;
        Scanner s = new Scanner(System.in);
        System.out.println("digite sua nota: ");
        mediaAv1 = s.nextInt();

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
