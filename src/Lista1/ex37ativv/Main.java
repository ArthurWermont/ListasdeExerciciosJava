package Lista1.ex37ativv;

import java.util.Scanner;
public class Main{
    private static Scanner teclado;
    public static void main(String[]args){
        int numero=0;
        teclado = new Scanner(System.in);
        System.out.print("coloque um numero entre 12 a 20 : ");
        numero=teclado.nextInt();

        do{
            if(numero <12 || numero>20){
                System.out.print("Entrada inválida, digite o numero entre 12 a 20 novamente: ");
                numero = teclado.nextInt();
            }

        }while(numero <12 || numero>20);
        System.out.print("o numero que voce digitou é "+numero);


    }

}