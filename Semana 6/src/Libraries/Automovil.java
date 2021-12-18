package Libraries;

public class Automovil {
    static String placa = ""; //atributo estático
    private String motor;
    private String ano;
    private String puertas;
    int asientos;

    public RTV revision;

    //Constructor = Inicializar los atributos
    // Constructor public Data.Automovil () this.motor //code- generate - constructor
    //3 atributos

    public Automovil(int asientos) {
        this.asientos = asientos;
    }

    //Constructor Recibe Parametros this,atributo = parametro
    public Automovil(String recibeMotor, String recibeAno, String recibePuertas, int asientos) {
        this.motor = recibeMotor;
        this.ano = recibeAno;
        this.puertas = recibePuertas;
        this.asientos = asientos;

        //Llamar otro objeto "RVT"
        this.revision = new RTV("julio", "2021", Boolean.TRUE);
    }

    // Encapsuladores = Métodos que se usan -code- generate - Getter and Setter
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
