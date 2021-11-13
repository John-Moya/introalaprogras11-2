package Data;

public class RTV {
    private String mes;
    private String ano;
    private Boolean aprobado;

    //Constructor

    public RTV(String mes, String ano, Boolean aprobado) {
        this.mes = mes;
        this.ano = ano;
        this.aprobado = aprobado;
    }


    //Encapsulamiento

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
}
