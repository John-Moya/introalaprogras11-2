package semana06;

public class Automovil {
    String motor, ano, puertas;
    int asientos;
    public RTV revision;
    
    public Automovil(String motor, String ano, String puertas, int asientos) {
        this.motor = motor;
        this.ano = ano;
        this.puertas = puertas;
        this.asientos = asientos;
        this.revision = new RTV("Julio", "2021", true);
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

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
