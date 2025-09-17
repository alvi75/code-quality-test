public void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeInt(getActiveCellRow());
    out.writeInt(getActiveCellCol());
    out.writeShort(int.class, getActiveCellRef());
    int nRefs = _externSheetRecord.getNumRefs();
    out.writeShort(nRefs);
    for(int i=0;
    i<nRefs;
    i++) {
        _externSheetRecord.getRefAt(i).serialize(out);
    }
}