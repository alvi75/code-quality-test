using System;
using System.Collections.Generic;

public class Translation820
{
    public ExternalBookBlock(int numberOfSheets){
    _externalBookRecord = SupBookRecord.CreateInternalReferences((short)numberOfSheets);
    _externalNameRecords = new ExternalNameRecord[0];
    _crnBlocks = new CRNBlock[0];
}
}