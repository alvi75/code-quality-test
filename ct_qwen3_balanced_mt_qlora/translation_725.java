import java.util.*;

public class Translation725 {
    ublic static NumberRecord convertToNumberRecord(RKRecord rk) {
    final NumberRecord num = new NumberRecord();
    num.setColumn(rk.getColumn());
    num.setRow(rk.getRow());
    num.setXFIndex(rk.getXFIndex());
    num.setValue(rk.getRKNumber());
    return num;
}
}