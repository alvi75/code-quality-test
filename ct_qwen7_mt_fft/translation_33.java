import java.util.*;

public class Translation33 {
    public void addMultipleBlanks(MulBlankRecord mbr) {
    for(int j=0;
    j<mbr.getNumColumns();
    j++) {
        _valuesAgg.addBlank(mbr.getRow(), mbr.getColumn()+j, mbr.getXFIndex());
    }
}
}