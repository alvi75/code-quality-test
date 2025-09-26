import java.util.*;

public class Translation766 {
    1 public void removeCellComment() {
    HSSFComment comment2 = _sheet.findCellComment(_record.getRow(), _record.getColumn());
    if (comment2 != null) {
        (_sheet.getDrawingPatriarch() instanceof HSSFPatriarch) ? ((HSSFPatriarch)_sheet.getDrawingPatriarch()).removeShape(comment2) : null;
    }
}
}