import java.util.*;

public class Translation932 {
    public int fillFields(byte[] data, int offset, EscherRecordFactory recordFactory) {
    int bytesRemaining = readHeader(data, offset);
    int pos = offset + 8;
    int size = 0;
    field_1_rectX1 = getShort(data, pos + size);
    size += 2;
    field_2_rectY1 = getShort(data, pos + size);
    size += 2;
    field_3_rectX2 = getShort(data, pos + size);
    size += 2;
    field_4_rectY2 = getShort(data, pos + size);
    size += 2;
    bytesRemaining -= size;
    if (bytesRemaining != 0) {
        throw new RecordFormatException("Expected no remaining bytes but got " + bytesRemaining);
    }
    return 8 + size + bytesRemaining;
}
}