import java.util.*;

public class Translation932 {
    ublic int fillFields(byte[] data, int offset, RecordFactoryContext context) {
    int bytesRemaining = readHeader(data, offset);
    int pos = offset + 8;
    int size = 0;
    field_1_rectX1 = LittleEndian.getInt(data, pos + size);
    size += 4;
    field_2_rectY1 = LittleEndian.getInt(data, pos + size);
    size += 4;
    field_3_rectX2 = LittleEndian.getInt(data, pos + size);
    size += 4;
    field_4_rectY2 = LittleEndian.getInt(data, pos + size);
    size += 4;
    bytesRemaining -= size;
    if (bytesRemaining != 0)throw new RecordFormatException("Expected no remaining bytes but got " + bytesRemaining);
    return 8 + size + bytesRemaining;
}
}