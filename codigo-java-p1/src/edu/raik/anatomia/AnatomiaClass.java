package edu.raik.anatomia;
public class AnatomiaClass{

    public static void main(String[] args) throws Exception {

        String primeiroNome = "Raik";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}