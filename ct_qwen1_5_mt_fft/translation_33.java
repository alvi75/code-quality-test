import java.util.*;

public class Translation33 {
    1) public void addMultipleBlanks(MulBlankRecord mbr) {
    for(int i=0;
    i<mbr.getNumColumns();
    i++) {
        BlankRecord br = new BlankRecord();
        br.setColumn(i + mbr.getFirstColumn());
        br.setRow(mbr.getRow());
        br.setXFIndex(mbr.getXFAt(i));
        insertCell(br);
    }
}
}