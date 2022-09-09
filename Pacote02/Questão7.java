//7) Escrever um algoritmo que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de
//        N. Mostre a tabuada na forma: 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.

package Pacote02;

import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int Num = 0;

            while (Num <= (1)){
                System.out.println("Digite um numero de 0 a 10: ");
                Num = sc.nextInt();
            }
            for (int i = 0; i <= 10; i++){
                System.out.println (i+" x "+ Num + " = " + i*Num);
            }

        }
    }




