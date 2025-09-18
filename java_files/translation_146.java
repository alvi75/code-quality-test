public void unwriteProtectWorkbook() {
    getRecords().remove(fileShare);
    getRecords().remove( writeProtect );
    fileShare = null;
    writeProtect = null;
}