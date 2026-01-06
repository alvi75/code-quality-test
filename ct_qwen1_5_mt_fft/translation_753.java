import java.util.*;

public class Translation753 {
    public void removeSheet(int sheetIndex) {
    if(boundsheets.size() > sheetIndex) {
        records.remove(records.bspos-(boundsheets.size()-1)+sheetIndex);
        boundsheets.remove(sheetIndex);
        fixTabidrecord();
    }
    final int sheetnum= sheetIndex+1;
    for(int i=0;
    i<getNumNames();
    i++) {
        NameRecord nr = getNameRecord(i);
        if(nr.getSheetNumber()==sheetnum) {
            nr.setSheetNumber(0);
        }
        else if(nr.getSheetNumber()>sheetnum) {
            nr.setSheetNumber(nr.getSheetNumber() - 1);
        }
    }
    if(linkTable!=null) {
        for(int i=sheetIndex+1;
        i<=getNumSheets();
        i++) {
            linkTable.removeSheet(i);
        }
    }
}
}