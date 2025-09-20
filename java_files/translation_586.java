import java.util.*;

public class Translation586 {
    public void write(LittleEndianOutput out) {
    out.writeByte(getSid() + getPtgClass());
    out.writeShort(field_1_len_ref_subexpression);
}
}