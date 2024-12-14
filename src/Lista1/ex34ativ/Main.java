package Lista1.ex34ativ;

import java.util.Scanner;
public class Main{
    private static Scanner teclado;
    public static void main(String[]args){
        int qtdnum=10;
        int[]num=new int[10];

        teclado= new Scanner(System.in);

        for(int numeros=0;numeros<num.length;numeros++){
            System.out.printf("coloque um numero a seguir: ");
            num[numeros] = teclado.nextInt();
        }

        int maior=num[0];
        int menor=num[0];
        for(int pos=0;pos<10;pos++){
            if(num[pos]>=maior){
                maior=num[pos];
            }
            if(num[pos]<=menor){
                menor=num[pos];
            }
        }
        System.out.println("o numero maior é: "+maior);
        System.out.println("o numero menor é: "+menor);

        float soma=maior+menor;
        float media=soma/2;

        System.out.println("a soma do "+maior+"+"+menor+" é: "+soma);
        System.out.println("a media deles é: "+media);
    }
}
