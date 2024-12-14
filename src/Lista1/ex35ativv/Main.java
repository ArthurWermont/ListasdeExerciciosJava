package Lista1.ex35ativv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int contador;
        int numero;
        System.out.println("a quantidade de numeros: ");
        numero = input.nextInt();

        for (int i = 0; i < numero; i++){
            contador = 0;
            System.out.println("o "+(i+1)+ " numeros: ");
            x = input.nextInt();

            for (int j = 2; j < x; j++){
                if (x % j == 0){
                    contador++;
                }
            }
            if (contador == 0){
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }
}
