//8) Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
//        P.A. contendo 10 valores.

package Pacote02;

import java.util.Scanner;

public class Questão8 {
    private static Object i;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int AN = 0;
        int PA = 0;

        System.out.println("Digite um valor para N: ");
        N = sc.nextInt();

        for (int i = 0; i <= N; i++){
            AN = 1 + (i-1)*2;
            System.out.println(AN);
            PA = PA + AN;
        }

        System.out.println(PA);

    }
}