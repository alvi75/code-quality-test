ublic override int serialize(int offset, byte[] data, EscherSerializationListener listener){
    listener.beforeRecordSerialize(offset, RecordId, this);
    LittleEndian.putShort(data, offset, Options);
    LittleEndian.putShort(data, offset + 2, RecordId);
    LittleEndian.putInt(data, offset + 4, 8);
    LittleEndian.putInt(data, offset + 8, field_1_numShapes);
    LittleEndian.putInt(data, offset + 12, field_2_lastMSOSPID);
    listener.afterRecordSerialize(offset + 16, RecordId, RecordSize, this);
    return RecordSize;
}