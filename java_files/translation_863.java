import java.util.*;

public class Translationtranslation_863 {
    public MoveAddress(RecordInputStream in) {
        field[] subrecords = new Record[5];
        for (int i = 0;
        i < subrecords.length;
        i++) {
            subrecords[i] = Record.createSubRecord(i, in);
        }
        _cbSubrecords = 0;
        for (int i = 0;
        i < subrecords.length;
        i++) {
            _cbSubrecords += subrecords[i].getRecordSize();
        }
        _totalPreviousRecordsSize = _cbSubrecords;
        _offsets = new long[subrecords.length];
        for (int i = 0;
        i < subrecords.length;
        i++) {
            _offsets[i] = _offsets[i-1] + subrecords[i].getRecordSize();
        }
    }
}