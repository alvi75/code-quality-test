import java.util.*;

public class Translation709 {
    ublic override String toString(){
    StringBuilder sb = new StringBuilder(64);
    CellReference crA = new CellReference(getFirstRowIndex(), getFirstColumnIndex(), false, false);
    CellReference crB = new CellReference(getLastRowIndex(), getLastColumnIndex(), false, false);
    sb.Append(GetType().Name);
    sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
    return sb.toString();
}
}