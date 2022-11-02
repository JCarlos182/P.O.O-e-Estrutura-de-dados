public class Application {

    public static void main(String [] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setSalario(1000);
        funcionario.imprimir();

        Programador programador = new Programador();
        programador.setNome("carlos");
        programador.setSalario(100000);
        programador.imprimir();

        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setSalario(100000);
        gerente.imprimir();


        AnalistaSistemas analistaSistemas = new AnalistaSistemas();
        analistaSistemas.setNome("Carlos");
        analistaSistemas.setSalario(100000);
        analistaSistemas.imprimir();



    }
}
