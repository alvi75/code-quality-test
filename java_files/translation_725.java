import java.util.*;

public class Translation725 {
    ublic static NumberRecord convertToNumberRecord(RKRecord rk) {
    NumberRecord num = new NumberRecord();
    num.setColumn((rk.getColumn()));
    num.setRow((rk.getRow()));
    num.setXfIndex((rk.getXFIndex()));
    num.setValue((rk.getRKNumber()));
    return num;
}
}