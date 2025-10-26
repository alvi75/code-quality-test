ublic override void serialize(LittleEndianOutput out1){
    int i = 0;
    for (i = 0;
    i < field_1_gridset_flag;
    ++i){
        out1.WriteByte((byte)field_2_gridset[i]);
    }
}