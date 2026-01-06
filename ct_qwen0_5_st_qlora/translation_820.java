import java.util.*;

public class Translation820 {
    public ExternalBookBlock(int numberOfSheets) {
    _externalBookRecord = SupBookRecord.createInternalReferences((short)numberOfSheets);
    _externalNameRecords = new ExternalNameRecord[0];
    _crnBlocks = new CRNBlock[0];
}
}