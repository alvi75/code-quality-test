import java.util.*;

public class Translationtranslation_476 {
    public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) {
        super(new BookSheetKeyRangeEvaluator(bookName, firstSheetIdentifier.getSheetName(), lastSheetIdentifier.getSheetName()));
        _firstSheetIdentifier = firstSheetIdentifier;
        _lastSheetIdentifier = lastSheetIdentifier;
    }
    bookName = getBookName();
    firstSheetIdentifier = _firstSheetIdentifier;
    lastSheetIdentifier = _lastSheetIdentifier;
    if (sheetNames.length > 1) {
        rangeString = sheetNames[0] + ":" + sheetNames[sheetNames.length-1];
    }
    else {
        rangeString = sheetName;
    }
    }
}