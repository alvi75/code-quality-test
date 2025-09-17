import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_761 {
    public void construct(CellValueRecordInterface rec, RecordStream rs, SharedValueManager sval) {
        if (rec instanceof FormulaRecord) {
            FormulaRecord fr = (FormulaRecord) rec;
            SupBookRecord supbook = _externalBookBlocks[0].getExternalBookRecord();
            int idx = findFirstRecordLocBySid(CountryRecord.sid);
            _workbookRecordList.add(idx + 1, fr);
            fr.setSheetNumber(_externSheetIndex+1);
        }
        else if (rec instanceof RKRecord) {
            _workbookRecordList.addRKRecord((RKRecord)rec);
        }
    }
    else if (rec instanceof ArrayRecord) {
        _workbookRecordList.addArrayRecord((ArrayRecord)rec);
    }
    }
    else {
        _workbookRecordList.addUnknownRecord((Record)rec);
    }
    }
}