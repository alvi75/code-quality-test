using System;
using System.Collections.Generic;

public class Translation744
{
    public override int Serialize(int offset, byte[] data, EscherSerializationListener listener){
    listener.BeforeRecordSerialize(offset, RecordId, this);
    LittleEndian.PutShort(data, offset, Options);
    LittleEndian.PutShort(data, offset + 2, RecordId);
    LittleEndian.PutInt(data, offset + 4, 8);
    LittleEndian.PutInt(data, offset + 8, field_1_numShapes);
    LittleEndian.PutInt(data, offset + 12, field_2_lastMSOSPID);
    listener.AfterRecordSerialize(offset + 16, RecordId, RecordSize, this);
    return RecordSize;
}
}