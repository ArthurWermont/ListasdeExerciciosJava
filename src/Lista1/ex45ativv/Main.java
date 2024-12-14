package Lista1.ex45ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;
    public static void main(String[]args){
        teclado= new Scanner(System.in);
        int quatPessoas=5;
        int [] idade=new int[5];
        double [] altura= new double[5];

        for(int i=0;i<quatPessoas;i++) {
            System.out.println("coloque a idade da pessoa "+(i+1)+" :");
            idade[i]=teclado.nextInt();
            System.out.println("coloque a altura da pessoa "+(i+1)+" :");
            altura[i]=teclado.nextDouble();
        }
        for(int i=4;i>=0;i--){
            System.out.printf("a pessoa %d tem a idade %d e a altura %.2f metros.%n",(i+1),idade[i],altura[i]);
        }


    }
}