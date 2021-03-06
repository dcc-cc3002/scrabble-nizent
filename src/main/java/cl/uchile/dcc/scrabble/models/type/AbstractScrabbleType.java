package cl.uchile.dcc.scrabble.models.type;

/** An abstract class that holds the common behavior of an Scrabble Type
 * @author Nicolás Zenteno Guardia
 */
public abstract class AbstractScrabbleType implements IType {

    /**
     * Transform the value of the ScrabbleType to an String
     * @return the String containing the value
     */
    public abstract String toString();
}
