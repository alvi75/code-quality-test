import java.util.*;

public class Translation744 {
    public int serialize( int offset, byte[] data, EscherSerializationListener listener ) {
    listener.beforeRecordSerialize( offset, getRecordId(), this );
    LittleEndian.putShort( data, offset, getOptions() );
    LittleEndian.putShort( data, offset + 2, getRecordId() );
    LittleEndian.putInt( data, offset + 4, 8 );
    LittleEndian.putInt( data, offset + 8, field_1_numShapes );
    LittleEndian.putInt( data, offset + 12, field_2_lastMSOSPID );
    listener.afterRecordSerialize( offset + 16, getRecordId(), getRecordSize(), this );
    return getRecordSize();
}
}