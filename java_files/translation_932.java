import java.util.*;

public class Translationtranslation_932 {
    public int fillFields( byte[] data, int pOffset, EscherRecordFactory recordFactory ){
        int bytesRemaining = readHeader( data, pOffset );
        int pos = pOffset + 8;
        int size = 0;
        field_1_rectX1 = LittleEndian.getInt( data, pos + size );
        size+=4;
        field_2_rectY1 = LittleEndian.getInt( data, pos + size );
        size+=4;
        field_3_rectX2 = LittleEndian.getInt( data, pos + size );
        size+=4;
        field_4_rectY2 = LittleEndian.getInt( data, pos + size );
        size+=4;
        bytesRemaining -= size;
        if (bytesRemaining != 0) {
            throw new RecordFormatException("Expecting no remaining bytes but got "+ bytesRemaining +" left");
        }
        return 8 + size;
    }
}