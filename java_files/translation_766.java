import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2=_sheet.findCellComment(_record.getRow(),_record.getColumn());
    comment=null;
    if (null==comment2) return;
    ((HSSFPatriarch)_sheet.getDrawingPatriarch()).removeShape(comment2);
}
}