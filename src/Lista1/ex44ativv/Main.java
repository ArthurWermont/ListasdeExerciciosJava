package Lista1.ex44ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;
    public static void main(String[]args){
        teclado= new Scanner(System.in);
        int []vetor= new int[5];

        int soma=0;
        int mult=1;

        for(int i=0;i<5;i++){

            System.out.print("digitar numero posição "+(i+1)+" do vetor: ");
            vetor[i]=teclado.nextInt();

            soma += vetor[i];
            mult *= vetor[i];
        }

        System.out.println("os numeros do vetor é: ");
        for(int i=0;i<5;i++){

            System.out.println(vetor[i]);
        }

        System.out.println(" a soma do vetor é: "+ soma);
        System.out.println(" a multiplicação do vetor é: "+ mult);

    }
}