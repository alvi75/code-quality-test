import java.util.*;

public class Translation847 {
    public Cell getCell(int cellnum) {
    short ucellnum = (short) cellnum & 0x0000FFFF;
    return getCell(ucellnum);
}
}