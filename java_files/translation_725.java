import java.util.*;

public class Translation725 {
    public static org.apache.poi.hssf.record.Record convertRKRecord(RKRecord rk) {
    NumberRecord num = new NumberRecord();
    num.setColumn((short)rk.getColumn());
    num.setRow(rk.getRow());
    num.setXFIndex(rk.getXFIndex());
    num.setValue(rk.getRKNumber());
    return num;
}
}