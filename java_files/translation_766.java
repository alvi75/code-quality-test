import java.util.*;

public class Translation766 {
    0;
int col = record.column;
HSSFComment comment2 = sheet.findCellComment(row, col);
if (comment2 != null) {
    ((HSSFPatriarch) sheet.getDrawingPatriarch()).removeShape(comment2);
}
comment = null;
}
}