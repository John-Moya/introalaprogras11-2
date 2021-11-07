package Data;

public class Automovil {

    private String placa;
    private String dueno;
    private String motor;
    private String modelo;
    private String ano;
    private String estado;
    public RTV control;

    public Automovil(String placa, String dueno, String motor, String ano, String estado,String modelo) {
        this.placa = placa;
        this.dueno = dueno;
        this.motor = motor;
        this.ano = ano;
        this.estado = estado;
        this.modelo = modelo;
        this.control = new RTV("8","2019","9","si");


    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
