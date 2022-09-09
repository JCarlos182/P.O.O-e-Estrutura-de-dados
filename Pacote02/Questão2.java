//2) Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá calcular e
//        mostrar :
//        a. A menor altura do grupo;
//        b. A maior altura do grupo;

        package Pacote02;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            if (maior < altura){
                maior = altura;
            }
            if (menor > altura){
                menor = altura;
            }

        }
        System.out.println("O maior integrante tem altura:" + maior);
        System.out.println("O menor integrante tem altura " + menor);

    }
}
