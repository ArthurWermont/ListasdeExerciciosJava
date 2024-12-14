package Lista1.ex36ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int num;
        int n1;
        int n2;
        System.out.println("coloque o numero a ser verificado no intervalo: ");
        num = teclado.nextInt();

        System.out.println("coloque o primeiro numero do intervalo: ");
        n1 = teclado.nextInt();

        System.out.println("coloque o segundo numero do intervalo:  ");
        n2 = teclado.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        if (num >= menor && num <= maior) {
            System.out.println("esse numero inteiro está contido no intervalo!");
        } else {
            System.out.println("esse numero inteiro não está contido no intervalo!");
        }
    }
}