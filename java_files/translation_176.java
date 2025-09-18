public WindowOneRecord(RecordInputStream in) {
    field_1_hHold = in.readShort();
    field_2_vHold = in.readShort();
    field_3_width = in.readShort();
    field_4_height = in.readShort();
    field_5_options = in.readShort();
    field_6_activeTab = in.readShort();
    field_7_firstVisibleTab = in.readShort();
    field_8_numSelectedTabs = in.readShort();
    field_9_tabWidthRatio = in.readShort();
}