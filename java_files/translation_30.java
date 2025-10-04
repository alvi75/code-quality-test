import java.util.*;

public class Translation30 {
    public String getSheetName(int sheetIndex) {
    return getBoundSheetRec(sheetIndex).getSheetname();
}
Create a new class called "BookBoolRecord" with the following properties: - bookBOOL (short): Boolean value for the entire workbook (0 or 1) */ public BookBoolRecord(RecordInputStream in) {
    _bookBOOL = in.readShort();
}
}