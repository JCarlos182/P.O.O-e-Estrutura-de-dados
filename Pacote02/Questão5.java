//5) Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
//        Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
//        números lidos. O número que encerrará a leitura será zero.

package Pacote02;

import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Numero = 0;
        int Cont = 0;
        int QtdPar = 0;
        int QtdImp = 0;
        double MediaPar ;
        double MediaG ;

        while (Numero <= Cont ){
            System.out.println("Digite um numero: ");
            Numero = sc.nextInt();


            if (Numero > (0)){
                Cont = Numero + 1;
            }
            if (Numero == (0)){
                break;
            }

            if (Numero % 2 == 0 ){
                QtdPar = QtdPar + 1;
                Cont = Cont + 1;
            } else {
                QtdImp = QtdImp + 1;
            }
        }

        MediaPar = QtdPar % Cont;
        MediaG = (QtdPar + QtdImp) % Cont;

        System.out.println("A média par é: " + MediaPar);
        System.out.println("A média geral é: " + MediaG);


    }
}

