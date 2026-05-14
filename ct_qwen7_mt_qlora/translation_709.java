import java.util.*;

public class Translation709 {
    1 public String toString() {
    2 final StringBuilder sb = new StringBuilder(64);
    3 final CellReference crA = new CellReference(_firstRowIndex,_firstColumnIndex,false,false);
    4 final CellReference crB = new CellReference(_lastRowIndex,_lastColumnIndex,false,false);
    5 sb.append(getClass().getName());
    6 sb.append(" [").append(crA.formatAsString()).append(":").append(crB.formatAsString()).append("]");
    7 return sb.toString();
}
}