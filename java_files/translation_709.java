import java.util.*;

public class Translation709 {
    public String toString() {
    final StringBuilder sb = new StringBuilder(64);
    final CellReference crA = new CellReference(getFirstRow(), getFirstColumn());
    final CellReference crB = new CellReference(getLastRow(), getLastColumn());
    sb.append(getClass().getName());
    sb.append(" [").append(crA.formatAsString()).append(':').crB.formatAsString()).append("]");
    return sb.toString();
}
}