package semana06;

public class RTV {
    private String mes, ano;
    private boolean isAprobado;
    
    public RTV(String mes, String ano, boolean isAprobado) {
        this.mes = mes;
        this.ano = ano;
        this.isAprobado = isAprobado;
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

    public boolean isAprobado() {
        return isAprobado;
    }

    public void setAprobado(boolean isAprobado) {
        this.isAprobado = isAprobado;
    }
}
