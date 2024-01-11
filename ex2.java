import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int option;
        double cm3 = 1;
        do {
            System.out.println("1. Liquidos o 2. Solidos");
            option = sc.nextInt();
        } while (option != 1 && option != 2);

        if (option == 1) {   
            System.out.println("Cuantos cm de radio tiene la cisterna?");
            double radio = sc.nextDouble();
            System.out.println("Cuantos cm de longitud tiene la cisterna?");
            double longitud = sc.nextDouble();
            cm3 = volumCilindre(radio, longitud);
        } else if (option == 2) {
            System.out.println("Cuantos mide la arista 1?");
            double arista1 = sc.nextDouble();
            System.out.println("Cuantos mide la arista 2?");
            double arista2 = sc.nextDouble();
            System.out.println("Cuantos mide la arista 3?");
            double arista3 = sc.nextDouble();
            cm3 = volumPrismaRectangular(arista1, arista2, arista3);
        }
        System.out.println("Cuantos metros cubicos hay que transportar?");
        double m3 = sc.nextDouble();
        System.out.println("El camion tiene capacidad para " + cm3 + " centimetros cubicos");
        System.out.println("Caben " + cm3/1000000 + " metros cubicos");
        cm3 = cm3/1000000;
        double viajes = m3/cm3;
        viajes = Math.ceil(viajes);
        System.out.println("Hay que hacer " + viajes + " viajes");
        sc.close();
    } 
    static double volumCilindre(double radio, double longitud){
        double volumen = Math.PI * Math.pow(radio, 2) * longitud;
        return volumen;
    }
    static double volumPrismaRectangular(double arista1, double arista2, double arista3){
        double volumen = arista1 * arista2 * arista3;
        return volumen;
    }
}
