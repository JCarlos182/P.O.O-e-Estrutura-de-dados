package Pratica;

public class CarroCorrida {
    private Integer numerocarro;
    private String piloto;
    private Double velociademax;
    private Double velociademin;
    private boolean ligado;


    public  String Frear(int valor){
    if(ligado==false){
        return "O carro está desligado! carro esta parado.";
    }
    if(velociademax==0.0){
        return "O carro está parado";
    }
    if(velociademax - valor < 0.0){
        velociademax = 0.0;
        return "Freou. O carro está parado";
    }   return "Freou, velocidade atual: " + velociademax + "km/h.";


    }
    public String Acelerar(int valor){
        if(ligado == true){
            return "Acelerou, Velocidade atual: " + velociademax + "km/h.";
        }
        return "Não é possivel acelerar com o carro desligado.";
    }
    public String DesligarMotor(){
        if(ligado==false){
            return "O motor ja esta desligado";
        }
        if (velociademax==0.0){
            ligado = false;
            return  "O motor foi desligadd agora.";
        }
        return "O motor não desligou pois o carro está em movimento.";
    }

    public String LigarMotor(){
        if (ligado==true){
            return "O carro ja esta ligado.";
        }
        return "O carro foi ligado.";
    }
    public String SituacaoMotor(){
        if(ligado==true){
            return "Motor Ligado";
        }else{
            return "Motor Desligado.";
        }
    }


    public CarroCorrida(int numeroCarro, String piloto, Double velMax, Double velMin, Boolean ligado) {
        numerocarro = numeroCarro;
        piloto = piloto;
        velociademax = velMax;
        velociademax = velMin;
        ligado = ligado;



}

    public Integer getNumerocarro() {
        return numerocarro;
    }

    public void setNumerocarro(Integer numerocarro) {
        this.numerocarro = numerocarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Double getVelociademax() {
        return velociademax;
    }

    public void setVelociademax(Double velociademax) {
        this.velociademax = velociademax;
    }

    public Double getVelociademin() {
        return velociademin;
    }

    public void setVelociademin(Double velociademin) {
        this.velociademin = velociademin;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


