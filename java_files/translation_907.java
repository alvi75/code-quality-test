public void processChildRecords(RecordStream rs) {
    while (rs.peekNextClass() == MergeCellsRecord.class) {
        _mergedRegions.add(rs.getNext());
    }
    else if (rs.peekNextSid() == LastCellOfRowRecord.sid) {
        _lastCellOfRow = rs.getNext();
    }
    else {
        throw new RuntimeException("Unexpected record type for MergeCellsRecord");
    }
}