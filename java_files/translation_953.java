public ChartFRTInfoRecord(RecordInputStream in) {
    rt = in.readShort();
    grbitFrt = in.readShort();
    verOriginator = in.readByte();
    verWriter = in.readByte();
    int cCFRTID = in.readUShort();
    rgCFRTID = new CFRTID[crnCount];
    for (int i = 0;
    i < cCFRTID;
    i++) {
        rgCFRTID[i] = new CFRTID(in);
    }
}