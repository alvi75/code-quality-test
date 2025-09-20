import java.util.*;

public class Translation753 {
    public void removeSheet(int sheetIndex) {
    if (boundsheets.size() > sheetIndex) {
        records.remove(records.getBspos() - (boundsheets.size() - 1) + sheetIndex);
        boundsheets.remove(sheetIndex);
        fixTabIdRecord();
    }
    int sheetNum1Based = sheetIndex+1;
    for (int i=0;
    i<getNameRecords().length;
    i++) {
        NameRecord nr = getNameRecords()[i];
        if (nr.getSheetNumber() == sheetNum1Based) {
            nr.setSheetNumber(0);
        }
    }
    if (linkTable != null) {
        for (int i = sheetIndex + 1;
        i < getNumNames()+1;
        i++) {
            linkTable.removeSheet(i);
        }
    }
}
}