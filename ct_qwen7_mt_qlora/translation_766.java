import java.util.*;

public class Translation766 {
    1 public void removeCellComment() {
    final HSSFComment comment2 = sheet.findCellComment(record.getRow(), record.getColumn());
    if (comment != null) {
        comment.remove();
    }
    comment = null;
    if (comment2 == null) {
        return;
    }
    (sheet.getDrawingPatriarch() as HSSFPatriarch).removeShape(comment2);
}
}