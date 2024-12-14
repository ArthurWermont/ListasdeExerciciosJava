package q8_matriz;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Digite o numero de linhas: ");
        int linhas = scanner.nextInt();
        System.out.println("Digite o numero de colunas: ");
        int colunas = scanner.nextInt();

        double[] elements = new double[linhas*colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Digite o ["+(i+1)+"]["+(j+1)+"]: ");
                elements[i*colunas+j] = scanner.nextDouble();
            }
        }

        Matriz matriz = new Matriz(linhas, colunas, elements);

        while (true){
            System.out.println("1- Criar outra matriz");
            System.out.println("2- Transposta");
            System.out.println("3- Oposta");
            System.out.println("4- Nula");
            System.out.println("5- Identidade");
            System.out.println("6- Diagonal");
            System.out.println("7- Singular");
            System.out.println("8- Simetrica");
            System.out.println("9- Anti-simetrica");
            System.out.println("0- Sair");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o numero de linhas: ");
                    int linhasB = scanner.nextInt();
                    System.out.println("Digite o numero de colunas: ");
                    int colunasB = scanner.nextInt();

                    double[] elementsB = new double[linhasB*colunasB];

                    for (int i = 0; i < linhasB; i++) {
                        for (int j = 0; j < colunasB; j++) {
                            System.out.println("Digite o ["+(i+1)+"]["+(j+1)+"]: ");
                            elementsB[i*colunas+j] = scanner.nextDouble();
                        }
                    }

                    Matriz matrizB = new Matriz(linhasB, colunasB, elementsB);

                    while (true){
                        System.out.println("1- Comparação");
                        System.out.println("2- Subtração");
                        System.out.println("3- Multiplicação");
                        System.out.println("0- Sair");
                        int opcao2 = scanner.nextInt();

                        switch (opcao2){
                            case 1:
                                if (Operacoes.comparacao(matriz, matrizB)){
                                    System.out.println("São iguais");
                                }else{
                                    System.out.println("Não são iguais");
                                }
                                break;
                            case 2:
                                Matriz resultadoSub = Operacoes.sub(matriz, matrizB);
                                resultadoSub.printMatriz();
                                break;
                            case 3:
                                Matriz resultadoMul = Operacoes.mult(matriz, matrizB);
                                resultadoMul.printMatriz();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("opção invalida");
                        }
                        if (opcao2 ==0){
                            break;
                        }
                    }
                case 2:
                    Matriz transposta = Operacoes.transpose(matriz);
                    transposta.printMatriz();
                    break;
                case 3:
                    Matriz oposta = Operacoes.oposta(matriz);
                    oposta.printMatriz();
                    break;
                case 4:
                    Matriz nula = Operacoes.nula(matriz);
                    nula.printMatriz();
                    break;
                case 5:
                    if (Operacoes.identidade(matriz)){
                        System.out.println("É identidade");
                    }else {
                        System.out.println("Não é identidade");
                    }
                    break;
                case 6:
                    if (Operacoes.diagonal(matriz)){
                        System.out.println("É diagonal");
                    }else{
                        System.out.println("Não é diagonal");
                    }
                    break;
                case 7:
                    if (Operacoes.singular(matriz)){
                        System.out.println("É singular");
                    }else {
                        System.out.println("Não é singular");
                    }
                    break;
                case 8:
                    if (Operacoes.simetrica(matriz)){
                        System.out.println("É simetrica");
                    }else{
                        System.out.println("Não é simetrica");
                    }
                    break;
                case 9:
                    if (Operacoes.antiSimetrica(matriz)){
                        System.out.println("É anti-simetrica");
                    }else{
                        System.out.println("Não é anti-simetrica");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opção invalida");
            }
            if (opcao == 0){
                break;
            }
        }

    }
}
