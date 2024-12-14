package q2_pessoas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ponto2d ponto = new Ponto2d();
        Ponto2d ponto2 = new Ponto2d(10, 20);
        Ponto2d ponto3= new Ponto2d(ponto2);

        //mostrando os pontos.
        System.out.println("ponto X: (" +ponto.getPontoX()+ "), ponto Y: ("+ ponto.getPontoY()+")");
        System.out.println("ponto2 X: (" +ponto2.getPontoX()+ "), ponto2 Y: ("+ ponto2.getPontoY()+")");
        System.out.println("ponto3 X: (" +ponto3.getPontoX()+ "), ponto3 Y: ("+ ponto3.getPontoY()+")");
        System.out.println("---------------------------------------------------------------------------");
        //botando um novo valor para o ponto que estar por default
        System.out.println("coloque o novo ponto X:");
        int teste= teclado.nextInt();
        ponto.setPontoX(teste);

        System.out.println("coloque o novo ponto Y:");
        int teste2= teclado.nextInt();
        ponto.setPontoY(teste2);
        System.out.println("Novo ponto1 X: (" +ponto.getPontoX()+ "), Novo ponto1 Y: ("+ ponto.getPontoY()+")");
        System.out.println("ponto2 X: (" +ponto2.getPontoX()+ "), ponto2 Y: ("+ ponto2.getPontoY()+")");
        //comparação usando o equals.
        boolean comparaçao= ponto.equals(ponto2);
        //mostrando se a comparação é falsa ou verdadeira.(se IGUAL nao ha distancia pois sao iguais);
        if(comparaçao==true){
            System.out.println("os pontos sao iguais portanto nao há distancia entre eles");
        }else{
            System.out.println("a distancia entre o ponto (x,y) e o ponto2(x,y) é: " + ponto.Distancia(ponto2));
        }
    }


}