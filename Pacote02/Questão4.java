//4) Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
//        estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
//        terminar quando for lido um número negativo.
//
package Pacote02;


import javax.swing.*;

public class Questão4 {
    public static void main(String[] args){
        int numero = 0;
        int quantidade1 = 0;
        int quantidade2 = 0;
        int quantidade3 = 0;
        int quantidade4 = 0;
        int quantidadeForaDoIntervalo = 0;

        while (numero != (-1)) {
            System.out.println("Informe um numero");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

            if ((numero <= 0) || (numero > 100)) {
                quantidadeForaDoIntervalo = quantidadeForaDoIntervalo + 1;
            } else {
                if ((numero >= 0) && (numero <= 25)) {
                    quantidade1 = quantidade1 + 1;
                }

                if ((numero >= 26) && (numero <= 50)) {
                    quantidade2 = quantidade2 + 1;
                }

                if ((numero >= 51) && (numero <= 75)) {
                    quantidade3 = quantidade3 + 1;
                }

                if ((numero >= 76) && (numero <= 100)) {
                    quantidade4 = quantidade4 + 1;
                }
            }

        }

        System.out.println("Quantidade de números no intervalo de 0 a 25, é de " + quantidade1);
        System.out.println("Quantidade de números no intervalo de 25 a 50, é de " + quantidade2);
        System.out.println("Quantidade de números no intervalo de 50 a 75, é de " + quantidade3);
        System.out.println("Quantidade de números no intervalo de 75 a 100, é de " + quantidade4);
        System.out.println("Quantidade de números fora do intervalo, é de" + quantidadeForaDoIntervalo);

    }

}