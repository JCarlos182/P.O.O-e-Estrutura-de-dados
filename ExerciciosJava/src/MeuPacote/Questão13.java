package MeuPacote;
import static java.lang.Math.abs;

public class Questão13 {
    public static void main(String[] args) {
                int A = 217;
                int B = 14;
                int C = 6;
                int maiorAB = (A + B + abs(A - B)) / 2;
                int maiorABC = (maiorAB + C + abs(maiorAB-C))/2;

        System.out.println(String.format(maiorABC + " eh o maior"));


            }
        }
