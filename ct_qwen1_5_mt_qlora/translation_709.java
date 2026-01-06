import java.util.*;

public class Translation709 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    CellReference crA = new CellReference(getFirstRowIndex(), getFirstColumnIndex(), false, false);
    CellReference crB = new CellReference(getLastRowIndex(), getLastColumnIndex(), false, false);
    sb.append(getClass().getName());
    sb.append(" [").append(crA.formatAsString()).append(":").append(crB.formatAsString()).append("]");
    return sb.toString();
}
}