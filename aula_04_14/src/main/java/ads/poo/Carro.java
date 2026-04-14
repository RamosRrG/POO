package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor ;

    public Carro(String marca, Motor motor){
        this.marca = marca;
        this.propulsor = motor;
    }
    public void acelerar(int velocidade){
        propulsor.acelerar(velocidade);
    }
    void trocarMotor(Motor motor){
        this.propulsor = motor;
    }

}
