import java.util.*;

public class Translation619 {
    public ParserExtension getExtension(String key) {
    return this.extensions.get(key);
}
Create a new class called "BookSheetKey" that consists of bookIndex, sheetIndex, and lastSheetIndex fields. Implement a constructor for the BookSheetKey class that takes in bookIndex, sheetIndex, and lastSheetIndex parameters and assigns them to the respective fields. Also, override the equals() method to compare two BookSheetKeys for equality based on their bookIndex, sheetIndex, and lastSheetIndex fields.
}