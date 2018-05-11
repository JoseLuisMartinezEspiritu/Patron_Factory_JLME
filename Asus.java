package factory;

/**
 *
 * @author JoséLuisEspíritu
 */
public class Asus implements Telefonos {

    private int RAM;
    private int ROM;
    private String SO;
    public String name = Telefonos.ASUS;

    public Asus(int RAM, int ROM, String SO) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.SO = SO;
    }

}
