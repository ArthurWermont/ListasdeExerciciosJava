package q4_circulo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        circulo circulo1 = new circulo(15,4);
        circulo circulo2 = new circulo(20);
        System.out.println("1(Funçao Inflar), 2(Função Desinflar),3(Funçao Area)");
        int numeros=0;

        while (numeros != 1 && numeros != 2 && numeros != 3) {
            numeros = teclado.nextInt();

            switch (numeros) {
                case 1:
                    circulo1.Inflar();
                    break;
                case 2:
                    circulo1.Desinflar();
                    break;
                case 3:
                    circulo1.Area();
                    break;
                default:
                    System.out.println("Nenhum dos números acima foi digitado, digite 1 (Função Inflar), 2 (Função Desinflar), 3 (Função Área)");

                    break;
            }
        }

    }

}