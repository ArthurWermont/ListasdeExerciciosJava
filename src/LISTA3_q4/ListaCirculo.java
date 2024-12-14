package LISTA3_q4;

import java.util.ArrayList;
import java.util.Scanner;
public class ListaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Circulo>circulos = new ArrayList<>();

        System.out.println("coloque a raio do Circulo 1: ");
        double raio1 = teclado.nextDouble();
        Circulo circulo1 = new Circulo("Círculo 1", raio1);
        circulos.add(circulo1);

        System.out.println("coloque a raio do Circulo 2: ");
        double raio2 = teclado.nextDouble();
        Circulo circulo2 = new Circulo("Círculo 2", raio2);
        circulos.add(circulo2);

        System.out.println("coloque a raio do Circulo 3: ");
        double raio3 = teclado.nextDouble();
        Circulo circulo3 = new Circulo("Círculo 3", raio3);
        circulos.add(circulo3);

        System.out.println("coloque a raio do Circulo 4: ");
        double raio4 = teclado.nextDouble();
        Circulo circulo4 = new Circulo("Círculo 4", raio4);
        circulos.add(circulo4);

        System.out.println("coloque a raio do Circulo 5: ");
        double raio5 = teclado.nextDouble();
        Circulo circulo5 = new Circulo("Círculo 5", raio5);
        circulos.add(circulo5);

        //perguntar para teacher pq o nome "circulo".
        try {
            for (Circulo circulo : circulos) {
                System.out.println("A area do " + circulo.getNome() + " será: " + circulo.Area());
            }
        } catch (Exception e) {
            System.out.println("ISSO NAO PODE NAO VIUNNN");
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
