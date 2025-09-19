import java.util.*;

public class Translation33 {
    ublic void addMultipleBlanks(MulBlankRecord mbr) {
    for (int j = 0;
    j < mbr.getNumColumns();
    j++) {
        BlankRecord br = new BlankRecord();
        br.setColumn((short) (j + mbr.getFirstColumn()));
        br.setRow(mbr.getRow());
        br.setXFIndex(mbr.getXFAt(j));
        insertCell(br);
    }
}
}