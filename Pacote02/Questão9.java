//9) Escreva um algoritmo que leia um valor inicial A e uma razão R e imprima uma seqüência em
//        P.G. contendo 10 valores.
//
package Pacote02;

import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int R = 0;
        int N = 0;
        double PG;

        System.out.println("Digite um valor para A: ");
        A = sc.nextInt();
        System.out.println("Digite um valor da razão: ");
        R = sc.nextInt();
        System.out.println("Digite o N-essimo termo: ");
        N = sc.nextInt();

        PG = A * (Math. pow(R,N-1));

        System.out.println(PG);

    }
}

