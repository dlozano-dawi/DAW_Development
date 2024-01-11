import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean op = true;
        while (op) {
            op = menu();
        }
        sc.close();
    }  
    static void decimalBinari(double num){
        int multiplicador = 1;
        int contador = 0;
        int max;
        while (multiplicador < num){
            multiplicador *= 2;
            contador++;
        }
        max = contador;
        while (contador >= 0) {
            if (num >= multiplicador){
                num -= multiplicador;
                multiplicador /= 2;
                System.out.print(1);
                contador--;
            } else {
                multiplicador /= 2;
                if (max != contador){
                    System.out.print(0);
                }
                contador--;
            }
        }
        System.out.println(); 
    }
    static void binariDecimal(long numDec){
        int multiplicador = 1;
        int total = 0;
        while (numDec > 0) {
            if(numDec % 2 == 0){
                numDec /= 10;
                multiplicador *= 2;
            } else {
                total += multiplicador;
                numDec /= 10;
                multiplicador *= 2;
            }
        }
        System.out.println(total);
    }
    static boolean esParell(int numPar){
        if (numPar%2 == 0){
            return true;
        }
        return false;
    }
    static void primersNombresParells(int numsPar){
        for (int i = 0; i <= numsPar; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
    static boolean menu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Elige una de las siguientes opciones:");
        System.out.println("1. Decimal a binario");
        System.out.println("2. Binario a decimal");
        System.out.println("3. Es Parell?");
        System.out.println("4. Calcular parells de 0 fins a n");
        System.out.println("0. Sortir");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("EX1.- Introduce un numero Decimal");
                double decNum = sc.nextDouble();
                decimalBinari(decNum);
                break;
                
                case 2:
                System.out.println("EX2.- Introduce un numero en Binario");
                long binNum = sc.nextLong();
                binariDecimal(binNum);
                break;
        
            case 3:
                System.out.println("EX3.- Introduce un numero para saber si es par");
                int par = sc.nextInt();
                System.out.println(esParell(par));
                break;
        
            case 4:
                System.out.println("EX4.- Introduce un numero para ver todos los numeros pares entre 0 y n");
                int numsPar = sc.nextInt();
                primersNombresParells(numsPar);
                break;
        
            case 0:
            return false;
            default:
                System.out.println("Invalid option");
                break;
        }
        return true;
    }
    
}