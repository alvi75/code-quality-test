import java.util.*;

public class Translation841 {
    public String toString() {
    StringBuilder sb = new StringBuilder(64);
    sb.append(getClass().getName()).append(" [");
    if(isWholeColumnReference()) {
        sb.append(getRow());
        sb.append(':');
        sb.append(getLastRow());
        sb.append(' ');
        sb.append(getCol());
        sb.append(':');
        sb.append(getLastCol());
    }
    else if(isSingleCellRange()) {
        sb.append(getRow());
        sb.append(',');
        sb.append(getCol());
    }
    else {
        for(int i=0;
        i<numberOfSheets;
        i++) {
            SheetRefEvaluator sre = _sheetEvaluators[i];
            sb.append(sre.toString());
        }
    }
    sb.append("]");
    return sb.toString();
}
}