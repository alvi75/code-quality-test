import java.util.*;

public class Translation606 {
    public void writeUnshared(Object object) throws IOException {
    if (getSST() == null) {
        throw new IllegalStateException("No Shared String Table defined");
    }
    int index = getSST().addString(new HSSFRichTextString(object.toString()));
    writeContinueIfRequired(field_3_current_size + 2 * LittleEndianConsts.INT_SIZE);
    LittleEndian.putShort(data, field_3_current_size, sid);
    LittleEndian.putInt(data, field_3_current_size+LittleEndianConsts.SHORT_SIZE, index);
    field_3_current_size += 2*LittleEndianConsts.INT_SIZE;
    updateSize();
}
}