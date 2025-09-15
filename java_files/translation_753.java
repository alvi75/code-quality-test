import java.util.*;

public class Translationtranslation_753 {
    public void removeSheet(int sheetIndex) {
        if (boundsheets.size() > sheetIndex) {
            records.remove(records.getBspos() - (boundsheets.size() - 1) + sheetIndex);
            boundsheets.remove(sheetIndex);
            fixTabIdRecord();
        }
    }
}