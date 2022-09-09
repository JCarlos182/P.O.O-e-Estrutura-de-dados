//10) Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de valores do cálculo de
//        A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120

package Pacote02;

import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Num = 0;
            int Fat = 1;

            System.out.println("Digite um numero de 1 a 10: ");
            Num = sc.nextInt();
            if (Num >= 1) {
                for (int i = 1; i <= Num; i++) {
                    Fat = Fat * i;
                    System.out.println("O fatorial de " + Num + " é igual a " + Fat);

                }

            }


        }

    }
