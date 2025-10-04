import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    HSSFComment comment = getCellComment();
    if (comment != null) {
        removeComment(comment);
    }
}
}