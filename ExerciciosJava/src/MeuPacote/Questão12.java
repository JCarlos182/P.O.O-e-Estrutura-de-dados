package MeuPacote;

public class Questão12 {
    public static void main(String[] args) {
        double A = 12.7;
        double B = 10.4;
        double C = 15.2;

        double triangulo = (A * C)/2;
        double circulo = C * C * 3.14159;
        double trapezio = ((A + B) * C)/2;
        double quadrado = B * B;
        double retangulo = A * B;
        System.out.println(String.format("TRIANGULO = %.3f", triangulo));
        System.out.println(String.format("CIRCULO = %.3f", circulo));
        System.out.println(String.format("TRAPEZIO = %.3f", trapezio));
        System.out.println(String.format("QUADRADO = %.3f", quadrado));
        System.out.println(String.format("RETANGULO = %.3f", retangulo));


    }
}

