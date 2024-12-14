package Lista1.ex46ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;
    public static void main(String[]args){
        teclado= new Scanner(System.in);
        int[] vetor1;
        vetor1= new int[10];

        int[] vetor2;
        vetor2= new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os elementos do vetor 1");
            vetor1[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os elementos do vetor 2");
            vetor2[i] = teclado.nextInt();
        }
        int[] vetort;
        vetort= new int[20];


        int ivet1=0;
        int ivet2=0;

        for(int i=0;i<20;i++){
            if(i%2==0){
                vetort[i]=vetor1[ivet1];
                ivet1++;
            }else{
                vetort[i]=vetor2[ivet2];
                ivet2++;
            }
        }
        System.out.println("o vetor intercalado será: ");
        for(int i=0;i<20;i++){
            System.out.print(vetort[i]+" ");
        }

    }
}
