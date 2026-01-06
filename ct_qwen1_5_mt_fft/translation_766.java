import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment2 = getSheet().findCellComment(getRow(), getColumn());
    if (null == comment2) {
        return;
    }
    getSheet().removeCellComment(comment2);
}
}