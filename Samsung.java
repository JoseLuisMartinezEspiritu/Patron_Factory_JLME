package factory;

public class Samsung implements Telefonos {

    private int Ram;
    private String Procesador;
    public String name = Telefonos.SAMSUNG;

    public Samsung(int Ram) {
        this.Ram = Ram;
    }

    public Samsung(String Procesador) {
        this.Procesador = Procesador;
        this.Ram = 2;
    }

}
