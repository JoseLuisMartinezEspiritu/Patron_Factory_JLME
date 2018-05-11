package factory;

public class IPhone implements Telefonos {

    private int Ram;
    private String Procesador;
    private String GPU;

    public IPhone(int Ram, String Procesador, String GPU) {
        this.Ram = Ram;
        this.Procesador = Procesador;
        this.GPU = GPU;
    }

}
