ublic ColumnInfoRecord(RecordInputStream in) {
    int firstCol = in.ReadUShort();
    int lastCol = in.ReadUShort();
    int colWidth = in.ReadUShort();
    int xfIndex = in.ReadUShort();
    int options = in.ReadUShort();
    switch (in.Remaining) {
        case 2: field_6_reserved = in.ReadUShort();
        break;
        case 1:field_6_reserved = in.ReadByte();
        break;
        case 0:field_6_reserved = 0;
        break;
        default:throw new RuntimeException("Unusual record size remaining=" + in.Remaining);
    }
}