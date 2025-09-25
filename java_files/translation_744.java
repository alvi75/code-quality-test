import java.util.*;

public class Translation744 {
    public int serialize(int offset, byte[] data, EscherSerializationListener listener) {
    listener.beforeRecordSerialize(offset, getRecordId(), this);
    LittleEndian.putShort(data, offset, getOptions());
    LittleEndian.putInt(data, offset+2, getRecordId());
    LittleEndian.putInt(data, offset+6, 8);
    LittleEndian.putInt(data, offset+10, getField_1_numShapes());
    LittleEndian.putInt(data, offset+14, getField_2_lastMSOSPID());
    listener.afterRecordSerialize(offset+18, getRecordId(), getRecordSize(), this);
    return getRecordSize();
}
}