import java.util.*;

public class Translation766 {
    ublic void removeCellComment() {
    HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getColumn());
    if (null != comment2) {
        _sheet.getDrawingPatriarch().removeShape(comment2);
    }
}
}