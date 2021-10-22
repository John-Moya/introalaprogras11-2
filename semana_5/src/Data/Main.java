package Data;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Fabrica miFabrica = new Fabrica();
        miFabrica.abreFabrica();
        Fabrica fabricadeClavos = new Fabrica();
        System.out.println(fabricadeClavos.nombreDeEncargado(""));
        System.out.println();

        Taller miTaller = new Taller();
        miTaller.abrirTaller();
        System.out.println(miTaller.atenderTaller(""));
        System.out.println();


        Restaurante miResta = new Restaurante();
        miResta.abrirResta();

    }
}
