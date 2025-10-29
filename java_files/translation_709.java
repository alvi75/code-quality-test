import java.util.*;

public class Translation709 {
    01 public String toString() {
    02 StringBuffer sb = new StringBuffer(64);
    03 CellReference crA = new CellReference(firstRowIndex, firstColumnIndex, false, false);
    04 CellReference crB = new CellReference(lastRowIndex, lastColumnIndex, false, false);
    05 sb.append(getClass().getName());
    06 sb.append(" [").append(crA.formatAsString()).append(':').append(crB.formatAsString()).append("]");
    07 return sb.toString();
}
}