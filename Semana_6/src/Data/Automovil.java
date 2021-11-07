package Data;

public class Automovil {

    String motor;
    String ano;
    String puertas;
    public RTV revision;

    public Automovil(String recibemotor, String recibeano, String recibepuertas) {
        this.motor = recibemotor;
        this.ano = recibeano;
        this.puertas = recibepuertas;
        this.revision = new RTV("5","2000","Si");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }
}
