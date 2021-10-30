package Data;

public class RTV {

    private String mes;
    private  String ano;
    private String aprobado;

    public RTV(String mes, String ano, String aprobado) {
        this.mes = mes;
        this.ano = ano;
        this.aprobado = aprobado;
    }

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

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }
}
