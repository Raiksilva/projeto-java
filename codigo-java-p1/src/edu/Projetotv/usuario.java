package edu.Projetotv;

public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal atual: " + smartTv.canal);
        
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        

    }
}
