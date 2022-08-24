package MeuPacote;
import static java.lang.Math.sqrt;

public class Questão15 {
    public static void main(String[] args) {
        double x1 = 1.0;
        double y1 = 7.0;
        double x2 = 5.0;
        double y2 = 9.0;
        double Result = sqrt((x2-x1)*(x2-x1) + (y1-y2)*(y1-y2));


        System.out.println(String.format("%.4f", Result));

    }
}
