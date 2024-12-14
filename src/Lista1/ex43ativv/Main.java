package Lista1.ex43ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;
    public static void main(String[]args){
        teclado= new Scanner(System.in);
        int quatAlunos=10;
        int quanNotas=4;
        float[] notas = new float[4];
        float[] medias = new float[10];

        for(int i=0;i<quatAlunos;i++) {
            float soma = 0;
            System.out.printf("digite as notas do aluno %d: ", i+1);
            for(int j = 0; j < quanNotas; j++) {

                notas[j] = teclado.nextFloat();
                soma += notas[j];
            }
            medias[i] = soma / 4;

        }
        for(int i=0;i<quatAlunos;i++) {
            System.out.printf("a media do aluno %d é o seguinte: %.2f%n",i+1, medias[i]);
        }
    }
}