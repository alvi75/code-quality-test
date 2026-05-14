import java.util.*;

public class Translation820 {
    1 public ExternalBookBlock(int numberOfSheets) {
    2 _externalBookRecord = SupBookRecord.createInternalReferences((short)numberOfSheets);
    3 _externalNameRecords = new ExternalNameRecord[0];
    4 _crnBlocks = new CRNBlock[0];
}
}