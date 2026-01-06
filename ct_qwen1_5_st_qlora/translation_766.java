import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment = _sheet.findCellComment(_record.getRow(), _record.getColumn());
    if (comment != null) {
        _sheet.getDrawingPatriarch().removeShape(comment);
    }
    else{
        return;
    }
    _sheet.removeCellComment(_record);
}
}