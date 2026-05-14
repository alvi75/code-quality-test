import java.util.*;

public class Translation766 {
    public void removeCellComment() {
    if(cell instanceof HSSFCell) {
        HSSFCell c = (HSSFCell)cell;
        HSSFComment comment = c.getComment();
        if(comment != null) {
            c.removeComment();
        }
    }
}
}