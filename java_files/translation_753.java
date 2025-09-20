import java.util.*;

public class Translation753 {
    ublic void removeSheet(int sheetIndex) {
    if (boundsheets.size() > sheetIndex) {
        records.remove(records.getBspos() - (boundsheets.size() - 1) + sheetIndex);
        boundsheets.remove(sheetIndex);
        fixTabIdRecord();
    }
    int sheetNum1Based = sheetIndex + 1;
    for (int i = 0;
    i < getNumberOfSheets();
    i++) {
        NameRecord nr = getNameRecord(i);
        if (nr.getSheetNumber() == sheetNum1Based) {
            nr.setSheetNumber(0);
        }
        else if (nr.getSheetNumber() > sheetNum1Based) {
            nr.setSheetNumber(nr.getSheetNumber() - 1);
        }
    }
    if (linkTable != null) {
        for (int i = sheetIndex + 1;
        i < getNumberOfSheets();
        i++) {
            linkTable.removeSheet(i);
        }
    }
}