import java.util.*;

public class Translationtranslation_443 {
    public OptionGroup(RecordInputStream in) {
        field[] subrecords = new Record[5];
        for (int i = 0;
        i < subrecords.length;
        i++) {
            subrecords[i] = Record.createSubRecord(i, in);
        }
        _countRecords = countRecords(subrecords);
        _unknownPostCountRecord = UnknownRecord.createUnknownRecord(in);
    }
}