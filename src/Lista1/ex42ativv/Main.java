package Lista1.ex42ativv;

import java.util.Scanner;

public class Main {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        int[] vt = new int[20];
        int[] vp = new int[20];
        int[] vi = new int[20];

        int qntdPar = 0;
        int qntdImpar = 0;

        for (int num = 0; num < 20; num++) {
            System.out.printf("digitar numero: ");
            vt[num] = teclado.nextInt();
        }

        int parIndex = 0;
        int imparIndex = 0;

        for (int num = 0; num < 20; num++) {
            if (vt[num] % 2 == 0) {
                vp[parIndex] = vt[num];
                parIndex++;
                qntdPar++;
            } else {
                vi[imparIndex] = vt[num];
                imparIndex++;
                qntdImpar++;
            }
        }

        System.out.println("o vetor total é: ");
        for (int num = 0; num < 20; num++) {
            System.out.printf(" %d ", vt[num]);
        }
        System.out.println();

        System.out.println("o vetor impar é: ");
        for (int num = 0; num < qntdImpar; num++) {
            System.out.printf(" %d ", vi[num]);
        }
        System.out.println();

        System.out.println("o vetor par é: ");
        for (int num = 0; num < qntdPar; num++) {
            System.out.printf(" %d ", vp[num]);
        }
    }
}

