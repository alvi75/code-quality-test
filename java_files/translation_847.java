import java.util.*;

public class Translationtranslation_847 {
    public HSSFCell getCell(int cellnum) {
        short shortCellNum = (short)cellnum;
        if (shortCellNum > 0x7FFF) {
            throw new IllegalArgumentException("Illegal Cell Num " + cellnum);
        }
        return getCell((short)cellnum);
    }
}