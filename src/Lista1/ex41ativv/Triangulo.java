package Lista1.ex41ativv;

import java.util.Scanner;

public class Triangulo{
    private static Scanner Teclado;
    public static void main(String[]args){
        Teclado= new Scanner(System.in);
        float [] lados= new float[3];

        for(int lado=0;lado <3;lado++ ){
            System.out.printf("lado %d:",lado+1);
            lados[lado]=Teclado.nextFloat();
        }
        if(lados[0]>lados[1]+lados[2] || lados[1]>lados[0]+lados[2] || lados[2]>lados[1]+lados[0]){
            System.out.print("isso nao pode ser um triangulo!");
        }else{

            String tipoTriangulo="nada";

            if(lados[0]==lados[1]&&lados[1]==lados[2]){
                tipoTriangulo="equilatero";
            }else if(lados[0]!=lados[1]&&lados[1]!=lados[2]&&lados[0]!=lados[2]){
                tipoTriangulo="escaleno";

            }else if(lados[0]==lados[1]&&lados[1]!=lados[2]  ||lados[1]==lados[2]&&lados[1]!=lados[0]    ||lados[2]==lados[0]&&lados[0]!=lados[1] ){
                tipoTriangulo="isoceles";
            }
            switch(tipoTriangulo){
                case "equilatero":
                    System.out.println("Aqui temos um triangulo equilatero!");
                    break;
                case "escaleno":
                    System.out.println("Aqui temos um triangulo escaleno!");
                    break;
                case "isoceles":
                    System.out.println("Aqui temos um triangulo isoceles!");
                    break;
                default:
                    System.out.println("Aqui temos um triangulo de tipo de triangulo desconhecido!");
            }
        }
    }
}