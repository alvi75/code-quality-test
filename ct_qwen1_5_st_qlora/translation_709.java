import java.util.*;

public class Translation709 {
    public String toString() {
    StringBuffer sb = new StringBuffer(64);
    CellReference crA = new CellReference(_firstRowIndex, _firstColumnIndex, false, false);
    CellReference crB = new CellReference(_lastRowIndex, _lastColumnIndex, false, false);
    sb.append(getClass().getName());
    sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
    return sb.toString();
}
}