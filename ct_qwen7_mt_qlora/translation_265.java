import java.util.*;

public class Translation265 {
    1 public String toString() {
    2 StringBuffer buffer = new StringBuffer();
    3 buffer.append(getClass().getName()).append("[ARRAY]\n");
    4 buffer.append(" .range = ").append(getRange()).append('\n');
    5 buffer.append(" .options = ").append(Integer.toHexString(getOptions())).append('\n');
    6 buffer.append(" .notUsed = ").append(Integer.toHexString(getNotUsed())).append('\n');
    7 buffer.append(" .formula =\n");
    8 for (int k=0;
    k<getFormulaTokens().length;
    k++) {
        9 buffer.append(" ").append(getFormulaTokens()[k].toString()).append('\n');
        10 }
        11 buffer.append("]\n");
        12 return buffer.toString();
    }
}