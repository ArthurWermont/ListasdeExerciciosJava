package q7_Arraylist;
import java.util.Scanner;
public class Maincon {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    Conjunto A =new Conjunto();
    A.addElemento("Arthur Wermont");
    A.addElemento("Levi");
    A.addElemento("Luis");

    Conjunto B = new Conjunto();
    B.addElemento("Soares");
    B.addElemento("Tito");
    B.addElemento("Savas");
    B.addElemento("Arthur Wermont");

    System.out.println("1(chamar a funçao uniao e exibir o conjunto A junto com o conjunto B)");
    System.out.println("2(chamar a funçao inter e exibir apenas o que tem de igual entre o conjunto A e o B)");
    System.out.println("3(chamar a funçao menos e exibir apenas oq tem de diferente entre A e B-->(A-B)");

    int num = teclado.nextInt();

    switch (num) {
        case 1:
        //criaçao de um novo conjunto para exibir a Uniao entre A e B.
        Conjunto C = A.uniao(B);

        C.exibir();

        System.out.println("-----------------------------");
    break;
        case 2:
        //criaçao de um novo conjunto para exibir apenas oq tem de igual entre A e B.
        Conjunto D = A.inter(B);

        D.exibir();

        System.out.println("-----------------------------");
    break;
        case 3:
        //criaçao de um novo conjunto para exibir apenas oq tem de diferente entre A e B.(A-B)
        Conjunto E = A.menos(B);

        E.exibir();
    break;
        default://opicional
            System.out.println("nenhum dos numeros é valido para chamar algum dos metodos.");
            break;//opicional.
    }

    }
}
