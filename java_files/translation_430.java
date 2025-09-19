import java.util.*;

public class Translation430 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getDataFormat());
    out.writeInt(field_1_pointNumber);
    out.writeInt(field_2_seriesIndex);
    out.writeInt(field_3_seriesNumbers);
    out.writeInt(field_4_formatFlags);
    out.writeShort( field_5_reserved );
}
}