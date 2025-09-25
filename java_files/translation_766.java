import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2 = getSheet().findCellComment(record.getRow(), record.getColumn());
    comment = null;
    if (null == comment2) {
        return;
    }
    ((HSSFPatriarch)getDrawingPatriarch()).removeShape(comment2);
}
}