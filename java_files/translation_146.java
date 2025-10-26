ublic void unwriteProtectWorkbook() {
    records.remove(fileShare);
    records.remove(WriteProtect);
    fileShare = null;
    writeProtect = null;
}