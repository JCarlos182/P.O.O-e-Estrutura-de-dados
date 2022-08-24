package MeuPacote;

public class Questão8 {
    public static void main(String[] args){
        int NF = 1;
        int HT = 200;
        double VS = 20.50;
        double Salario = HT*VS;
        System.out.println("NUMBER = "+ NF);
        System.out.println(String.format("SALARIO = U$ %.2f", Salario));

    }
}
