import java.util.*;

public class Translation932 {
    1 public int fillFields(byte [] data, int offset, EscherRecordFactory recordFactory) {
    2 int bytesRemaining = readHeader(data, offset);
    3 int pos = offset + 8;
    4 int size = 0;
    5 field_1_rectX1 = LittleEndian.getInt(data, pos + size);
    6 size += 4;
    7 field_2_rectY1 = LittleEndian.getInt(data, pos + size);
    8 size += 4;
    9 field_3_rectX2 = LittleEndian.getInt(data, pos + size);
    10 size += 4;
    11 field_4_rectY2 = LittleEndian.getInt(data, pos + size);
    12 size += 4;
    13 bytesRemaining -= size;
    14 if (bytesRemaining != 0) throw new RecordFormatException("Expected no remaining bytes but got " + bytesRemaining);
    15 return 8 + size + bytesRemaining;
}
}