public ListStream(RecordInputStream in) {
    _super(in);
    field_5_stream_pos = in.readInt();
    int field_6_num_code_pages = in.readShort(int.class);
    int field_7_dbcells_ref = in.readUShort();
    int field_8_zero = in.readUByte();
    if (in.available() == 1) {
        logger.log(POILogger.WARN,"LabelRecord data is padded to 8 bytes.");
    }
    else if (in.available() > 8) {
        logger.log(POILogger.WARN,"LabelRecord data is oversized - extra 4 bytes ignored");
    }