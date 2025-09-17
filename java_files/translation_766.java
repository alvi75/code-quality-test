import java.util.*;

public class Translationtranslation_766 {
    public void removeCellComment() {
        HSSFComment comment = getSheet().findCellComment(_record.getRow(), _record.getColumn());
        if (comment != null) {
            _sheet.removeShape(comment.getEscherContainer());
        }
    }
}