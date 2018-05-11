package factory;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Lanix implements Telefonos {
    
    private int Ram;
    private String SO;
    private int ROM;
    private String name = Telefonos.LANIX; 

    public Lanix(int Ram, String SO, int ROM) {
        this.Ram = Ram;
        this.SO = SO;
        this.ROM = ROM;
    }
    
    

}
