package Lista1.ex38ativv;

import java.util.Scanner;
public class temperaturas {
    private static Scanner Teclado;
    public static void main(String[] args) {
        Teclado = new Scanner(System.in);
        double tempAtual;
        double novaTemp;
        int opcEscala;
        int escalaAtual;


        System.out.println("Digite a escala atual: 1 - Celsius / 2 - Fahrenheit / 3 - Kelvin");
        escalaAtual = Teclado.nextInt();

        System.out.println("Temperatura atual:");
        tempAtual = Teclado.nextInt();

        switch (escalaAtual) {
            case 1:
                System.out.println("Qual a escala que deseja converter? 2 - Fahrenheit / 3 - Kelvin");
                opcEscala = Teclado.nextInt();

                if (opcEscala == 2) {
                    novaTemp = tempAtual * (1.8) + 32;
                    System.out.println("A temperatura atual em Fahrenheit é: " + novaTemp);
                } else if (opcEscala == 3) {
                    novaTemp = tempAtual + 273.15;
                    System.out.println("A temperatura atual em Kelvin é: " + novaTemp);
                }

                break;


            case 2:
                System.out.println("Qual a escala que deseja converter? 1 - Celsius / 3 - Kelvin");
                opcEscala = Teclado.nextInt();
                if(opcEscala==1) {
                    novaTemp = (tempAtual - 32) / 1.8;
                    System.out.println("A temperatura atual em Celsius é: " + novaTemp);
                }else if(opcEscala==3) {
                    novaTemp = ((tempAtual - 32) / 1.8) + 273.15;
                    System.out.println("A temperatura atual em Kelvin é: " + novaTemp);
                }




                break;
            case 3:
                System.out.println("Qual a escala que deseja converter? 1 - Celsius / 2 - Fahrenheit");
                opcEscala = Teclado.nextInt();
                if(opcEscala==1) {
                    novaTemp = tempAtual - 273.15;
                    System.out.println("A temperatura atual em Celsius é: " + novaTemp);
                }else if(opcEscala==2) {
                    novaTemp = 1.8*(tempAtual-273) + 32;
                    System.out.println("A temperatura atual em Fahrenheit é: " + novaTemp);
                }

                break;
        }
    }
}