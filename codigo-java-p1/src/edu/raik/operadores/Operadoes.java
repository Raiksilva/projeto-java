package edu.raik.operadores;

public class Operadoes {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

        //Qual o resultado das expressões abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        
        System.out.println("Primeiro teste concatenação: " + concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println("Segundo teste concatenação: " + concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println("ultimo teste concatenação: " + concatenacao);
        // As expressões se tornam em String(texto) a parti do momento que o java encontra uma String.
        // No último caso o algoritmo primeiro realizou a soma das evidências e depois a concatenação.

        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);
        //incrementando numero em mais 1 numero, imprime 6
        System.out.println(numero);
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println("Incremento: " + numero);
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println("Forma de incremento errada: " + numero ++);// ops algo de errado não está certo

        System.out.println("resultado: " + numero);// agora sim, numero virou 7

        System.out.println("Incremento da forma certa: " + ++ numero); //ordem de precedencia conta aqui

        boolean verdadeiro = true;
        //boolean verdadeiro = !true;
        System.out.println(verdadeiro);
        System.out.println("Inverteu " + !verdadeiro);

        // if ternario 

        int a, b;
        a = 6; 
        b = 5;

        String resultado = a ==b ? "verdadeiro" : "falso";
         
        System.out.println("resultado if ternario: " + resultado);
    }
}
