import java.util.*;

public class Translation430 {
    public void serialize(LittleEndianOutput out) {
    out.writeShort(field_1_categoryDataType);
    out.writeShort(field_2_valuesDataType);
    out.writeShort(field_3_numCategories);
    out.writeShort(field_4_numValues);
    out.writeShort(field_5_bubbleSeriesType);
    out.writeShort(field_6_numBubbleValues);
}
}