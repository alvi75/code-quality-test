import java.util.*;

public class Translation725 {
    1 public static NumberRecord convertToNumberRecord(RKRecord rk) {
    2 NumberRecord num = new NumberRecord();
    3 num.setColumn(rk.getColumn());
    4 num.setRow(rk.getRow());
    5 num.setXfIndex(rk.getXFIndex());
    6 num.setValue(rk.getRKNumber());
    7 return num;
}
}