import java.util.*;

public class Translationtranslation_766 {
    public void removeCellComment() {
        HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getColumn());
        comment = null;
        if(null == comment2) {
            return;
        }
        removeShape(comment2);
    }
}