public ExternalBookBlock(int numberOfSheets) {
    _externalBookRecord = SupBookRecord.createInternalReferences(numberOfSheets);
    _externalNameRecords = new ExternalNameRecord[0];
    _crnBlocks = new CRNBlock[0];
}