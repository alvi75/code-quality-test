public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SUPBOOK ");
    if(isExternalReferences()) {
        buffer.append("External References]\n");
        buffer.append(" .url = ").append(getURL()).append("\n");
        buffer.append(" .nSheets = ").append(field_1_number_of_sheets).append("\n");
        for (String sheetname : field_3_sheet_names) {
            buffer.append(" .name = ").append(sheetname).append("\n");
        }
        buffer.append("[/SUPBOOK");
    }
    else if(_isAddInFunctions) {
        buffer.append("Add-In Functions");
    }
    else {
        buffer.append("Internal References");
        buffer.append(" nSheets=").append(field_1_number_of_sheets);
    }
    return buffer.toString();
}