import java.util.*;

public class Translation753 {
    public void removeSheet(int sheetIndex) {
    if (_boundSheetRecords.size() > sheetIndex) {
        _boundSheetRecords.remove(sheetIndex);
    }
    else if (_sheetRecords.size() > sheetIndex) {
        _sheetRecords.remove(sheetIndex);
    }
    else {
        throw new IllegalArgumentException("Invalid Sheet Index ("+ sheetIndex + ")");
    }
}
}