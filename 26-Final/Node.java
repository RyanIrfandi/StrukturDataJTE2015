
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.BigDecimal;
public class Node
{
    public BigDecimal data;
    public Node berikut;

    public Node(BigDecimal data) {
        this.data = data;
        this.berikut = null;
    }
}
 
