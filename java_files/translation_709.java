import java.util.*;

public class Translation709 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder(64);
    CellReference crA = new CellReference(_firstRowIndex, _firstColumnIndex, false, false);
    CellReference crB = new CellReference(_lastRowIndex, _lastColumnIndex, false, false);
    sb.append(getClass().getName());
    sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
    return sb.toString();
}
}