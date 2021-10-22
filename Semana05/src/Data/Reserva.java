package Data;

public class Reserva {
    Integer hora;
    String día;
    String mesa;

    public Menu menu;

    public String platos(String plato){
        if (plato == "clasico"){
            return "Desayuno Clásico";
        }else{
            return "cena ";
        }
    }



}
