import java.util.*;

public class Translation709 {
    public String toString() {
    CellReference crA = new CellReference(_firstRowIndex, _firstColumnIndex, false, false);
    CellReference crB = new CellReference(_lastRowIndex, _lastColumnIndex, false, false);
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName());
    sb.append(" [");
    sb.append(crA.formatAsString());
    sb.append(':');
    sb.append(crB.formatAsString());
    sb.append("]");
    return sb.toString();
}
}