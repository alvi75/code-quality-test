import java.util.*;

public class Translation466 {
    public int readUByte() {
    checkPosition(1);
    return _buf[_readIndex++] & 0xFF;
}
Create a new class called "CellRangeAddress" with the following properties: - firstRow - lastRow - firstCol - lastCol - isSingleCell - createEmpty() - copyFrom(CellRangeAddress other) - getEnclosingCellRangeAddressList(List<CellRangeAddress> ranges) {
    Iterator<CellRangeAddress> it = ranges.iterator();
    CellRangeAddress cras[] = new CellRangeAddress[it.size()];
    it.toArray(cras);
    return new CellRangeAddress(cras);
}
}