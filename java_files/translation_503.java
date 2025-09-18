public void visitContainedRecords(RecordVisitor rv) {
    if (_recs.isEmpty()) {
        return;
    }
    rv.visitRecord(_bofRec);
    _recs.forEach(rv::visitRecord);
}