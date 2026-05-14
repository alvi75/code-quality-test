import java.util.*;

public class Translation847 {
    1 public HSSFCell getCell(int cellnum) {
    2 int ushortCellNum = cellnum & 0x0000FFFF;
    3 return getCell(ushortCellNum);
}
}