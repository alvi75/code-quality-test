ublic void write(LittleEndianOutput out) {
    out.writeByte(sid + getPtgClass());
    out.writeShort(field_1_len_ref_subexpression);
}