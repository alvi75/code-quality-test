import java.util.*;

public class Translation753 {
    public void removeSheet(int sheetIndex) {
    if (boundsheets.size() > sheetIndex) {
        records.remove(records.bspos - (boundsheets.size() - 1) + sheetIndex);
        boundsheets.remove(sheetIndex);
        fixTabIdRecord();
    }
    int sheetNum1Based = sheetIndex + 1;
    for (int i = 0;
    i < numNames;
    i++) {
        NameRecord nr = getNameRecord(i);
        if (nr.sheetNumber == sheetNum1Based) {
            nr.sheetNumber = 0;
        }
        else if (nr.sheetNumber > sheetNum1Based) {
            nr.sheetNumber--;
        }
    }
    if (linkTable != null) {
        for (int i = sheetIndex + 1;
        i <= numSheets;
        i++) {
            linkTable.removeSheet(i);
        }
    }
}
}