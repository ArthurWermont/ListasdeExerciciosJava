package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);

    Aluno aluno1=new Aluno();
        System.out.println("digite nome do aluno: ");
    aluno1.setNome(teclado.nextLine());
        System.out.println("AV1: ");
    aluno1.setAV1(teclado.nextFloat());
        System.out.println("AV2: ");
    aluno1.setAV2(teclado.nextFloat());

    aluno1.calcularMedia();
    }
}
