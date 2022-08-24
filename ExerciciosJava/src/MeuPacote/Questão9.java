package MeuPacote;

public class Questão9 {
    public static void main(String[] args){
        String NV = "Carlos";
        double VS = 1700;
        double Vendas = 1230.50;
        double Salario = VS + Vendas * 15/100;
        System.out.println(String.format("TOTAL = R$ %.2f", Salario));

    }
}
