package Lista1.ex39ativv;

import java.util.Scanner;
public class idadep {
    private static Scanner teclado;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float soma = 0;
        float media=0;
        int maior=0,menor=1000000000;
        int pessoas=0;
        int idade;

        System.out.println("coloque a idade das pessoas ( 0 para encerrar ) : ");
        do {
            idade= teclado.nextInt();

            if (idade == 0) {
                break;
            }

            if (idade < menor ) {
                menor = idade;
            }

            if (idade > maior ) {
                maior = idade;
            }
            pessoas+=1;
            soma += idade;

        }while(idade !=0);


        if (pessoas > 0) {
            media = (soma/pessoas);
            System.out.println("numero de pessoas é: "+pessoas);
            System.out.printf("a idade media do grupo é: %.2f%n", media);
            System.out.println("maior idade é: "+maior);
            System.out.println("menor idade é: "+menor);

        }else{
            System.out.println("nenhuma idade foi inserida.");
        }
    }
}