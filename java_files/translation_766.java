import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2 = sheet.findCellComment(record.getRow(), record.getColumn());
    comment = null;
    if (null == comment2) {
        return;
    }
    ((HSSFPatriarch) sheet.getDrawingPatriarch()).removeShape(comment2);
}
}