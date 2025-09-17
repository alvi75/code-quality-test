import java.util.*;

public class Translationtranslation_476 {
    public SheetRangeIdentifier(String bookName, NameIdentifier firstSheetIdentifier, NameIdentifier lastSheetIdentifier) {
        super(bookName, firstSheetIdentifier, lastSheetIdentifier);
        if (firstSheetIdentifier == null || lastSheetIdentifier == null) {
            throw new IllegalArgumentException("First or last sheet name not specified");
        }
    }
}