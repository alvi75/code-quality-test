public void serialize(LittleEndianOutput out) {
    out.writeShort(main + 1);
    out.writeShort(subFrom);
    out.writeShort(subTo);
}