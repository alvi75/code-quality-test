public void serialize(LittleEndianOutput out) {
    out.writeShort(getOptionFlags());
    out.writeShort(getRowHeight());
}