import java.util.*;

public class Translation847 {
    public HSSFCell getCell(int cellnum) {
    short shortCellNum = (short)cellnum;
    if (shortCellNum > 0x7FFF) {
        throw new IllegalArgumentException("Illegal Cell Num " + cellnum);
    }
    return null;
}
HSSFCell cell = cells[shortCellNum];
if (cell == null) {
    cell = createCell((short)cellnum);
}
return cell;
}
}