import java.util.*;

public class Translation337 {
    public String getNameText(final int index) {
    final NameRecord nameRecord = getNameRecord(index);
    if (nameRecord.getNameType() == NameRecord.NAME_TYPE_INTERNAL) {
        return getNameText(nameRecord.getSheetNumber());
    }
    else if (nameRecord.getNameType() == NameRecord.NAME_TYPE_EXTERNAL) {
        return getNameText(nameRecord.getExternalWorkbookNumber(), nameRecord.getExternalSheetName());
    }
    else {
        return "<non-local name>";
    }
}
}