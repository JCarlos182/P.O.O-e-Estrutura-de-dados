//3) Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
//        média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
//        negativos e o percentual de valores negativos e positivos.
//
package Pacote02;

import javax.swing.*;
import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args){
        int mediaAritinetica = 0;
        int QuatValorPar = 0;
        int QuatValorImpar = 0;
        int porcetagemValorPar;
        int porcentagemValorImpar;
        int Soma = 0;
        int Cont = 0;

        int valorA = 0;
            while (valorA != (-1)){
                System.out.println("Informe  um numero inteiro e positivo:");
                valorA = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro e positivo"));

                if (valorA >= 0){
                Soma = Soma + valorA;
                Cont = Cont + 1;

                if (valorA % 2 == 0){
                QuatValorPar = QuatValorPar + 1;
                } else {
                  QuatValorImpar =  QuatValorImpar + 1;
                }

                }
            }
            mediaAritinetica = Soma / Cont;

            porcetagemValorPar = QuatValorPar * 100 / Cont;
            porcentagemValorImpar = QuatValorImpar * 100 / Cont;

            System.out.println(" A media artimetica é:" + mediaAritinetica);

            System.out.println("A quantidade de valores lidos PARES é :" + QuatValorPar);
            System.out.println("A quantidade de valores lidos IMPARES é :" + QuatValorImpar);

            System.out.println("O percentutral de PARES é :" + porcetagemValorPar);
            System.out.println("O percentual de IMPARES é :" + porcentagemValorImpar);


    }
}


