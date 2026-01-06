import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getColumn());
    if (comment2 != null) {
        _sheet.getDrawingPatriarch().removeShape(comment2);
    }
}
}