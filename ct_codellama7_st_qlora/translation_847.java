import java.util.*;

public class Translation847 {
    public HSSFCell getCell(short cellnum) {
    int ushortCellNum = cellnum & 0x0000FFFF;
    return getCell(ushortCellNum);
}
}