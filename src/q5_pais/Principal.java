package q5_pais;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pais pais1 = new Pais("BRA", "Brasil", 8.515767046);
        Pais pais2 = new Pais("USA", "Estados Unidos da America", 9.834000);

        System.out.println("O ISO do " + pais1.nome + " é: " + pais1.ISO + " e sua dimensão é: " + pais1.dimensão);
        System.out.println("O ISO do " + pais2.nome + " é: " + pais2.ISO + " e sua dimensão é: " + pais2.dimensão);


        pais1.setPopulação(193.946886);
        pais2.setPopulação(333000000);
        System.out.println(" a população do "+pais1.nome+" : "+ pais1.getPopulação());
        System.out.println(" a população do "+pais2.nome+" : "+ pais2.getPopulação());

        System.out.println("-----------------------------------");

        int num=0;
        System.out.println("1(densidade do "+pais1.nome+")"+"2(densidade do "+pais2.nome+")");
        num= teclado.nextInt();
        switch (num){
            case 1 :
                pais1.Densidade();
                break;
            case 2:
                pais2.Densidade();
                break;
        }

        if (pais1.isIgual(pais2)) {
            System.out.println("O país 1 e o país 2 são o mesmo!");
        } else {
            System.out.println("O país 1 e o país 2 são diferentes!");
        }
    }
}

