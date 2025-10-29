import java.util.*;

public class Translation725 {
    01 public static NumberRecord convertToNumberRecord(RKRecord rk) {
    02 NumberRecord num = new NumberRecord();
    03 num.setColumn(rk.getColumn());
    04 num.setRow(rk.getRow());
    05 num.setXFIndex(rk.getXFIndex());
    06 num.setValue(rk.getRKNumber());
    07 return num;
    08 }
}