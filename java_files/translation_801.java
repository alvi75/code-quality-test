public static org.apache.poi.hssf.record.Record createSingleRecord(RecordInputStream in) {
    org.apache.poi.hssf.record.Record record = createRecord(in);
    if (record instanceof org.apache.poi.hssf.record.RecordBase) {
        ((org.apache.poi.hssf.record.RecordBase)record).setNextRecord(createSingleRecord(in));
    }
    return record;
}