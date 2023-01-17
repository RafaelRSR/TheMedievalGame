import java.io.Serializable;

public class Helmet extends Armour implements Serializable{

    /* Class Variables */
    public static final long serialVersionUID = 1L;

    /* Constructors */
    public Helmet(String name, int durability, int defenseRating) {
        super(name, durability, defenseRating);
    }
}