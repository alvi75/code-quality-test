import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2 = _sheet.findCellComment(getRow(), getColumn());
    if(null != comment2) {
        _sheet.removeShape(comment2);
        _sheet.removeObjRecord((EscherClientAnchorRecord)comment2.getClientAnchor());
    }
}
}