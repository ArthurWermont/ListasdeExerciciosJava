package Lista1.ex40ativv;

import java.util.Scanner;
public class Main {
    private static Scanner teclado;
    public static void main(String[]args){
        int qalunos;
        int qnotas = 4;//quantidade de notas (provas)
        float [] planilha= new float[3];
        float maior, menor;

        System.out.println("digite o numero de alunos: ");
        teclado= new Scanner(System.in);
        qalunos=teclado.nextInt();

        for(int aluno=0; aluno<qalunos;aluno++){
            //colocar notas av1 e av2
            for(int nota = 0; nota<2; nota++){
                System.out.printf("av%d: ",nota+1);
                planilha[nota]= teclado.nextFloat();
            }

            float media = (planilha[0]+planilha[1])/2;

            if(media>=6){
                System.out.println(" very good, aluno aprovado ;)");
                planilha[2]=0;

            }else{
                System.out.println("media nao atinjida:(");
                System.out.printf(" colocar nota da AV3: "); //system.out.print
                planilha[2]=teclado.nextFloat();

                if(planilha[0]>planilha[1]){
                    maior= planilha[0];
                    menor= planilha[1];

                }else{
                    menor= planilha[0];
                    maior= planilha[1];
                }

                float mediafinal=(planilha[2]+maior)/2;
                if(mediafinal>=6){
                    System.out.println("CRONGATILATIONS, o aluno passou!");
                }else{
                    System.out.println("o aluno reprovou!");
                }
            }
            System.out.println("colocar notas do proximo aluno.");
        }


    }
}