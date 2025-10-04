import java.util.*;

public class Translation709 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    CellReference crA = new CellReference(getFirstRow(), getFirstColumn());
    CellReference crB = new CellReference(getLastRow(), getLastColumn());
    sb.append(getClass().getName());
    sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
    return sb.toString();
}
}